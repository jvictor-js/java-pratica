package aulajava;

import java.util.Scanner;

public class SomaNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		int n = scan.nextInt();
		
		int soma = 0;
		
		for (int i = 1; i <= n; i++) {
			soma += i;
		}
		System.out.println("Soma: " + soma);

	}

}
