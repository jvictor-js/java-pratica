package conta;

import java.util.Scanner;

public class ContaMain {

    public static void depositar(ContaBancaria conta) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantia que você deseja depositar? ");
        float valor = sc.nextFloat();
        conta.setSaldo(conta.getSaldo() + valor);
    }

    public static void sacar(ContaBancaria conta) {
    	Scanner sc = new Scanner(System.in);
    	float valorS = 0;
    	if (conta.getSaldo() > 0) {
    		System.out.println("Informe um valor que deseja sacar: ");
    		valorS = sc.nextFloat();
    		if (valorS > conta.getSaldo()) {
    			System.out.println("Valor requerido acima do saldo!");
    		} else {
    			float valorFinal = conta.getSaldo() - valorS;
    			conta.setSaldo(valorFinal);
    		}
    	} else {
			System.out.println("Você precisa depositar uma quantia para poder sacar!");
		}
    }

    public static void exibirSaldo (ContaBancaria conta) {
    	System.out.println("Saldo atual: " + conta.getSaldo());
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        depositar(conta);
        sacar(conta);
        exibirSaldo(conta);
    }

}
