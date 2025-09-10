package encapsulamento;

public class ContaBancariaEncapsuladaMain {

	public static void main(String[] args) {
		ContaBancariaEncapsulada conta = new ContaBancariaEncapsulada();
		
		conta.criarConta();
		conta.depositar();
		conta.consultarSaldo();
		conta.sacar();
		conta.consultarSaldo();

	}

}
