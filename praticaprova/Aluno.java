package praticaprova;

import java.util.Scanner;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota;
	
	Scanner sc = new Scanner(System.in);
	Scanner scN = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	public void registrandoAluno() {
		System.out.println("--- Registrando Aluno ---");
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.println("Informe sua matrícula: ");
		matricula = scN.nextInt();
		System.out.println("Informe sua nota: ");
		nota = scN.nextDouble();
	}
	
	public void exibindoAluno() {
		System.out.println("--- Exibindo Aluno ---");
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + matricula);
		System.out.println("Nota: " + nota);
	}
}
