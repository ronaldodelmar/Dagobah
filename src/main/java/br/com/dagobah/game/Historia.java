package br.com.dagobah.game;

public class Historia {

	public static Local[][] MAPA = {
		{Local.of("Casa"), Local.of("Montanhas"), Local.of("Celeiro")},
		{Local.of("Caverna"), Local.of("Cidade"), Local.of("Fazenda")},
		{Local.of("Parque"), Local.of("Taverna"), Local.of("Igreja")}
	};
	
	private static final Coordenada POSICAO_INICIAL_DO_HEROI = new Coordenada(0, 0);
	
	public Local[][] getLocaisDoMapa() {
		return MAPA;
	}

	public Coordenada getPosicaoInicialDoHeroi() {
		return POSICAO_INICIAL_DO_HEROI;
	}
	
}
