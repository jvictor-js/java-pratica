package encapsulamento;

public class ProdutoEncapsuladoMain {
	public static void main(String[] args) {
		ProdutoEncapsulado p = new ProdutoEncapsulado();
		
		p.adicionarProdutos();
		p.comprar();
		p.calcularValorEmEstoque();
		p.repor();
		p.calcularValorEmEstoque();
	}
}
