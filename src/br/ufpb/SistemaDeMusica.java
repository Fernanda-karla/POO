package br.ufpb;

import java.util.List;

public interface SistemaDeMusica {
	
	public void cadastrarMusica(Musica music);
	
	public Musica pesquisaMusica(String nome, Genero genero) throws MusicaInexistenteException;
	
	public List<Musica> pesquisaMusicaPorGenero(Genero gen);
	
	public void removerMusica(String nome) throws MusicaInexistenteException;

}
