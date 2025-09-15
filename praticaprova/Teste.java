package praticaprova;

import java.util.Scanner;

public class Teste {
	private String str1;
	private String escolha;
	
	Scanner sc = new Scanner(System.in);

	public String getStr1(){
		return str1;
	}

	public void setStr1(String str1){
		this.str1 = str1;
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha){
		this.escolha = escolha;
	}

	public void menu(){
		System.out.println("--- Manipulação de String ---");
		System.out.println("A - imprimir o tamanho da String");
		System.out.println("B - Comparar a String S1 com uma nova fornecida pelo usuário e imprimir o resultado da comparação");
		System.out.println("C - Concatenar a String S1 com uma nova String S2 e imprimir na tela o resultado da concatenação");
		System.out.println("D - Imprimir a String  S1 de forma inversa");
		System.out.println("E - Verificar se a String S1 começa com UE");
		System.out.println("F - Encerrar programa");
	}

	public void imprimirTamanhoS1(){
		System.out.println("O tamanho da string S1 é igual a: " + str1.length());
	}

	public void comparaStrings(){
		String s2OpcaoB;
		System.out.println("Informe a nova String S2: ");
		s2OpcaoB = sc.nextLine();
		if (str1.equalsIgnoreCase(s2OpcaoB)) {
			System.out.println("As strings são iguais!");
		} else {
			System.out.println("As strings não são iguais!");
		}
	}

	public void concatenaString(){
		String s2OpcaoC;
		String strConcatenada;
		System.out.println("Informe a nova String S2: ");
		s2OpcaoC= sc.nextLine();
		strConcatenada = str1 + s2OpcaoC;
		System.out.println("A string concatenada fica da seguinte forma: " + strConcatenada);

	}

	public void imprimeInversa(){
		System.out.print("String invertida: ");
		char[] strInversa = str1.toCharArray();
		for (int i = strInversa.length - 1; i >= 0; i--){
			System.out.print(strInversa[i]);
		}
		System.out.println();
		
	}

	public void verificaUE(){
		if (str1.length() < 2){
			System.out.println("A string é muita pequena");
		} else if (str1.toUpperCase().charAt(0) == 'U' && str1.toUpperCase().charAt(1) == 'E'){
			System.out.println("A string começa com UE");
		} else {
			System.out.println("A string não começa com UE");
		}
	}

	public void escolhaMenu(){
		System.out.println("Informe uma String: ");
		str1 = sc.nextLine();
		do {
			menu();
			System.out.println("Informe sua escolha: ");
			escolha = sc.nextLine();
			switch(escolha.toUpperCase()){
				case "A":
					imprimirTamanhoS1();
					break;
				case "B":
					comparaStrings();
					break;
				case "C":
					concatenaString();
					break;
				case "D":
					imprimeInversa();
					break;
				case "E":
					verificaUE();
					break;
				case "F":
					System.out.println("Encerrando programa...");
					break;
				default:
					System.out.println("Escolha inválida");
					break;
			}
		} while(!escolha.equalsIgnoreCase("F"));
	}

}
