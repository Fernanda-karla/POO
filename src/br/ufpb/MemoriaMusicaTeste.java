package br.ufpb;


import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MemoriaMusicaTeste {

	@Test
	public void testaMemoriaMusica(){
		
		MemoriaMusica musica = new MemoriaMusica();
		
		Musica m1 = new Musica("O Palha�o", 3.56, Genero.FORRO);
		musica.cadastrarMusica(m1);
		
		Musica m2 = new Musica("Mudou a Esta��o", 3.07, Genero.FORRO);
		musica.cadastrarMusica(m2);
		
		List<Musica> tipoDeMusica = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica.size() == 2);
		
		try {
			musica.removerMusica("Mudou a Esta��o");
		} catch (MusicaInexistenteException e) {
			fail("N�o deveria lan�ar a exce��o");
		}
		
		List<Musica> tipoDeMusica1 = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica1.size() == 1);
		
	}

}
