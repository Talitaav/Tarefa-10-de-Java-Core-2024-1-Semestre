package estrutura;

public class Exercicio06 {
	/*
	 * 6) Apresentar todos os números divisíveis por 4 que sejam menores que 200.
	 * Para verificar se o número é divisível por 4, efetuar dentro da malha a
	 * verificação lógica desta condição com a
	 * 
	 */
	public static void main(String[] args) {

		System.out.println("Números divisíveis por 4 menores que 200:");

		for (int i = 1; i < 200; i++) {
			if (i % 4 == 0) {

				System.out.println(i);
			}

		}

	}

}
