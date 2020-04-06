package br.com.dagobah.game;

public class Game {

	private Mapa mapa;

	private Historia historia;

	private Coordenada posicaoAtualDoHeroi;

	public Game() {
		this.historia = new Historia();
		this.mapa = new Mapa(historia.getLocaisDoMapa());
		this.posicaoAtualDoHeroi = historia.getPosicaoInicialDoHeroi();
	}

	private void start() {

		Dialogo.mensagem("Bem vindo ao jogo de história em texto!");

		String nomeDoHeroi = Dialogo.perguntar("Qual seu nome? ");

		Heroi heroi = new Heroi(nomeDoHeroi);

		Dialogo.mensagem("Seja bem vindo : " + heroi + "!");

		Dialogo.mensagem("Você está atualmente em: " + mapa.obterLocalDa(posicaoAtualDoHeroi));
		
		Dialogo.mensagem("Você pode ir para o seguintes locais: "+ mapa.listarDestinosAPartirDa(posicaoAtualDoHeroi));
		
	}

	public static void main(String[] args) {
		new Game().start();
	}

}
