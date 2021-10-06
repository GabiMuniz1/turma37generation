import java.util.Scanner;

public class lista4questao4 {

	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3,
	 * e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
	 * diagonal, ou seja, diagonal principal.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[][] = new int[3][3];
		int soma = 0, diagonal = 0;
		int linha, coluna,soma1 = 0,somad = 0;
		Scanner leia = new Scanner(System.in);

		System.out.println("mat[3][3]\n");

		for (linha = 0; linha < 3; linha++) {
			for (coluna = 0; coluna < 3; coluna++) {

				System.out.printf("Digite o elemento da mat[%d][%d]: ", linha + 1, coluna + 1);
				mat[linha][coluna] = leia.nextInt();

			}
		}

		for(linha=0;linha < mat.length;linha++) {
			for(coluna = 0;coluna<mat[linha].length;coluna++){
				soma1 += mat[linha][coluna];
			}
		}
		System.out.println("\n");
		System.out.printf("A soma de todos os valores da matriz é: %d",soma1);
		
		
		somad= mat[0][0] + mat[1][1] + mat[2][2];
		System.out.printf("\nO total da soma da diagonal principal é: %d",somad);
		
	}

}
