package aulajava;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		
		int num = scan.nextInt();
		
		if (num % 2 == 0) {
			System.out.printf("O número %d é par!", num);
		} else {
			System.out.printf("O número %d é ímpar!", num);
		}
	}

}
