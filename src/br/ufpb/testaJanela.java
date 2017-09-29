package br.ufpb;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class testaJanela {
	
	public static void main (String [] args ){
		JFrame janela = new JFrame();
		janela.setTitle("Sistema de Música");
		janela.setLocation(0,0);
		janela.setSize(400, 400);
		JButton botao = new JButton("Meu botão");
		botao.setToolTipText("Dica: Botão iniciar");
		botao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(janela, "Testando botão");
			}
		});
		janela.add(botao);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		

	
	}

}
