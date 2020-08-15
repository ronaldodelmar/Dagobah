package br.com.dagobah.game;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Mapa {

	private final Local[][] locais;
	
	public Mapa(Local[][] locais) {
		this.locais = locais;
	}

	public Local obterLocalDa(Coordenada coordenadaAtualDoHeroi) {
		return locais[coordenadaAtualDoHeroi.getX()][coordenadaAtualDoHeroi.getY()];
	}

	public Map<Direcao, Local> listarDestinosAPartirDa(Coordenada coordenada) {
		
		Map<Direcao, Local> direcoesPossiveis = new HashMap<>();
		
		for (Direcao direcao : Direcao.values()) {
			
			Coordenada novaCoordenada = coordenada.moverPara(direcao);
			
			if(existe(novaCoordenada)) {
				direcoesPossiveis.put(direcao, locais[novaCoordenada.getX()][novaCoordenada.getY()]);
			}
		}
		
		return direcoesPossiveis;
	}

	private boolean existe(Coordenada coordenada) {
		try {
			Local local = locais[coordenada.getX()][coordenada.getY()];
		}catch (Exception e) {
			return false;
		}
		return true;
	}

	public Coordenada buscarCoordenadaDoDestino(Direcao direcao, Coordenada coordenada) {
		
		Coordenada novaCoordenada = coordenada.moverPara(direcao);
		
		if(existe(novaCoordenada)) {
			return novaCoordenada;
		}
		
		throw new NoSuchElementException("Não é possível seguir nessa direção!");
	}
	
}
