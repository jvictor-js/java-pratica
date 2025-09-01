package aulajava;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número para receber seu fatorial: ");
		
		int fatorial = scan.nextInt();
		
		if (fatorial < 0) {
			System.out.println("Não existe fatorial de números negativos!");
		} else {
			int fat = 1;
			
			for (int i = fatorial; i >= 1; i--) {
				fat *= i;
				if (i > 1) {
					System.out.print(i);
					System.out.printf(" x ");
					
				} else {
					System.out.println("1 = " + fat);
				}
		}
		
		}
	}

}
