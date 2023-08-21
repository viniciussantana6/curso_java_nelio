package estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//casas decimais conforme exemplos.
//Fórmula da área: area = π . raio2
//Considere o valor de π = 3.14159

public class Exercicio_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double pi = 3.14159;
		double raioCirculo = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o raio do círculo:");
		
		raioCirculo = sc.nextDouble();
		
		sc.close();
		
		double areaCirculo = pi * raioCirculo * raioCirculo;
		
		System.out.printf("O valor da área deste círculo é %.4f", areaCirculo);

	}

}
