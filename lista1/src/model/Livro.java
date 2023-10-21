package model;

public class Livro {

	private String titulo;
	private int qtdPaginas, paginasLidas;

	public Livro(String titulo, int qtdPaginas, int paginasLidas) {
		this.paginasLidas = paginasLidas;
		this.qtdPaginas = qtdPaginas;
		this.titulo = titulo;
	}

	public Livro(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}

	public int getPaginasLidas() {
		return paginasLidas;
	}

	public void setPaginasLidas(int paginasLidas) {
		this.paginasLidas = paginasLidas;
	}

	public double verificarProgresso(double porcentagem) {
	 return porcentagem = paginasLidas * 100 / qtdPaginas;
		
	}

}
