package br.ufpb;

import java.util.List;

public interface SistemaDeMusica {
	
	public void cadastrarMusica(Musica m);
	
	public String pesquisarMusica(String nome) throws MusicaInexistenteException;
	
	public List<Musica> pesquisaMusicaPorGenero(Genero gen);
	
	public Musica removerMusica(String nome) throws MusicaInexistenteException;
	
	public String ListaDeMusicas();
	

}
