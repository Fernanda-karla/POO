package br.ufpb;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoriaMusica implements SistemaDeMusica{
	
	private Map<String,Musica> musicais;
	
	public MemoriaMusica(){
		this.musicais = new HashMap<String,Musica>();
	}

	@Override
	public void cadastrarMusica(Musica music) {
		this.musicais.put(null, music);
		
	}

	@Override
	public Musica pesquisaMusica(String nome, Genero genero) throws MusicaInexistenteException {
		Musica m = musicais.get(nome);
		if(m != null){
			return m;
		}else{
			throw new MusicaInexistenteException("Música inválida");
		}
	}

	@Override
	public List<Musica> pesquisaMusicaPorGenero(Genero gen) {
		List<Musica> musica = new ArrayList<Musica>();
		for(Musica m: this.musicais.values()){
			if(m.getGenero().equals(gen)){
				musica.add(m);
			}
		}
		return musica;
	}

	@Override
	public void removerMusica(String nome) throws MusicaInexistenteException {
		for(Musica m: this.musicais.values()){
			if(m.getNome().equals(nome)){
				musicais.remove(nome);
			}else{
				throw new MusicaInexistenteException("Não existe essa música");
			}
		}
	}
}
