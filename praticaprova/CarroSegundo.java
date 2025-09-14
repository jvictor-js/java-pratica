package praticaprova;

import java.util.Scanner;

public class CarroSegundo {
	private String marca;
	private String modelo;
	private Motor motor = new Motor();
	
	Scanner sc = new Scanner(System.in);
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	
	public void addCarro() {
		System.out.println("--- Registrando carro ---");
		System.out.println("Informa a marca do carro: ");;
		marca = sc.nextLine();
		System.out.println("Informe seu modelo: ");
		modelo = sc.nextLine();
		motor.addMotor();
	}
	
	public void informacoesCarro() {
		System.out.println("--- Informações do Carro ---");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Potência do motor: " + motor.getPotencia());
		System.out.println("Tipo de motor: " + motor.getTipo());
	}
	
}
