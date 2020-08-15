package br.com.dagobah.game;

public class Coordenada {

	private int x;
	private int y;

	public Coordenada(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Coordenada moverPara(Direcao direcao) {
		return new Coordenada(x + direcao.getX(), y + direcao.getY());
	}

	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
