package estruturas_sequenciais;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04 {

	public static void main(String[] args) {
		String nomeFuncionario;
		double qtdHora, valorHora, salario;
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o nome de um funcionário:");
		nomeFuncionario = sc.nextLine();
		
		System.out.println("Insira a quantidade de horas trabalhadas:");
		qtdHora = sc.nextDouble();
		
		System.out.println("Insira o valor por hora:");
		valorHora = sc.nextDouble();
		
		sc.close();
		
		salario = valorHora * qtdHora;
		
		System.out.printf("Nome: " + nomeFuncionario + "%n");
		System.out.printf("Salário: %.2f%n", salario);

	}

}
