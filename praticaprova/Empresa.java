package praticaprova;

public class Empresa {
	private Funcionario[] funcionarios;
	private String nomeFuncionarioMaior;
	private double maiorSalario;

	public String getNomeFuncionarioMaior() {
		return nomeFuncionarioMaior;
	}

	public void setNomeFuncionarioMaior(String nomeFuncionarioMaior) {
		this.nomeFuncionarioMaior = nomeFuncionarioMaior;
	}

	public double getMaiorSalario() {
		return maiorSalario;
	}

	public void setMaiorSalario(double maiorSalario) {
		this.maiorSalario = maiorSalario;
	}

	Empresa(int quantidade){
		this.funcionarios = new Funcionario[quantidade];
	}
	
	public Funcionario[] getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionario[] funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public void funcionariosRegistro() {
		for (int i = 0; i < funcionarios.length; i++) {
			funcionarios[i] = new Funcionario();
			funcionarios[i].registrandoFuncionario();
		}
	}
	
	public void maiorSalario() {
		for (int i = 0; i < funcionarios.length; i++) {
			if (funcionarios[i].getSalario() > maiorSalario) {
				maiorSalario = funcionarios[i].getSalario();
				nomeFuncionarioMaior = funcionarios[i].getNome();
			}
			
		}
		System.out.println("Funcionario com maior salário: " + nomeFuncionarioMaior);
		System.out.println("Maior salário: " + maiorSalario);
		
	}
	
}
