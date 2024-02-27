package controller;

import java.util.ArrayList;

import model.Product;
import repository.StockRepository;
import util.Strings;

public class StockController implements StockRepository {
	
	private ArrayList<Product> listaProdutos = new ArrayList<Product>();
	private ArrayList<Product> carrinho = new ArrayList<Product>();
	
	@Override
	public void procurarPorCodigo(int id) {
		Product localizado = buscarNaCollection(id);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, id);
		else localizado.visualizar();
	}
	
	@Override
	public void procurarPorNome(String nome) {
		Product localizado = buscarNaCollection(nome);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, nome);
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
		
		if (localizado == null) System.out.println(Strings.PRODUCT_NOT_FOUND);
		else {
			listaProdutos.remove(listaProdutos.indexOf(localizado));
			System.out.printf(Strings.PRODUCT_REMOVED, localizado.getName());
		}
	}

	@Override
	public void adicionarAoCarrinho(int numero) {
		Product localizado = buscarNaCollection(numero);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, numero);
		else carrinho.add(localizado);
	}
	
	@Override
	public void adicionarAoCarrinho(String name) {
		Product localizado = buscarNaCollection(name);
		
		if (localizado == null) System.out.printf(Strings.PRODUCT_NOT_FOUND, name);
		else carrinho.add(localizado);
	}

	@Override
	public void verCarrinho() {
		if (carrinho.size() == 0) {
			System.out.println(Strings.EMPTY_CART);
			return;
		}
		
		System.out.println("Mostrando todos os itens do seu carrinho:");
		for (int i = 1; i < carrinho.size(); i++) {
			System.out.println(i + " - " + carrinho.get(i).getName());
			System.out.println("R$" + carrinho.get(i).getValue());
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
	public void finalizarCompra(int numeroOrigem, int numeroDestino, float valor) {
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
		for (var product : listaProdutos) {
			if (product.getName() == name) {
				return product;
			}
		}
		return null;
	}
}
