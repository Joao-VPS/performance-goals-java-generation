package repository;

import model.Product;

public interface StockRepository {
	//CRUD do Estoque
	public void procurarPorCodigo(int numero);
	public void procurarPorNome(String name);
	public void listarTodos();
	public void cadastrarProduto(Product product);
	public void atualizarProduto(Product product);
	public void deletarProduto(int numero);

	// Métodos do carrinho
	public void adicionarAoCarrinho(int numero);
	public void adicionarAoCarrinho(String name);
	public void verCarrinho();
	public void removerDoCarrinho(int numero);
	public void finalizarCompra(int numeroOrigem, int numeroDestino, float valor);
}
