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
			Musica m = musicaFacade.removerMusica(nomeRemover);
			JOptionPane.showMessageDialog(null, "a música: "+m.toString()+" foi removida");
			JOptionPane.showMessageDialog(null,"Musicas ainda na lista:"+musicaFacade.ListaDeMusicas());
		} catch (MusicaInexistenteException e1) {
			JOptionPane.showMessageDialog(janelaPrincipal, e1.getMessage());
		}
	}

}
