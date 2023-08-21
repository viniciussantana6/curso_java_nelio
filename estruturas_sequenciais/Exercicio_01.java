package estruturas_sequenciais;

//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
//mensagem explicativa, conforme exemplos

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int numA;
		int numB;
		int soma;
		
		System.out.println("Por favor, insira o primeiro número:");
		
		Scanner sc = new Scanner(System.in);
		numA = sc.nextInt();
		
		System.out.println("Por favor, insira o segundo número:");
		
		numB = sc.nextInt();
		sc.close();
		
		soma = numA + numB;
		
		System.out.printf("A soma é igual a %d", soma);
		
	}

}
