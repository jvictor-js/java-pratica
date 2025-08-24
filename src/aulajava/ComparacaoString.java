package aulajava;


public class ComparacaoString {

	public static void main(String[] args) {
		
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo");
		String res;
		res = (nome1 == nome2) ? "iguais" : "diferentes"; // nome3 é diferente de nome1 e nome2, mesmo o conteúdo sendo igual, pois a estruturas dos objetos é diferente, para comparar o conteúdo de cada objetos usa-se o método .equals, ex: nome1.equals(nome3).
		
		System.out.println(res);
	}

}
