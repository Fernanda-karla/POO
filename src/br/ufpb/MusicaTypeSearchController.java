package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
		List<Musica> tipomusica  = musicaFacade.pesquisaMusicaPorGenero(genero);
		JOptionPane.showMessageDialog(janelaPrincipal, tipomusica);
		
	}

}
