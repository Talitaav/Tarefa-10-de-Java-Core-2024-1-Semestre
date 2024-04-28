package estrutura;

import java.util.Scanner;

public class Exercicio02 {
	/*
	 * 2) Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um
	 * número qualquer.
	 * 
	 */

	public void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um número para a tabuada: ");
		int numero = sc.nextInt();

		System.out.println("A tabuada de multiplicação para o número " + numero + " é:");
		for (int i = 1; i <= 10; i++) {
			int resultado = numero * i;

			System.out.println(numero + " x " + i + "=" + resultado);
		}
	}
}
