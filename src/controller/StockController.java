package controller;

import java.util.ArrayList;

import model.Product;
import repository.StockRepository;
import util.Strings;

public class StockController implements StockRepository {
	
	private ArrayList<Product> listaProdutos = new ArrayList<Product>();
	private ArrayList<Product> carrinho = new ArrayList<Product>();

	@Override
	public void procurarProduto(String nomeOuId) {
		Product localizado = buscarNaCollection(nomeOuId);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, nomeOuId);
		else localizado.visualizar();
	}

	@Override
	public void listarTodos() {
		if (listaProdutos.size() == 0) {
			System.out.println(Strings.STOCK_NO_PRODUCTS);
			return;
		}

		for (var product : listaProdutos) {
			product.visualizar();
			System.out.println("-".repeat(30) + "\n");
		}
	}

	@Override
	public void cadastrarProduto(Product product) {
		listaProdutos.add(product);
		System.out.printf(Strings.STOCK_NEW_PRODUCT, product.getName(), product.getId());
	}

	@Override
	public void atualizarProduto(Product product) {
		var localizado = buscarNaCollection(product.getId());
		
		if (localizado == null) System.out.println(Strings.PRODUCT_NOT_FOUND);
		else {
			listaProdutos.set(listaProdutos.indexOf(localizado), product);
			System.out.printf(Strings.PRODUCT_UPDATED, localizado.getId());
		}
	}

	@Override
	public void deletarProduto(int numero) {
		var localizado = buscarNaCollection(numero);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, numero);
		else {
			listaProdutos.remove(listaProdutos.indexOf(localizado));
			System.out.printf(Strings.PRODUCT_REMOVED, localizado.getName());
		}
	}

	@Override
	public void adicionarAoCarrinho(String nomeOuId, int quantity) {
		Product localizado = buscarNaCollection(nomeOuId);
		
		if (localizado == null) {
			System.out.printf(Strings.PRODUCT_NOT_FOUND, nomeOuId);
			return;
		}
		if (quantity <= localizado.getQuantity()) {
			Product productUpdated = localizado;
			
			int index = listaProdutos.indexOf(localizado);
			int newQuantity = productUpdated.getQuantity() - quantity;
			
			localizado.setQuantity(quantity);
			productUpdated.setQuantity(newQuantity);
			
			listaProdutos.set(index, productUpdated);
			carrinho.add(localizado);
			System.out.printf(Strings.CART_ITEM_ADD, quantity, localizado.getName());
			
			return;
		} else {
			System.out.printf(Strings.STOCK_OUT, localizado.getQuantity());
		}
	}

	@Override
	public void verCarrinho() {
		if (carrinho.size() == 0) {
			System.out.println(Strings.EMPTY_CART);
			return;
		}
		
		int index = 0;
		
		System.out.println("Mostrando todos os itens do seu carrinho:");
		for (Product produto : carrinho) {
			index++;
			System.out.println(index + " - " + produto.getName());
			System.out.println("R$" + produto.getValue());
		}
		
		System.out.println();
	}

	@Override
	public void removerDoCarrinho(int item) {
		if (carrinho.size() == 0) {
			System.out.printf(Strings.EMPTY_CART);
			return;
		}
		if (item > carrinho.size() || item <= 0) System.out.println(Strings.INVALID_OPTION);
		else carrinho.remove(item - 1);
	}

	@Override
	public void finalizarCompra() {
		int valorTotal = 0;
		
		verCarrinho();
		
		for (Product i : carrinho) {
			valorTotal += i.getValue();
		}
		
		System.out.printf("O valor total de sua compra foi R$.2f\n", valorTotal);
	}
	
	public Product buscarNaCollection(int numero) {
		for (var product : listaProdutos) {
			if (product.getId() == numero) {
				return product;
			}
		}
		return null;
	}
	
	public Product buscarNaCollection(String name) {
		
		try {
			var id = Integer.parseInt(name);
			
			for (var product : listaProdutos) {
				if (product.getId() == id) {
					return product;
				}
			}
		}
		catch (Exception e) {}
		
		for (var product : listaProdutos) {
			if (product.getName().equalsIgnoreCase(name)) {
				return product;
			}
		}
		return null;
	}
}
