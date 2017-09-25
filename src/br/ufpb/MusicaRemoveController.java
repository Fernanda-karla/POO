package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MusicaRemoveController implements ActionListener {
	
	MemoriaMusica musicaFacade;
	JFrame janelaPrincipal;
	
	public MusicaRemoveController(MemoriaMusica musicaFacade, JFrame janelaPrincipal){
		this.musicaFacade = musicaFacade;
		this.janelaPrincipal = janelaPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String nomeRemover = JOptionPane.showInputDialog("Digite o nome da música que deseja remover: ");
		try {
			musicaFacade.removerMusica(nomeRemover);
		} catch (MusicaInexistenteException e1) {
			e1.printStackTrace();
		}

	}

}
