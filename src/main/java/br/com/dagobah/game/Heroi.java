package br.com.dagobah.game;

public class Heroi {

	private String nome;

	public Heroi(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return nome;
	}
}
