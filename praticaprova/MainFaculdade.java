package praticaprova;

public class MainFaculdade {

	public static void main(String[] args) {
		Professor prof = new Professor();
		prof.registrandoProfessor();
		Aluno a1 = new Aluno();
		a1.registrandoAluno();
		Aluno a2 = new Aluno();
		a2.registrandoAluno();
		Aluno a3 = new Aluno();
		a3.registrandoAluno();
		
		Turma turma = new Turma("Ciência da Computação", "3° Período", prof, a1, a2, a3);
		System.out.println("--- Sistema de Faculdade ---");
		
		turma.exibindoTurma();
	}

}
