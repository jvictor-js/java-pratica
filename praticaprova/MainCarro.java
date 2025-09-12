package praticaprova;

public class MainCarro {

	public static void main(String[] args) {
		Carro c1 = new Carro("Volkswagen", "Gol", 2022);
		Carro c2 = new Carro("Chevrolet", "Onix", 2018);
		Carro c3 = new Carro("Fiat", "Uno", 2014);
		
		System.out.println("--- Carros ---");
		System.out.println("--------------");
		c1.exibirInformacoes();
		System.out.println("--------------");
		c2.exibirInformacoes();
		System.out.println("--------------");
		c3.exibirInformacoes();

	}

}
