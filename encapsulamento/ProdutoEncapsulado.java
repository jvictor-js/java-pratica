package encapsulamento;

import java.util.Scanner;

public class ProdutoEncapsulado {
	private String nome;
	private double preco;
	private int quantidade;
	
	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void adicionarProdutos() {
		System.out.println("--- Adicionando produtos ---");
		System.out.println("Informe o nome do produto: ");
		nome = sc.nextLine();
		System.out.println("Informe o preço do produto: ");
		preco = scN.nextDouble();
		System.out.println("Informe a quantidade: ");
		quantidade = scN.nextInt();
	}
	
	public void comprar() {
		char respostaC;
		int unidadesRequeridas;
		System.out.println("--- Comprando produtos ---");
		System.out.println("Deseja comprar alguma unidade? (S/N)");
		respostaC = sc.nextLine().toUpperCase().charAt(0);
		if (respostaC == 'S') {
			System.out.println("Quantas unidades planeja comprar? ");
			unidadesRequeridas = scN.nextInt();
			if (unidadesRequeridas > quantidade) {
				System.out.println("Quantidade insuficiente!");
			} else {
				quantidade -= unidadesRequeridas;
			}
		} else if (respostaC == 'N') {
			System.out.println("Está certo então!");
		} else {
			System.out.println("Reposta inválida!");
		}
	}
	
	public void repor() {
		char respostaR;
		int unidadesReposicao;
		System.out.println("--- Repondo produtos ---");
		System.out.println("Deseja repor unidades? (S/N)");
		respostaR = sc.nextLine().toUpperCase().charAt(0);
		if (respostaR == 'S') {
			System.out.println("Quantas unidades deseja repor? ");
			unidadesReposicao = scN.nextInt();
			if (unidadesReposicao < 0) {
				System.out.println("Valor inválido!");
			} else {
				quantidade += unidadesReposicao;
			}
		} else if (respostaR == 'N') {
			System.out.println("Está certo então!");
		} else {
			System.out.println("Resposta inválida!");
		}
	}
	
	public void calcularValorEmEstoque() {
		double valorTotal = quantidade * preco;
		System.out.println("Valor em estoque do produto: " + quantidade);
	}
	
}
