package aulajava;

public class OperadorTernario {

	public static void main(String[] args) {
		int n1, n2, r;
		n1 = 14;
		n2 = 8;
		r = (n1 > n2) ? n1+n2 : n1-n2; // atribui um valor ou outro pra mesma variável, dependendo do resultado da primeira expressão (ternário)
		System.out.println(r);

	}

}
