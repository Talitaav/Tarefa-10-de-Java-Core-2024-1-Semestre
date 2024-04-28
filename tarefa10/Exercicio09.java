package estrutura;

public class Exercicio09 {
	/*
	 * 9) Escreva um programa que apresente a série de Fibonacci até o décimo quinto
	 * termo. A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13,
	 * 21, 34, ..., etc. Esta série se caracteriza pela soma de um termo atual com o
	 * seu anterior subseqüente, para que seja formado o próximo valor da seqüência.
	 * Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo é
	 * 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
	 */

	public static void main(String[] args) {
		System.out.println("Série de Fibonacci até o décimo quinto termo:");

		int t1 = 1;
		int t2 = 1;

		System.out.print(t1 + ", " + t2);

		for (int i = 3; i <= 15; i++) {
			int proximot = t1 + t2;
			System.out.print(", " + proximot);

			t1 = t2;
			t2 = proximot;
		}
		
		System.out.println();
	}
}
