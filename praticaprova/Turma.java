package praticaprova;

import java.util.Scanner;

public class Turma {
	private String nomeCurso;
	private String nomeTurma;
	private Professor professor;
	private Aluno aluno1;
	private Aluno aluno2;
	private Aluno aluno3;
	
	Scanner sc = new Scanner(System.in);
	
	public Turma(String nomeCurso, String nomeTurma, Professor professor, Aluno aluno1, Aluno aluno2, Aluno aluno3) {
		this.nomeCurso = nomeCurso;
		this.nomeTurma = nomeTurma;
		this.professor = professor;
		this.aluno1 = aluno1;
		this.aluno2 = aluno2;
		this.aluno3 = aluno3;
	}
	
	public String getnomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public String getnomeTurma() {
		return nomeTurma;
	}
	public void setNomeTurma(String nomeTurma) {
		this.nomeTurma = nomeTurma;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public void exibindoTurma() {
		System.out.println("Curso: " + nomeCurso);
		System.out.println("Turma: " + nomeTurma);
		professor.exibindoProfessor();
		aluno1.exibindoAluno();
		aluno2.exibindoAluno();
		aluno3.exibindoAluno();
		
	}
}
