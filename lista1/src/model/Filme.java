package model;

public class Filme {

	private String titulo;
	private int duracaoEmMinutos;

	public Filme(String titulo, int duracaoEmMinutos) {
		this.titulo = titulo;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}

	public double exibirDuracaoEmHoras(double exibirDuracaoEmHoras) {
	 return exibirDuracaoEmHoras = duracaoEmMinutos / 60;

	}

}
