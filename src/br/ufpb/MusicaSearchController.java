package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MusicaSearchController implements ActionListener {
	
	MemoriaMusica musicaFacade;
	JFrame janelaPrincipal;
	
	public MusicaSearchController(MemoriaMusica musicaFacade, JFrame janelaPrincipal){
		this.musicaFacade = musicaFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeMusica = JOptionPane.showInputDialog("Digite o nome da musica que queira pesquisar: ");
		Genero genero = MusicaGUI.leGenero(janelaPrincipal);
		try {
			musicaFacade.pesquisaMusica(nomeMusica, genero);
		} catch (MusicaInexistenteException e1) {
			e1.printStackTrace();
		}

	}

}
