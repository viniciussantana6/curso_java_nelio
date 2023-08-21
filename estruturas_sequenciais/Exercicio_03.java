package estruturas_sequenciais;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		int A, B, C, D;
		int diferenca;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Insira o valor de A, B, C e D%n");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		
		diferenca = (A * B - C * D);
		System.out.printf("DIFERENCA = %d", diferenca);
	}
}
