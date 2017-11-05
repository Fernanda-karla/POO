package br.ufpb;

import java.util.ArrayList;
import java.util.List;

public class MemoriaMusica implements SistemaDeMusica{
	
	private List<Musica> musicais;
	
	public MemoriaMusica(){
		this.musicais = new ArrayList<Musica>();
	}

	@Override
	public void cadastrarMusica(Musica m) {
		musicais.add(m);
	}

	@Override
	public String pesquisarMusica(String nome) throws MusicaInexistenteException {
		for(Musica m: this.musicais){
			if(m.getNome().equals(nome)){
				return m.toString();
			}
		}
		throw new MusicaInexistenteException("Musica não existe");
	
	}

	@Override
	public List<Musica> pesquisaMusicaPorGenero(Genero gen) {
		List<Musica> music = new ArrayList<Musica>();
		for(Musica x: this.musicais){
			if(x.getGenero() == gen){
				music.add(x);
			}
		}
		return music;
	}

	@Override
	public Musica removerMusica(String nome) throws MusicaInexistenteException {
		for(Musica m: this.musicais){
			if(m.getNome().equals(nome)){
				musicais.remove(m);
				return m;
			}
				
		}
		throw new MusicaInexistenteException("A música a ser removida não existe");
	}

	@Override
	public String ListaDeMusicas() {
		String musicas = "";
		for(Musica m: this.musicais){
			musicas+=m.toString()+"\n";
		}
		return musicas;
	}

}

