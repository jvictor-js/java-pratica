package aulajava;

import java.util.Scanner;

public class MaiorNumero {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num1 = scan.nextInt();
		System.out.println("Digite outro número: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.printf("O número %d é maior que o número %d \n", num1, num2);
		} else if (num1 == num2) {
			System.out.println("Os número são iguais!");
		} else {
			System.out.printf("O número %d é maior que o número %d", num2, num1);
		}
	}

}
