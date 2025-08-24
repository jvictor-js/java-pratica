package aulajava;

import java.util.Scanner;

public class VotoEleitoral {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe sua idade: ");
		int idade = teclado.nextInt();
		String voto;
		voto = ((idade >= 16 && idade < 18) || (idade >= 65)) ? "Voto opcional!" : "Voto Obrigatório!";
		System.out.println(voto);
	}

}
