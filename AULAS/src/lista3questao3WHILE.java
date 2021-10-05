import java.util.Scanner;

public class lista3questao3WHILE {
	/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		idade for =-99.
	 * 
	 */

	public static void main(String[] args) {
		int idade = 0,menor= 0,maior= 0 ;
		Scanner leia =  new Scanner(System.in);
		
		while(idade!=-99) {
			System.out.print("Digite sua idade:\n");
			idade = leia.nextInt();
			System.out.println("Digite -99 para finalizar o programa");

			
			if(idade> 0 && idade< 21) {
				menor += 1;
			}
			if(idade >50) {
				maior += 1;
			}
		}
		System.out.printf("O total de pessoas com menos de 21 anos foram: "+menor);
		System.out.printf("\nO total de pessoas com mais de 50 anos foram: "+maior);
	}

}
