package aulajava;

import java.util.Locale;

public class IdiomaDoSistema {

	public static void main(String[] args) {
		Locale linguagem =  Locale.getDefault();
		System.out.printf("Seu sistema está em ");
		System.out.println(linguagem.getDisplayLanguage());

	}

}
