package br.com.dagobah.game;

import java.util.Scanner;

public class Dialogo {

	private static Scanner scanner = new Scanner(System.in);

	public static void mensagem(String mensagem) {
		System.out.println(mensagem);
	}

	public static String perguntar(String mensagem) {
		mensagem(mensagem);
		return scanner.nextLine();
	}

	public static Direcao perguntarDirecao(String mensagem) {
		String siglaDirecao = perguntar(mensagem);
		return Direcao.buscarPor(siglaDirecao);
	}

}
