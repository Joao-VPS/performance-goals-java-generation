package repository;

import model.Product;

public interface StockRepository {
	//CRUD do Estoque
	public void procurarProduto(String name);
	public void listarTodos();
	public void cadastrarProduto(Product product);
	public void atualizarProduto(Product product);
	public void deletarProduto(int numero);

	// Métodos do carrinho
	public void adicionarAoCarrinho(String nomeOuId, int quantity);
	public void verCarrinho();
	public void removerDoCarrinho(int numero);
	public void finalizarCompra();
}
