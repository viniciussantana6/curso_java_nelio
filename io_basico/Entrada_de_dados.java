package io_basico;

import java.util.Scanner;

public class Entrada_de_dados {

	public static void main(String[] args) {
		String nome;
		
		System.out.printf("Por favor, informe seu nome:%n");
		
		Scanner sc = new Scanner(System.in);
		nome = sc.nextLine();
		sc.close();
		
		System.out.printf("Seu nome é: %s", nome);
	}

}
