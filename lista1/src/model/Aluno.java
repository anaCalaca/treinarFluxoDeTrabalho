package model;

public class Aluno {

	private String nome, curso;
	private double matematica, historia, ciencias;
	private int matricula;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getMatematica() {
		return matematica;
	}

	public void setMatematica(double matematica) {
		this.matematica = matematica;
	}

	public double getHistoria() {
		return historia;
	}

	public void setHistoria(double historia) {
		this.historia = historia;
	}

	public double getCiencias() {
		return ciencias;
	}

	public void setCiencias(double ciencias) {
		this.ciencias = ciencias;
	}

	public void dizerMatematica(double matematica) {
		if (matematica >= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}

	}

	public void dizerHistoria(double historia) {
		if (historia >= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}

	}

	public void dizerCiencias(double ciencias) {
		if (ciencias >= 7) {
			System.out.println("aprovado");
		} else {
			System.out.println("reprovado");
		}

	}

}
