package encapsulamento;

import java.util.Scanner;

public class Cliente {
	private String nome;
	private String cpf;
	private Pedido p1;
	
	Scanner sc = new Scanner(System.in);
	
	Cliente(){
		this.p1 = new Pedido();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Pedido getP1() {
		return p1;
	}
	
	public void setP1(Pedido p1) {
		this.p1 = p1;
	}
	
	public void dadosCliente() {
		System.out.println("--- Dados do Cliente ---");
		System.out.println("Informe seu nome: ");
		nome = sc.nextLine();
		System.out.println("Informe o seu CPF: ");
		cpf = sc.nextLine();
	}
	
	public void fazerPedido() {
		dadosCliente();
		p1.produtoPedido();
	}
	
}
