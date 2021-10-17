package entities;

import java.util.Scanner;

public class Pagamento {
	/*
	 * VALOR TOTAL DA COMPRA MOSTRA 9% IMPOSTO EM CIMA DO VALOR TOTAL OP��ES DE
	 * PAGAMENTO - 1 A VISTA COM 10% DESCONTO OP��O 2 - NO CART�O COM ACRESCIMO DE
	 * 10% OP��O 3 � EM DUAS VEZES COM 15% TOTAL DE ACRESCIMENTO - TEM QUE MOSTRA O
	 * VALOR DE CADA PARCELA MOSTRA A NOTA FISCAL [SIMULADO] FINAL
	 * 
	 * que coisas eu tenho (Atributos)
	 * 
	 * que coisas eu fa�o (M�todos)
	 * 
	 * como eu estou agora? (Estados)
	 */

	private double valorTotal;
	private double desconto;
	private double parcelado;
	private double juros;
	private double subPagamento;
	

	// Construtor
	public Pagamento(double valorTotal, double desconto, double parcelado, double juros,double subPagamento) {
			
			this.valorTotal = valorTotal;
			this.desconto = desconto;
			this.parcelado = parcelado;
			this.juros = juros;
			this.subPagamento = subPagamento;
			
	}
			//ENCAPSULAMENTO
		
		public double getValorTotal() {
			return valorTotal;
		}
		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}
		public double getDesconto() {
			return desconto;
		}
		public void setDesconto(double desconto) {
			this.desconto = desconto;
		}
		public double getParcelado() {
			return parcelado;
		}
		public void setParcelado(double parcelado) {
			this.parcelado = parcelado;
		}
		public double getJuros() {
			return juros;
		}
		public void setJuros(double juros) {
			this.juros = juros;
		}
		
		public double getSubPagamento() {
			return subPagamento;
		}

		public void setSubPagamento(double subPagamento) {
			this.subPagamento = subPagamento;
		}
		
		
		//METODOS
		
		public void subValor() {
			System.out.println("subPagamento");
			
			
			
			
			System.out.println("Digite 1 - Pagamento a vista \n Digite 2  - Pagamento no cart�o \nDigite 3 - Pagamento parcelado");
		}

		public void desconto() {
			System.out.println("OP��O AVISTA");
			System.out.print("\n1. � vista com 10% de desconto (R$"+Math.ceil((valorTotal - (valorTotal*0.1)))+")");
		}
		
		public void juros() {
			System.out.println("OP��O CART�O");
			System.out.print("\n2. No cart�o com acr�scimo de 10% (R$"+Math.ceil((valorTotal + (valorTotal*0.1)))+")");
		}
		
		public void parcelado() {
			System.out.println("OP��O PARCELADO");
			System.out.print("\n3. 2x no cart�o com 15% de acr�scimo (2x R$"+Math.ceil((valorTotal + (valorTotal*0.15))/2)+")");
		}
		
		public void valorTotal() {
			System.out.println("VALOR TOTAL");
			/*if (opPagamento<1 || opPagamento>3){
					System.out.print("\nOp��o inv�lida, tente novamente!!");
				}
				else if (opPagamento==1){
					totalPagamento = Math.ceil(valorTotal - (valorTotal*0.1));
				}
				else if (opPagamento==2){
					totalPagamento = Math.ceil(valorTotal + (valorTotal*0.1));
				}
				else if (opPagamento==3){
					totalPagamento = Math.ceil((valorTotal + (valorTotal*0.15))/2);
				}
			 * 
			 */
			if(desconto == 1) {
				System.out.println("Seu desconto � de 10%"+(valorTotal - (valorTotal*0.1)));
				
			}
			else if(juros == 2) {
				System.out.print("\n2. No cart�o com acr�scimo de 10% (R$"+Math.ceil((valorTotal + (valorTotal*0.1)))+")");
			}
			else if (parcelado == 3) {
				System.out.print("\n3. 2x no cart�o com 15% de acr�scimo (2x R$"+Math.ceil((valorTotal + (valorTotal*0.15))/2)+")");
			}
				
			}

		

}
