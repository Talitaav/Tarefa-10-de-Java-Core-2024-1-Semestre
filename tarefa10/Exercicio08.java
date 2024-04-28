package estrutura;

import java.util.Scanner;

public class Exercicio08 {
	/*
	 * 8) Elaborar um programa que apresente como resultado o valor de uma potência
	 * de uma base
	 * 
	 * qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor
	 * da base e E o valor do expoente. Observe que neste exercício não pode ser
	 * utilizado o operador de exponenciação do portuguol (^).
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o valor da base B: ");
		int base = sc.nextInt();

		System.out.print("Informe o valor do expoente E: ");
		int expoente = sc.nextInt();

		int resultado = 1;
		for (int i = 0; i < expoente; i++) {
			resultado *= base;

			System.out.println("O resultado de " + base + "^" + expoente + " é: " + resultado);

		}

	}

}
