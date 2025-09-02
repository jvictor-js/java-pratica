package aulajava;

import java.util.Scanner;

public class NumPrimo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count > 2) {
			System.out.println("O número não é primo.");
		} else {
			System.out.println("O número é primo.");
		}
		sc.close();
	}

}
