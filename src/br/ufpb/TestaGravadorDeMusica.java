package br.ufpb;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestaGravadorDeMusica {
	
	@Test
	public void GravadorDeMusicaTeste(){
		List<Musica> m1 = new ArrayList<Musica>();
		GravadorDeMusica m = new GravadorDeMusica("musica.txt");
		try {
			m.gravarMusica(m1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			List<Musica> musicas = m.leMusica();
			assertTrue(m1.size() == musicas.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
		File f = new File("musica.txt");
		if(f.exists()){
			f.delete();
		}
		
	}
	
	@Test
	public void MemoriaMusicateste(){
		MemoriaMusica music = new MemoriaMusica();
		
		List<Musica> m1 = new ArrayList<Musica>();
		m1.add(new Musica("O palhaço", 3.56, Genero.FORRO));
		GravadorDeMusica m = new GravadorDeMusica("musica.txt");
		try {
			m.gravarMusica(m1);
			assertTrue(m.leMusica().size()==1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
