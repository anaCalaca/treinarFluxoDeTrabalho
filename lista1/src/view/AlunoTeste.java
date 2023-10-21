package view;

import model.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {

		Aluno estudante = new Aluno();

		estudante.setNome("pedro");
		estudante.setMatricula(123456987);
		estudante.setCurso("Ads");

		System.out.println("nome: " + estudante.getNome());
		System.out.println("curso:" + estudante.getCurso());
		System.out.println("numero da matricula:" + estudante.getMatricula());
		System.out.printf("ciencias:");
		estudante.dizerCiencias(9);
		System.out.printf("historia:");
		estudante.dizerHistoria(5);
		System.out.printf("matematica:");
		estudante.dizerMatematica(4);

	}

}
