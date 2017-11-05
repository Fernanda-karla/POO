package br.ufpb;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MemoriaMusicaTeste {

	@Test
	public void testaMemoriaMusica(){
		
		MemoriaMusica musica = new MemoriaMusica();
		
		Musica m1 = new Musica("O palhaço", 3.06, Genero.FORRO);
		musica.cadastrarMusica(m1);
		
		Musica m2 = new Musica("Como o céu", 4.55, Genero.FORRO);
		musica.cadastrarMusica(m2);
		
		try {
			String x = musica.pesquisarMusica("O palhaço");
		} catch (MusicaInexistenteException e1) {
			fail("Não deveria lançar a exceção"+e1.getMessage());
		}
		
		
		List<Musica> tipoDeMusica = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica.size() == 2);
		
		try {
			musica.removerMusica("Como o céu");
		} catch (MusicaInexistenteException e) {
			fail("Não deveria lançar a exceção"+e.getMessage());
		}
		
		List<Musica> tipoDeMusica1 = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica1.size() == 1);
		
	}

}
