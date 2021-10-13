package app;

import java.util.Scanner;
import entities.Aviao;

public class ExAviao {

	public static void main(String[] args) {
		//OBJETo
		Aviao viagem1 = new Aviao();
		Scanner ler = new Scanner (System.in);
			
		//ENTRADAS
			viagem1.empresa = "GEN Airline";
			viagem1.capacidade = 1000;
			viagem1.tipoAeronave= "Trimotor";
			viagem1.uso = "Privado";
			viagem1.horas = 2;
			viagem1.piloto = "Epaminondas";
		
		//SAIDA
			viagem1.exibirEmpresa();
			viagem1.exibirCapacidade();
			viagem1.exibirTipoAeronave();
			viagem1.exibirUso();
			viagem1.exibirHoras();
			viagem1.exibirPiloto();
			
			
			/*System.out.println("\nEscolha o tipo de aeronave que deseja viajar: \n A - Monomotor | B - Bimotor | C - Trimotor | D - Quadrimotor");
			viagem1.tipoAeronave = ler.next().toUpperCase().charAt(0);//charAt, é so qd declarar como int ou char
			viagem1.exibirTipo();
			
			System.out.println("\nInforme a que se destina o uso da aeronave: \n 1 - Público | 2 - Privado ");
			viagem1.uso = ler.next().toUpperCase().charAt(0); 
			viagem1.exibirUso();*/
			
			System.out.printf("\nVocê solicitou uma aeronave ");
			System.out.printf("\nEm breve a empresa entrará em contato");
	}

}