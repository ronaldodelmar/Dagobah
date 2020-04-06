package br.com.dagobah.game;

public enum Direcao {

	FRENTE("F", -1, 0), 
	ESQUERDA("E", 0, -1), 
	DIREITA("D", 0, 1), 
	VOLTAR("V", 1, 0);

	private final String direcao;
	private final int x;
	private final int y;

	private Direcao(String direcao, int x, int y) {
		this.direcao = direcao;
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public String getDirecao() {
		return direcao;
	}

}
