package praticaprova;

import java.util.Scanner;

public class TurmaArray {
	private AlunoArray[] alunos;
	
	Scanner sc = new Scanner(System.in);
	
	public TurmaArray(int quantidade) {
		this.alunos = new AlunoArray[quantidade];
	}
	
	public AlunoArray[] getAlunos() {
		return alunos;
	}

	public void setAlunos(AlunoArray[] alunos) {
		this.alunos = alunos;
	}
	
	public void cadastrarAlunos() {
		for (int i = 0; i < alunos.length; i++) {
			alunos[i] = new AlunoArray();
			alunos[i].registrandoAlunos();
		}
	}
	
	public void exibirAlunos() {
		for(AlunoArray aluno: alunos) {	
			if (aluno.getIdade() >= 18) {
				System.out.printf("Aluno: %s | Idade: %d \n", aluno.getNome(), aluno.getIdade());
			}
		}
	}
	
	public void quantAlunosCadastrados() {
		System.out.println("O número de alunos cadastrados é " + alunos.length);
	}
	
}