package manipulacaodestrings;

import java.util.Scanner;

public class StringExercicioEmPoo {
	
	private String s1;
	private String s2;
	private int escolha;
	
	
	
	public String getS1() {
		return s1;
	}

	public void setS1(String s1) {
		this.s1 = s1;
	}

	public String getS2() {
		return s2;
	}

	public void setS2(String s2) {
		this.s2 = s2;
	}

	public int getEscolha() {
		return escolha;
	}

	public void setEscolha(int escolha) {
		this.escolha = escolha;
	}

	Scanner sc = new Scanner(System.in);
	
	public void menu() {
		System.out.println("--- Opções de manipulação de Strings ---");
		System.out.println("1 - Imprimir o tamanho da String S1");
		System.out.println("2 - Comparar a String S1 com uma nova String fornecida pelo usuário e imprimir o resultado da comparação");
		System.out.println("3 - Concatenar a String S1 com uma nova String S2 e imprimir na tela o resultado da concatenação");
		System.out.println("4 - Imprimir a String S1 de forma inversa");
		System.out.println("5 - Verificar se a String S1 começa com UE");
		System.out.println("0 - Sair do programa");
	}
	
	public void escolhaUsuario() {
		System.out.println("Informe uma String: ");
		s1 = sc.nextLine();
		do {
			menu();
			System.out.println("Informe sua escolha: ");
			escolha = sc.nextInt();
			sc.nextLine();
			switch (escolha) {
			case 1:
				int tamanho = s1.length();
				System.out.println("O tamanho da String S1 é: " + tamanho);
				break;
			case 2:
				System.out.println("Informe uma nova string: ");
				s2 = sc.nextLine();
				if (s1.equals(s2)) {
					System.out.println("As Strings são iguais!");
				} else {
					System.out.println("As Strings são diferentes!");
				}
				break;
			case 3:
				System.out.println("Informe uma nova string: ");
				s2 = sc.nextLine();
				String stringConcatenada = s1.concat(s2);
				System.out.println("A string concatenada fica da seguinte maneira: " + stringConcatenada);
				break;
			case 4:
				char[] stringInversa = s1.toCharArray();
				for (int i = stringInversa.length-1; i >= 0; i--) {
					System.out.print(stringInversa[i]);
				}
				System.out.println("");
				break;
			case 5:
				if (s1.length() < 2) {
					System.out.println("String inválida!");
				} else {
					if (Character.toUpperCase(s1.charAt(0)) ==  'U' && Character.toUpperCase(s1.charAt(1)) == 'E') {
						System.out.println("A string S1 começa com UE");
					} else {
						System.out.println("A string S1 não começa com UE");
					}
				}
				break;
			case 0:
				System.out.println("Encerrando programa...");
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
			
		} while (escolha != 0);
	}
	
}
