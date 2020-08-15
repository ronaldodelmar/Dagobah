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

		while (true) {

			Dialogo.mensagem("Você está atualmente em: " + mapa.obterLocalDa(posicaoAtualDoHeroi));

			this.posicaoAtualDoHeroi = obterNovoDestinoDoHeroi();

			Dialogo.mensagem("Você está a caminho de: " + mapa.obterLocalDa(posicaoAtualDoHeroi) + "...");

		}

	}

	private Coordenada obterNovoDestinoDoHeroi() {

		Dialogo.mensagem("Você pode ir para o seguintes locais: " + mapa.listarDestinosAPartirDa(posicaoAtualDoHeroi));

		try {

			Direcao direcao = Dialogo.perguntarDirecao("Para qual local você deseja ir? ");

			return mapa.buscarCoordenadaDoDestino(direcao, posicaoAtualDoHeroi);

		} catch (Exception e) {
			Dialogo.mensagem("Local selecionado inválido!");
			return obterNovoDestinoDoHeroi();
		}

	}

	public static void main(String[] args) {
		new Game().start();
	}

}
