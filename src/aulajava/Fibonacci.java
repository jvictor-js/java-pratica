package aulajava;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int fib = sc.nextInt();
		int a = 0;
		int b = 1;
		for (int i = 0; i <= fib; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
		sc.close();
	}

}
