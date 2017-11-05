package br.ufpb;

import java.io.Serializable;

public class Musica implements Serializable{
	
	private String nome;
	private double duracao;
	private Genero generos;
	
	public Musica(String nome, double duracao, Genero generos){
		this.nome = nome;
		this.duracao = duracao;
		this.generos = generos;
	}
	
	public Musica(){
		this.nome = "";
		this.duracao = 0.0;
		this.generos = Genero.PADRÃO;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public double getDuracao(){
		return this.duracao;
	}
	
	public void setDuracao(double duracao){
		this.duracao = duracao;
	}
	
	public Genero getGenero(){
		return generos;
	}
	
	public void setGenero(Genero gen){
		this.generos = gen;
	}
	
	public String toString(){
		return "Nome da música:"+this.nome+" Tempo de duracao:"+this.duracao+" do Genero:"+this.generos;
	}
}
