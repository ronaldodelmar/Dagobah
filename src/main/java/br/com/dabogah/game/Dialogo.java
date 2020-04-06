package br.com.dabogah.game;

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

}
