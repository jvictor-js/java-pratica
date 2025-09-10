package encapsulamento;

import java.util.Scanner;

public class ContaBancariaEncapsulada {
	private int numero;
	private String titular;
	private double saldo;
	
	Scanner sc = new Scanner(System.in);
	Scanner scn = new Scanner(System.in);
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void criarConta() {
		System.out.println("--- Criando conta ---");
		System.out.println("Informe o número da conta: ");
		numero = sc.nextInt();
		System.out.println("Informe o nome de titular: ");
		titular = scn.nextLine();
		System.out.println("Conta criada com sucesso! Esse é o seu saldo: " + saldo);
	}
	
	public void depositar() {
		double valor;
		System.out.println("--- Depositando ---");
		System.out.println("Informe um valor que deseja depositar: ");
		valor = sc.nextDouble();
		if (valor < 0) {
			System.out.println("Valor inválido!");
		} else {
			saldo += valor;
		}
	}
	
	public void sacar() {
		double valor;
		System.out.println("--- Sacar ---");
		System.out.println("Informe um valor que deseja sacar: ");
		valor = sc.nextDouble();
		
		if (valor < 0) {
			System.out.println("Valor inválido!");
		} else {
			if (valor <= saldo) {
				saldo -= valor;
				System.out.println("Saque realizado! Saldo atual: " + saldo);
			} else {
				System.out.println("Saldo insuficiente!");
			}
		}
	}
	
	public void consultarSaldo() {
		System.out.println("Número da conta: " + numero);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo atual: " + saldo);
	}
	
}
