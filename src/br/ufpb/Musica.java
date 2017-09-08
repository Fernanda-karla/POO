package br.ufpb;

public class Musica{
	
	private String nome;
	private double duracao;
	private Genero genero;
	
	public Musica(String nome, double duracao, Genero genero){
		this.nome = nome;
		this.duracao = duracao;
		this.genero = genero;
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
		return genero;
	}
	
	public void setGenero(Genero gen){
		this.genero = gen;
	}
	
	public String toString(){
		return "Nome da música: "+this.nome+"tempo de duracao: "+this.duracao+"do genero: "+this.genero;
	}
	
	
	

}
