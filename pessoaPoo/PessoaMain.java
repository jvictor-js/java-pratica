package pessoaPoo;

import java.util.Scanner;

public class PessoaMain {

	
	public static void lerDados(Pessoa p) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome: ");
		p.setNome(sc.nextLine());
		
		System.out.println("Informe sua idade: ");
		p.setIdade(sc.nextInt());
		
		System.out.println("Informe sua altura: ");
		p.setAltura(sc.nextFloat());
		
	}
	
	public static void mostrarDados(Pessoa p) {
		System.out.println("Nome: " + p.getNome());
		System.out.println("Idade: " + p.getIdade());
		System.out.println("Altura: " + p.getAltura());
	}
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		lerDados(p1);
		lerDados(p2);
		
		mostrarDados(p1);
		mostrarDados(p2);
		
		
	}

}
