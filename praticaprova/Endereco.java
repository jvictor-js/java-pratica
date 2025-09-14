package praticaprova;

import java.util.Scanner;

public class Endereco {
	private String rua;
	private String cidade;
	private String cep;
	
	Scanner sc = new Scanner(System.in);
	
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void addEndereco(){
		System.out.println("Informe sua rua: ");
		rua = sc.nextLine();
		System.out.println("Informe sua cidade: ");
		cidade = sc.nextLine();
		System.out.println("Informe seu cep: ");
		cep = sc.nextLine();
	}
	
}
