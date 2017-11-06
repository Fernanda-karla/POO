package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AjudaController implements ActionListener {

	MemoriaMusica musicaFacade;
	JFrame janelaPrincipal;
	
	public AjudaController(MemoriaMusica musicFacade, JFrame janelaPrincipal){
		this.musicaFacade = musicFacade;
		this.janelaPrincipal = janelaPrincipal;
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JOptionPane.showMessageDialog(janelaPrincipal, "Contato de João Leandro\nEmail:joao.leandro@dce.ufpb.br\nContato de Fernanda\nEmail:fernanda.karla@dce.ufpb.br");

	}

}
