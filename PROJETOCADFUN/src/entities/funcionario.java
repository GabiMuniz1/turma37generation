package entities;

public class funcionario {
		//Atributos
		
			private String matricula;
			private String nome;
			private int horasTrabalhadas;
			private double valorHora;
			
			public funcionario(String matricula,String nome,int horasTrabalhadas,double valorHora) {
				
				this.matricula=matricula;
				this.nome=nome;
				this.horasTrabalhadas=horasTrabalhadas;
				this.valorHora=valorHora;
				
			}

			public String getMatricula() {
				return matricula;
			}

			public void setMatricula(String matricula) {
				this.matricula = matricula;
			}

			public String getNome() {
				return nome;
			}

			public void setNome(String nome) {
				this.nome = nome;
			}

			public int getHorasTrabalhadas() {
				return horasTrabalhadas;
			}

			public void setHorasTrabalhadas(int horasTrabalhadas) {
				this.horasTrabalhadas = horasTrabalhadas;
			}

			public double getValorHora() {
				return valorHora;
			}

			public void setValorHora(double valorHora) {
				this.valorHora = valorHora;
			}
		

	

}
