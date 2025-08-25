package aulajava;

import java.util.Scanner;

public class ProgramaMedia {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite sua primeira nota: ");
		float nota1 = scan.nextFloat();
		
		System.out.println("Digite sua segunda nota: ");
		float nota2 = scan.nextFloat();
		
		float media = (nota1 + nota2) /2;
		
		System.out.println("Sua média foi " + media);
		
		if (media > 9) {
			System.out.println("Parabéns!!");
		}
	}

}
