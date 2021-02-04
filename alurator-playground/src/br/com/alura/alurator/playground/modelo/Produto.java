package br.com.alura.alurator.playground.modelo;

public class Produto extends SuperProduto {

	private String nome;
	private double valor;
	private String marca;

	public Produto(String nome, double valor, String marca) {
		this.nome = nome;
		this.valor = valor;
		this.marca = marca;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getValor() {
		return valor;
	}
	
	public String getMarca() {
		return marca;
	}
}