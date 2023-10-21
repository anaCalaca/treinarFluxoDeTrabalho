package view;

import model.Livro;

public class LivroTeste {

	public static void main(String[] args) {
		
		Livro pequenoPrincipe = new Livro("o pequeno Principe");
		
		pequenoPrincipe.setQtdPaginas(98);
		pequenoPrincipe.setPaginasLidas(50);

		System.out.println("o livro " + pequenoPrincipe.getTitulo() + " possui " + pequenoPrincipe.getQtdPaginas() + " paginas");

		System.out.println("vc ja leu " + pequenoPrincipe.verificarProgresso(0) + "%");
		
		Livro meuLivro = new Livro("a droga da obediencia", 236, 150);
		
		System.out.println("o livro " + meuLivro.getTitulo() + " possui " +  meuLivro.getQtdPaginas() + " paginas");
		
	}

}