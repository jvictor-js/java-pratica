package praticaprova;

import java.util.Scanner;

public class AlunoArray {
	private String nome;
	private int idade;
	
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
	
	public void registrandoAlunos() {
		System.out.println("--- Registrando Alunos ---");
		System.out.println("Informe o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Informe a idade: ");
		idade = scN.nextInt();
	}
	
}
