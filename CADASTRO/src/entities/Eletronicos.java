package entities;

public class Eletronicos {

		public String tipoPc;
		public String processadorPc;
		public String sistemaOperacional;
		public String memoriaRam;
		public String hD;
		
		
		
		//M�todos
		public void tipoPc() {
			System.out.printf("Tipo de PC: "+tipoPc);
		}
		public void exibirProcessadorPc() {
			
			System.out.printf("\nModelo: "+processadorPc);
		}
		public void exibirSistemaOperacional() {
			
			System.out.printf("\nSO: "+sistemaOperacional);
			
		}
		public void exibirMemoriaRam() {
			System.out.printf("\nMem�ria RAM: "+memoriaRam);
		}
		
		public void exibirhD() {
			System.out.println("\nHD: "+hD);
		}
}