package estrutura;

public class Exercicio07 {
	/*
	 * 7) Apresentar os resultados das potências de 3, variando do expoente 0 até o
	 * expoente 15. Deve ser considerado que qualquer número elevado a zero é 1, e
	 * elevado a 1 é ele próprio. Observe que neste exercício não pode ser utilizado
	 * o operador de exponenciação do portuguol (^).
	 */

	public static void main(String[] args) {

		System.out.println("Resultados das potências de 3:");

		int base = 3;

		for (int expoente = 0; expoente <= 15; expoente++) {
			int resultado;

			if (expoente == 0) {
				resultado = 1;
			} else if (expoente == 1) {
				resultado = base;
			} else {

				resultado = base;
				for (int i = 2; i <= expoente; i++) {
					resultado *= base;
				}
			}
			System.out.println("3^" + expoente + " = " + resultado);
		}
	}

}
