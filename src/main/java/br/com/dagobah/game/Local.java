package br.com.dagobah.game;

public class Local {

	private String nome;

	private Local(String nome) {
		this.nome = nome;
	}
	
	public static Local of(String nome) {
		return new Local(nome);
	}

	@Override
	public String toString() {
		return nome;
	}
}
