package aulajava;

import java.util.Scanner;

public class AdivinhandoNumeros {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Estou pensando em um número de 1 a 5! Tente adivinhar qual: ");
		int escolhausuario = scan.nextInt();
		int escolhadopc = (int) (1 + Math.random() * (6-1));
		String res = (escolhausuario == escolhadopc) ? "Acertou!!" : "Errou!! Eu pensei em " + escolhadopc;
		System.out.println(res);
	}

}
