package view;

import model.Filme;

public class FilmeTeste {

	public static void main(String[] args) {

	Filme umFilmeQualquer = new Filme("os vingadores", 142);
		
	System.out.println("duraçao do filme em horas " + umFilmeQualquer.exibirDuracaoEmHoras(0));
	
	Filme meuFilmeFavorito = new Filme("Elementos", 100);
		
		meuFilmeFavorito.setDuracaoEmMinutos(180);
		
		System.out.println("Os filmes no catálogo são " + umFilmeQualquer.getTitulo() + "e " + meuFilmeFavorito.getTitulo());
	}

}
