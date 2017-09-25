package br.ufpb;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Menu {
	
	public static void mains(String [] args){
		
		JFrame janela = new MusicaGUI();
		janela.setVisible(true);
		WindowListener fechadorDeJanelaPrincipal = new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		};
		janela.addWindowListener(fechadorDeJanelaPrincipal);
	}

}
