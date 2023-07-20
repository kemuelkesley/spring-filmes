package br.com.kemsoftware.seachMovie.model;

public class Filme {
	private String nome;
	private Integer duracaoEmMinutos;
	private Integer anoLancamento;
	private String genero;
	private String poster;
	
	
	public Filme(String nome, Integer duracaoEmMinutos, Integer anoDeLancamento, String genero, String poster) {
		this.nome = nome;
		this.duracaoEmMinutos = duracaoEmMinutos;
		this.anoLancamento = anoDeLancamento;
		this.genero = genero;
		this.poster = poster;
	}


	public String getNome() {
		return nome;
	}


	public Integer getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}


	public Integer getAnoDeLancamento() {
		return anoLancamento;
	}


	public String getGenero() {
		return genero;
	}


	public String getPoster() {
		return poster;
	}
	

    @Override
    public String toString() {
        return "Filme{" +                
                ", nome='" + nome + '\'' +
                ", duracaoEmMinutos=" + duracaoEmMinutos +
                ", anoLancamento=" + anoLancamento +
                ", genero='" + genero + '\'' +
                ", poster='" + poster + '\'' +
                '}';
    }
	
	
}
