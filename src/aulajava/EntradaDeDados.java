package aulajava;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Quasl seu nome? ");
		String nome = teclado.nextLine();
		
		System.out.print("Qual a sua nota? ");
		float nota = teclado.nextFloat();
		
		System.out.printf("A nota de %s é %.2f \n", nome, nota); 
	}

}
