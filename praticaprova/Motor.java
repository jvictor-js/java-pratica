package praticaprova;

import java.util.Scanner;

public class Motor {
	private String potencia;
	private String tipo;
	
	Scanner sc = new Scanner(System.in);
	
	public String getPotencia() {
		return potencia;
	}
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void addMotor() {
		System.out.println("Informe a potência do motor: ");
		potencia = sc.nextLine();
		System.out.println("Informe o tipo do motor: ");
		tipo = sc.nextLine();
	}
	
}
