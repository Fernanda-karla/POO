package br.ufpb;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MusicaGUI extends JFrame{
	
	JLabel linha1, linha2;
	ImageIcon musicaImg = new ImageIcon("./imgs/como-transferir-musicas.png");
	ImageIcon addImg = new ImageIcon("./imgs/music_blue_add.png");
	ImageIcon pesqImg = new ImageIcon("./imgs/search-icon-psd-png.jpg");
	ImageIcon removeImg = new ImageIcon("./imgs/musica-botao-remover_318-31365.jpg");
	JButton botaoAdicionar, botaoPesquisar, botaoRemover;
	MemoriaMusica musicFacade = new MemoriaMusica();
	
	public MusicaGUI(){
		
		setTitle("Sistema de Música");
		setSize(800, 600);
		setLocation(150, 150);
		setResizable(false);
		
		getContentPane().setBackground(Color.BLUE);
		linha1 = new JLabel("Meu Sistema de Música", JLabel.CENTER);
		linha1.setForeground(Color.red);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(musicaImg, JLabel.CENTER);
		botaoAdicionar = new JButton("Adiconar Música", addImg);
		botaoAdicionar.addActionListener(new MusicaAddController(musicFacade, this));
		botaoPesquisar = new JButton("Pesquisar uma Música", pesqImg);
		botaoPesquisar.addActionListener(new MusicaSearchController(musicFacade, this));
		botaoRemover = new JButton("Remover uma música", removeImg);
		botaoRemover.addActionListener(new MusicaRemoveController(musicFacade, this));
		getContentPane().setLayout(new GridLayout(3, 2));
		getContentPane().add(linha1);
		getContentPane().add(botaoAdicionar);
		getContentPane().add(linha2);
		getContentPane().add(botaoPesquisar);
		getContentPane().add(new JLabel());
		getContentPane().add(botaoRemover);
	}

	public static double leDuracao(JFrame janelaPai) {
		double duracao = 00.00;
		while(duracao == 00.00){
			String doubleStr = JOptionPane.showInputDialog("Qual o tempo de duração da música?");
			duracao = Double.parseDouble(doubleStr);
		}
		return duracao;
	}

	public static Genero leGenero(JFrame janelaPrincipal) {
		Genero genero = Genero.PADRÃO;
		while(genero == Genero.PADRÃO){
			int tipoMusica = Integer.parseInt(JOptionPane.showInputDialog("A música é de que tipo: \n1.Forró.\n2.Sertanejo.\n3.Funk.\n4.Pagode.\n5.Outro."));
			switch(tipoMusica){
				case 1:
					genero = Genero.FORRO;
					break;
				case 2:
					genero = Genero.SERTANEJO;
					break;
				case 3:
					genero = Genero.FUNK;
					break;
				case 4:
					genero = Genero.PAGODE;
					break;
			}
		}
		return genero;
	}

}
