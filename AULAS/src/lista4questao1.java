import java.util.Scanner;

public class lista4questao1 {

	/*
	 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de
	 * uma atividade e o escreva em seguida. Encontre após a maior pontuação e a
	 * apresente.
	 */

	public static void main(String[] args) {
		int[] notas;
		int maiorNota;

		while (true) {
			notas = new int[5];
			maiorNota = 0;

			for (int x = 0; x < notas.length; x++) {
				System.out.print("Digite a " + (x+1) + "º nota: ");
				notas[x] = new Scanner(System.in).nextInt();

				if (notas[x] > maiorNota) {
					maiorNota = notas[x];
				}
			}
			System.out.printf("A maior nota é: %d ", maiorNota);
		}

	}
}

