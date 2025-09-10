package encapsulamento;

public class Pedido {
	private Cliente cliente;
	private ProdutoEncapsulado produto;
	
	Pedido(){
		this.produto = new ProdutoEncapsulado();
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ProdutoEncapsulado getProduto() {
		return produto;
	}
	public void setProduto(ProdutoEncapsulado produto) {
		this.produto = produto;
	}
	
	public void produtoPedido(){	
		produto.adicionarProdutos();
		produto.comprar();
		System.out.println("Pedido Realizado!");
	}
}
