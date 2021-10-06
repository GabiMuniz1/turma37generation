package AulasReforco;

import java.util.Scanner;

public class exercicioTabuada {

	

	public static void main(String[] args) {
		int [] tabuada = new int [11];
		int num = 0;
		Scanner leia = new Scanner(System.in);
		
		for(int x=0; x<11;x++) {
			System.out.println("Digite a tabuada que deseja aparecer:");
			num = leia.nextInt();
			if(num > 0) {
				num = num * x;
				
			}
			System.out.printf("A tabuada é:\n%d",num);
		}

	}

}
