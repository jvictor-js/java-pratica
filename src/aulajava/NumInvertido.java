package aulajava;

import java.util.Scanner;

public class NumInvertido {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		int num = sc.nextInt();
		int invertido = 0;
		int resto;
		String str1 = Integer.toString(num);
		for (int i = 0; i < str1.length(); i++) {
			resto = num % 10;
			num /= 10;
			invertido = invertido * 10 + resto;
		}
		System.out.println(invertido);
		sc.close();
	}

}
