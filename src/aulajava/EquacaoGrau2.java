package aulajava;

import java.util.Scanner;

public class EquacaoGrau2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número para o primeiro coeficiente: ");
		int coeficiente_a = scan.nextInt();
		System.out.println("Digite um número para o segundo coeficiente: ");
		int coeficiente_b = scan.nextInt();
		System.out.println("Digite um número para o terceiro coeficiente: ");
		int coeficiente_c = scan.nextInt();

		double delta = Math.pow(coeficiente_a, 2) - 4 * coeficiente_b * coeficiente_c;
		System.out.printf("Δ = %d² - 4 . %d . %d \n", coeficiente_a, coeficiente_b, coeficiente_c);
		System.out.printf("Δ = %.2f \n", delta);

		if (delta < 0) {
			System.out.println("Tipo = Não Existem Raízes Reais");
		} else {
			System.out.println("Tipo = Existem Raízes Reais");
		}
	}

}
