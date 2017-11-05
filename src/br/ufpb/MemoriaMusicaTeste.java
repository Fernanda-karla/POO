package br.ufpb;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class MemoriaMusicaTeste {

	@Test
	public void testaMemoriaMusica(){
		
		MemoriaMusica musica = new MemoriaMusica();
		
		Musica m1 = new Musica("O palha�o", 3.06, Genero.FORRO);
		musica.cadastrarMusica(m1);
		
		Musica m2 = new Musica("Como o c�u", 4.55, Genero.FORRO);
		musica.cadastrarMusica(m2);
		
		try {
			String x = musica.pesquisarMusica("O palha�o");
		} catch (MusicaInexistenteException e1) {
			fail("N�o deveria lan�ar a exce��o"+e1.getMessage());
		}
		
		
		List<Musica> tipoDeMusica = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica.size() == 2);
		
		try {
			musica.removerMusica("Como o c�u");
		} catch (MusicaInexistenteException e) {
			fail("N�o deveria lan�ar a exce��o"+e.getMessage());
		}
		
		List<Musica> tipoDeMusica1 = musica.pesquisaMusicaPorGenero(Genero.FORRO);
		assertTrue(tipoDeMusica1.size() == 1);
		
	}

}
