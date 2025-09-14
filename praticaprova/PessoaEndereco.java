package praticaprova;

import java.util.Scanner;

public class PessoaEndereco {
	private String nome;
	private int idade;
	private Endereco endereco = new Endereco();

	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void addPessoa() {
		System.out.println("--- Cadastrando Pessoa ---");
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.println("Informe sua idade: ");
		idade = scN.nextInt();
		endereco.addEndereco();
	}
	
	public void exibirInformacoes() {
		System.out.println("--- Informações da Pessoa ---");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Rua: " + endereco.getRua());
		System.out.println("Cidade: " + endereco.getCidade());
		System.out.println("Cep: " + endereco.getCep());
	}
	
}
