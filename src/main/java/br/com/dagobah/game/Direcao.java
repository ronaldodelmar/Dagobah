package br.com.dagobah.game;

import java.util.NoSuchElementException;
/**
 * Enum que contém as direções para navegação na matriz (cima, esquerda, direita e baixo)
 *
 */
public enum Direcao {

	C(-1, 0), 
	E(0, -1), 
	D(0, 1), 
	B(1, 0);

	private final int x;
	private final int y;

	private Direcao(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public static Direcao buscarPor(String siglaDirecao) {
		
		for (Direcao direcao : Direcao.values()) {
			if(direcao.toString().equalsIgnoreCase(siglaDirecao)) {
				return direcao;
			}
		}
		
		throw new NoSuchElementException("Não foi encontrado a direção com a sigla: " + siglaDirecao);
	}

}
