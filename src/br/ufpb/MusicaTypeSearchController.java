package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MusicaTypeSearchController implements ActionListener {
	
	MemoriaMusica musicaFacade;
	JFrame janelaPrincipal;
	
	public MusicaTypeSearchController(MemoriaMusica musicaFacade, JFrame janelaPrincipal){
		this.musicaFacade = musicaFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Genero genero = MusicaGUI.leGenero(janelaPrincipal);
		musicaFacade.pesquisaMusicaPorGenero(genero);
	}

}
