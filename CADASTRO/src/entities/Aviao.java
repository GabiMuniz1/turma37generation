package entities;

public class Aviao {

	//Atributos
	public String uso;
	public String piloto;
	public char publico;
	public char privado;
	public String empresa;
	public String tipoAeronave;
	public int capacidade=0;
	public int horas = 0;

	
	//Métodos
	
			public void exibirEmpresa() {
				
				System.out.println("Bem vindo a "+ empresa);
			}
			public void exibirCapacidade() {
				
				System.out.println("Aqui temos aeronaves com capacidade de até: "+capacidade+ " passageiros!");
				
			}
		
			public void exibirUso() {
				System.out.println("A aeronave será para uso: "+uso+".");
			}
			
			public void exibirHoras() {
				System.out.println("A aeronave será alugada para um voo de: "+horas+" horas.");
			}
			public void exibirPiloto() {
				System.out.println("O aluguel da aeronave será com piloto "+piloto+".");
			}
				/*if (uso == "Publico") {
					
					System.out.println(+publico);
					System.out.println("Público");
			}
				else if (uso == "Privado") {
					
					System.out.print(+privado);
					System.out.println("Privado");
					}
				}*/
					
			public void exibirTipoAeronave( ) {
				System.out.println("O modelo escolhido foi "+ tipoAeronave);
			}
				
				/*if (tipoAeronave == 'A') {
					
					System.out.printf("Modelo escolhido "+tipoAeronave+" - Monomotor.\n");
					
				}
				else if (tipoAeronave == 'B') {
					
					System.out.printf("Modelo escolhido: "+tipoAeronave+" - Bimotor.\n");
				}
				else if (tipoAeronave == 'C') {
					
					System.out.printf("O modelo: "+tipoAeronave+" - Trimotor.\n");
				}
				else {
					
					System.out.printf("O modelo "+tipoAeronave+" - Quadrimotor.\n");
				}*/
			}