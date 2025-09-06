package alunos;

import java.util.Scanner;

public class Aluno {
	String nome;
	int matricula;
	double nota1;
	double nota2;
	
	Scanner sc = new Scanner(System.in);
	Scanner scM = new Scanner(System.in);
	
	
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
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	public void registroAluno(){
		System.out.println("--- Registro aluno ---");
		System.out.println("Informe o nome do aluno: ");
		nome = sc.nextLine();
		System.out.println("Informe o número de sua matrícula: ");
		matricula = scM.nextInt();
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = scM.nextDouble();
		System.out.println("Informe a segunda nota do aluno: ");
		nota2 = scM.nextDouble();
	}
		
	public void situacaoAluno() {
		double media = (nota1 + nota2) / 2;
		if (media >= 7) {
			System.out.printf("Média: %.1f. O aluno está aprovado!", media);
		} else {
			System.out.printf("Média: %.1f. O aluno está reprovado!", media);
		}
	}
	
}
