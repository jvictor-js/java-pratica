package praticaprova;

import java.util.Scanner;

public class Livro {
	private String titulo;
	private String autor;
	private int anoDePublicacao;
	
	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}
	
	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}
	
	public void registrarInformacoes() {
		System.out.println("--- Registrando Livro ---");
		System.out.println("Informe o título do livro: ");
		titulo = sc.nextLine();
		System.out.println("Informe o nome do autor: ");
		autor = sc.nextLine();
		System.out.println("Informe o ano de publicação: ");
		anoDePublicacao = scN.nextInt();
	}
	
	public void exibirInformacoes() {
		System.out.println("--- Exibindo informações ---");
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicação: " + anoDePublicacao);
	}
	
}
