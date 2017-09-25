package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MusicaAddController implements ActionListener{
	 
	MemoriaMusica musicaFacade;
	JFrame janelaPrincipal;
	
	public MusicaAddController(MemoriaMusica musicFacade, JFrame janelaPrincipal){
		this.musicaFacade = musicFacade;
		this.janelaPrincipal = janelaPrincipal;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String nome = JOptionPane.showInputDialog(janelaPrincipal, "Qual o nome da música?");
		double duracao = MusicaGUI.leDuracao(janelaPrincipal);
		Genero genero = MusicaGUI.leGenero(janelaPrincipal);
		
		Musica m = new Musica (nome, duracao, genero);
		musicaFacade.cadastrarMusica(m);
		
	}

}
