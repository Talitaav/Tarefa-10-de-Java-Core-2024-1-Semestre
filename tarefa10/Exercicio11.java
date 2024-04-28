package estrutura;

public class Exercicio11 {

	public static void main(String[] args) {
		System.out.println("Fatorial dos valores ímpares de 1 a 10:");

		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				int fatorial = calcularFatorial(i);
				System.out.println("O fatorial de " + i + " é: " + fatorial);
			}
		}
	}

	public static int calcularFatorial(int n) {
		int fatorial = 1;
		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
