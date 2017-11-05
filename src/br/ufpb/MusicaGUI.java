package br.ufpb;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MusicaGUI extends JFrame{
	
	private JLabel linha1;
	private JLabel linha2;
	private JButton botaoAdicionar;
	private JButton botaoPesquisar;
	private JButton tipoDePesquisa;
	private JButton botaoRemover;
	private static MusicaGUI frame;

	
	ImageIcon musicaImg = new ImageIcon("./imgs/61998a74a3bd3a4e32f68c423aa7e6f7--cone-do-c-rculo-de-msica-by-vexels.png");
	ImageIcon addImg = new ImageIcon("./imgs/add_track_song_music_include_multimedia_control-128.png");
	ImageIcon pesqImg = new ImageIcon("./imgs/14115359-ico-pos-graduacao.png");
	ImageIcon tipoImg = new ImageIcon("./imgs/Button_15-128.png");
	ImageIcon removeImg = new ImageIcon("./imgs/delete-128.png");
	
	MemoriaMusica musicFacade = new MemoriaMusica();
	
	public MusicaGUI(){
		
		setTitle("Sistema de Música");
		setSize(800, 600);
		setLocation(150, 150);
		setResizable(false);
		
		getContentPane().setBackground(Color.orange);
		linha1 = new JLabel("Sistema de Música", JLabel.CENTER);
		linha1.setForeground(Color.black);
		linha1.setFont(new Font("Serif", Font.BOLD, 24));
		linha2 = new JLabel(musicaImg, JLabel.CENTER);
		botaoAdicionar = new JButton("Adiconar Música", addImg);
		botaoAdicionar.addActionListener(new MusicaAddController(musicFacade, this));
		botaoPesquisar = new JButton("Pesquisar uma Música", pesqImg);
		botaoPesquisar.addActionListener(new MusicaSearchController(musicFacade, this));
		tipoDePesquisa = new JButton("Pesquisar por tipo de música", tipoImg);
		tipoDePesquisa.addActionListener(new MusicaTypeSearchController(musicFacade, this));
		botaoRemover = new JButton("Remover uma música", removeImg);
		botaoRemover.addActionListener(new MusicaRemoveController(musicFacade, this));
		getContentPane().setLayout(new GridLayout(4, 2));
		getContentPane().add(linha1);
		getContentPane().add(botaoAdicionar);
		getContentPane().add(linha2);
		getContentPane().add(botaoPesquisar);
		getContentPane().add(new JLabel());
		getContentPane().add(botaoRemover);
		getContentPane().add(new JLabel());
		getContentPane().add(tipoDePesquisa);
		
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
	
	public static void main (String [] args){
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
