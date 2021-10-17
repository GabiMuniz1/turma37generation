package entities;

import java.util.Scanner;

public class ContaEspecial extends Conta  {
	/*Usar o limite do saldo se no momento do movimento o saldo fica negativo,
	 * ajusta no saldo e diminuir no limite.Limite de R$ 1.000.
	 */
	
	private double limite = 1.000;

	public ContaEspecial(int numero, String cpf, double limite) {
		super(numero, cpf);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public double setLimite(double limite) {
		return this.limite = limite;
	}
	
	
	
		public void usarLimite () {
			if(saldo  < 0 ) {
				limite-= limite;
				
			}
			 setLimite(this.limite - this.saldo);
		
	}
	

}
