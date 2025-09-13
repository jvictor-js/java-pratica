package manipulacaodestrings;

import java.util.Scanner;

public class MainStringExercicio {

	
	public static void menu() {
		System.out.println("--- Opções de manipulação de Strings ---");
		System.out.println("1 - Imprimir o tamanho da String S1");
		System.out.println("2 - Comparar a String S1 com uma nova String fornecida pelo usuário e imprimir o resultado da comparação");
		System.out.println("3 - Concatenar a String S1 com uma nova String S2 e imprimir na tela o resultado da concatenação");
		System.out.println("4 - Imprimir a String S1 de forma inversa");
		System.out.println("0 - Sair do programa");
	}
	
	public static String lerString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe uma nova String: ");
		String novaString = sc.nextLine();
		return novaString;
	}
	
	public static String novaString() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a String S2: ");
		String stringS2 = sc.nextLine();
		return stringS2;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int escolha;
		do {
			menu();
			System.out.println("Informe sua escolha: ");
			escolha = sc.nextInt();
			switch (escolha) {
			case 1:
				int tamanho = lerString().length();
				System.out.println("O tamanho da String S1 é: " + tamanho);
				break;
			case 2:
				if (lerString().equalsIgnoreCase(novaString())) {
					System.out.println("As Strings são iguais!");
				} else {
					System.out.println("As Strings são diferentes!");
				}
				break;
			case 3:
				String stringConcatenada = lerString().concat(novaString());
				System.out.println("A string concatenada fica da seguinte maneira: " + stringConcatenada);
				break;
			case 4:
				char[] stringInversa = lerString().toCharArray();
				for (int i = stringInversa.length-1; i >= 0; i--) {
					System.out.print(stringInversa[i]);
				}
				System.out.println("");
				break;
			case 0:
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while (escolha != 0);
		
		sc.close();
		
	}

}
