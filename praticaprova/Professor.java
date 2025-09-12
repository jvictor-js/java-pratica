package praticaprova;

import java.util.Scanner;

public class Professor {
	private String nome;
	private String disciplina;
	
	Scanner sc = new Scanner(System.in);
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public void registrandoProfessor() {
		System.out.println("--- Registrando professor ---");
		System.out.println("Qual seu nome: ");
		nome = sc.nextLine();
		System.out.println("Qual a disciplina que você ensina: ");
		disciplina = sc.nextLine();
	}
	
	public void exibindoProfessor() {
		System.out.println("--- Exibindo Professor ---");
		System.out.println("Nome: " + nome);
		System.out.println("Disciplina: " + disciplina);
	}
	
}
