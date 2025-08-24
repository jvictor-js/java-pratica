package aulajava;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe um valor: ");
		int numero = teclado.nextInt();
		
		int rest = numero % 2;
		double elevcub = (double) Math.pow(numero, 3);
		int raizq = (int) Math.sqrt(numero);
		float raizc = (float) Math.cbrt(numero);
		int abs = Math.abs(numero);
		
		System.out.println("Resto da divisão por 2: " + rest);
		System.out.printf("Elevado ao Cubo: %.2f \n", elevcub);
		System.out.println("Raiz Quadrada: " + raizq);
		System.out.printf("Raiz Cúbica: %.2f \n", raizc);
		System.out.println("Valor Absoluto: " + abs);
	}

}
