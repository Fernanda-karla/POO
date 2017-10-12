package br.ufpb;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class GravadorDeMusica {
	private String nomeArquivo;
	
	public GravadorDeMusica(){
		this.nomeArquivo = "musica.txt";
	}
	
	public GravadorDeMusica(String nomeArquivo){
		this.nomeArquivo = nomeArquivo;
	}
	
	public List<Musica> leMusica() throws IOException{
		ObjectInputStream in = null;
		try{
			in = new ObjectInputStream(new FileInputStream(nomeArquivo));
			return (List<Musica>) in.readObject();
		}catch(FileNotFoundException e){
			throw new IOException("Não foi encontrado o arquivo música.txt", e);
		}catch(IOException e){
			throw e;
		}catch (ClassNotFoundException e){
			throw new IOException("Classe dos objetos gravados no arquivo"+"musica.txt não existe", e);
		}finally{
			if(in != null){
				in.close();
			}
		}
	}
	
	public void gravarMusica(List<Musica> musica) throws IOException{
		ObjectOutputStream out = null;
		try{
			out = new ObjectOutputStream(new FileOutputStream("musica.txt"));
			out.writeObject(musica);
		}catch(FileNotFoundException e){
			throw new IOException("Não foi encontrado o arquivo musica.txt", e);
		}catch(IOException e){
			throw e;
		}finally{
			if(out != null){
				out.close();
			}
		}
	}

}
