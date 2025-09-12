package praticaprova;

public class MainLivro {

	public static void main(String[] args) {
		Livro livro1 = new Livro();
		Livro livro2 = new Livro();
		
		System.out.println("--- Livro 1 ---");
		livro1.registrarInformacoes();
		livro1.exibirInformacoes();
		
		System.out.println("--- Livro 2 ---");
		livro2.registrarInformacoes();
		livro2.exibirInformacoes();

	}

}
