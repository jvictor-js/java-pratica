package produtos;

import java.util.Scanner;

public class Produto {
	String nome;
	double preco;
	int quantidade;
	Scanner sc = new Scanner(System.in);
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public void menu() {
		int opcao;
		do {
			System.out.println("--- Menu Produtos ---");
			System.out.println("1 - Adicionar produto");
			System.out.println("2 - Remover produto");
			System.out.println("0 - sair");
			System.out.println("Escolha: ");
			opcao = sc.nextInt();
			switch (opcao) {
			case 1:
				adicionar();
				exibir();
				break;
			case 2: 
				remover();
				exibir();
				break;
			case 0:
				System.out.println("Saindo do programa...");
				exibir();
				break;
			default:
				System.out.println("Opção inválida!");
				break;
			}
				
		} while (opcao != 0);
	}
	
	public void adicionar() {
		
		System.out.println("--- Adicionando produtos ---");
		sc.nextLine();
		System.out.println("Digite o nome do produto que deseja adicionar: ");
		nome = sc.nextLine();
		System.out.println("Informe qual o preço do produto: ");
		preco = sc.nextDouble();
		System.out.println("Quantas unidades deseja adicionar? ");
		quantidade = sc.nextInt();
	}
	
	public void remover() {
		System.out.println("--- Removendo produtos ---");
		System.out.println("Deseja remover algum produto? (S/N)");
		char escolha = sc.next().toUpperCase().charAt(0);
		if (escolha == 'S') {
			String nomeRemover;
			int unidadeRemovidas;
			sc.nextLine();
			System.out.println("Informe o nome do produto que deseja remover: ");
			nomeRemover = sc.nextLine();
			if (nomeRemover.equalsIgnoreCase(nome)) {
				System.out.println("Quantas unidades deseja remover? ");
				unidadeRemovidas = sc.nextInt();
				if (unidadeRemovidas < 0) {
					System.out.println("Quantidade inválida!");
				} else {
					if (unidadeRemovidas <= quantidade) {
						quantidade -= unidadeRemovidas;
					} else {
						System.out.println("Você está tentando remover um número que é maior que a quantidade disponível!");
					}
				}
				
			} else {
				System.out.println("Não existe nenhum produto com esse nome no estoque.");
			}
			
			
		} else if (escolha == 'N'){
			System.out.println("Está bem, obrigado!");
		} else {
			System.out.println("Escolha inválida!");
		}
		
	}
	
	public void exibir() {
		System.out.println("--- Produtos ---");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + quantidade);
	}
	
	
}
