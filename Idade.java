package aulajava;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o ano em que você nasceu: ");
		int nascimento = scan.nextInt();
		
		int idade = 2025 - nascimento;
		
		System.out.printf("Você tem %d anos! \n", idade);
		if (idade < 18) {
			System.out.println("Você é de menor!");
		} else {
			System.out.println("Você é de maior!");
		}

	}

}
