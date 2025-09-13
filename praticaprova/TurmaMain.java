package praticaprova;

public class TurmaMain {

	public static void main(String[] args) {
		TurmaArray turma = new TurmaArray(3);

		turma.cadastrarAlunos();
		turma.exibirAlunos();
		turma.quantAlunosCadastrados();
		
	}

}
