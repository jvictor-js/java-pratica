package aulajava;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		/*int n1 = 3;
		int n2 = 5;
		float m = (n1 + n2) / 2;
		System.out.println("A média é igual a: " + m);
		*/
		
		/*int numero = 5;
		System.out.println(numero);
		int valor = 5 + numero++;
		System.out.println(valor);
		System.out.println(numero);*/
		
		/*int x = 4;
		x *= 2;
		System.out.println(x);*/
		
		/*Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = teclado.nextInt();
		
		System.out.println("Digite mais um número: ");
		int n2 = teclado.nextInt();
		
		float div = n1 / n2;
		float res = (float) Math.sqrt(n1);
		
		System.out.printf("A raiz de %d é igual a %.2f! \n", n1, res);
		
		System.out.printf("A divisão entre %d e %d é igual a %.2f! \n", n1, n2, div);*/
		
		/*float v = 8.5f;
		int arbaixo = (int) Math.floor(v); // arredondamento pra baixo, EX: 8,3 = 8.
		System.out.println(arbaixo);
		
		int arcima = (int) Math.ceil(v); // arredondamento pra cima, EX: 8,3 = 9.
		System.out.println(arcima);
		
		int arnormal = (int) Math.round(v); // arredondamento normal, EX: 8,5 = 9.
		System.out.println(arnormal);*/
		
		double ale = Math.random(); // gera um número double aleatório entre 0.0 e 1.0
		int n = (int) (15 + ale * (50-15)); // gera um número aleatório entre 15 e 50
		System.out.println(n);
		
	}

}
