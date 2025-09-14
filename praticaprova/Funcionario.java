package praticaprova;

import java.util.Scanner;

public class Funcionario {
	private String nome;
	private double salario;
	
	Scanner sc = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void registrandoFuncionario() {
		System.out.println("Informe o nome do funcionário: ");
		nome = sc.nextLine();
		System.out.println("Informe seu salário: ");
		salario = sc.nextDouble();
		sc.nextLine();
	}
}
