package br.ufpb;

import java.util.List;

import javax.swing.JOptionPane;

public class MenuMemoriaMusica {
	
	public static void main(String [] args){
		
		MemoriaMusica m1 = new MemoriaMusica();
		
		System.out.println(m1);
		
		boolean sair = false;
		while(sair == false){
			int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção: \n1.Cadastar uma Música.\n2.Pesquisar uma Música.\n3.Pesquisar Música por Genero.\n4.Remover uma Música.\n5.Sair."));
			switch(opcao){
			case 1:
				int quant = Integer.parseInt(JOptionPane.showInputDialog("Quantas músicas a cadastrar?"));
				for(int k =0; k < quant; k++){	
					String nome = JOptionPane.showInputDialog("Digite o nome da música: ");
					double tempoDeDuracao = Double.parseDouble(JOptionPane.showInputDialog("Informe quanto a duração da música: "));
					int tipoMusica = Integer.parseInt(JOptionPane.showInputDialog("A música é de que tipo: \n1.Forró.\n2.Sertanejo.\n3.Funk.\n4.Pagode.\n5.Outro."));
					Genero tipo = Genero.PADRÃO;
					switch(tipoMusica){
						case 1:
							tipo = Genero.FORRO;
							break;
						case 2:
							tipo = Genero.SERTANEJO;
							break;
						case 3:
							tipo = Genero.FUNK;
							break;
						case 4:
							tipo = Genero.PAGODE;
							break;
					}
					Musica music = new Musica(nome, tempoDeDuracao, tipo);
					m1.cadastrarMusica(music);
				}
	
				break;
			case 2:
				String nomeMusica = JOptionPane.showInputDialog("Digite o nome da musica que queira pesquisar: ");
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo da música: \n1.Forró.\n2.Sertanejo.\n3.Funk.\n4.Pagode.\n5.Outro."));
				Genero qualMusica = Genero.PADRÃO;
				switch(escolha){
				case 1:
					qualMusica = Genero.FORRO;
					try {
						m1.pesquisaMusica(nomeMusica, qualMusica);
					} catch (MusicaInexistenteException e) {
						JOptionPane.showMessageDialog(null, "O nome da música é: "+nomeMusica+"O tipo da música é: "+qualMusica);
					}
					break;
				case 2:
					qualMusica = Genero.SERTANEJO;
					try {
						m1.pesquisaMusica(nomeMusica, qualMusica);
					} catch (MusicaInexistenteException e) {
						JOptionPane.showMessageDialog(null, "O nome da música é: "+nomeMusica+"O tipo da música é: "+qualMusica);
					}
					break;
				case 3:
					qualMusica = Genero.FUNK;
					try {
						m1.pesquisaMusica(nomeMusica, qualMusica);
					} catch (MusicaInexistenteException e) {
						JOptionPane.showMessageDialog(null, "O nome da música é: "+nomeMusica+"O tipo da música é: "+qualMusica);
					}
					break;
				case 4:
					qualMusica = Genero.PAGODE;
					try {
						m1.pesquisaMusica(nomeMusica, qualMusica);
					} catch (MusicaInexistenteException e) {
						JOptionPane.showMessageDialog(null, "O nome da música é: "+nomeMusica+"O tipo da música é: "+qualMusica);
					}
					break;
				}
				
				
			case 3:
				int tipoDeMusica = Integer.parseInt(JOptionPane.showInputDialog("Digite o tipo de música: \n1.Forró.\n2.Sertanejo.\n3.Pagode.\n4.Funk.\n5.Outro."));
				Genero tipoDaMusica = Genero.PADRÃO;
				switch(tipoDeMusica){
					case 1:
						tipoDaMusica = Genero.FORRO;
						List<Musica> tipomusica  = m1.pesquisaMusicaPorGenero(tipoDaMusica);
						System.out.println(tipomusica);
						break;
					case 2:
						tipoDaMusica = Genero.SERTANEJO;
						List<Musica> tipomusica1  = m1.pesquisaMusicaPorGenero(tipoDaMusica);
						System.out.println(tipomusica1);
						break;
					case 3:
						tipoDaMusica = Genero.PAGODE;
						List<Musica> tipomusica2  = m1.pesquisaMusicaPorGenero(tipoDaMusica);
						System.out.println(tipomusica2);
						break;
					case 4:
						tipoDaMusica = Genero.FUNK;
						List<Musica> tipomusica3  = m1.pesquisaMusicaPorGenero(tipoDaMusica);
						System.out.println(tipomusica3);
						break;
				}
				break;
			case 4:
				String nomeRemover = JOptionPane.showInputDialog("Digite o nome da música que deseja remover: ");
				try {
					m1.removerMusica(nomeRemover);
				} catch (MusicaInexistenteException e) {
					JOptionPane.showMessageDialog(null, "As músicas que estão são: "+m1);
				}
				break;
				
			default:
				sair = true;
				System.out.println("Fim");
			}
		}
		
	}
}
