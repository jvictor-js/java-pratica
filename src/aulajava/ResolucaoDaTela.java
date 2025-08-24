package aulajava;

import java.awt.Dimension;
import java.awt.Toolkit;


public class ResolucaoDaTela {

	public static void main(String[] args) {
		Toolkit tela = Toolkit.getDefaultToolkit();
		Dimension dimensao = tela.getScreenSize();
		System.out.println("A resolução da tela é: " + dimensao.width + " x " + dimensao.height);
	}

}
