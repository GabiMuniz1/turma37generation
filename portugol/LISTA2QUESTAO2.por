programa
{
	
	funcao inicio()
	{
		inteiro horasTrabalho, salarioTrabalho, salarioExtra, horaExtra

		escreva("digite a quantidade de horas trabalhadas")
		leia(horasTrabalho)

		escreva("digite a quantidade de horas extra")
		leia(horaExtra)

		salarioTrabalho = horasTrabalho * 10
		salarioExtra = horaExtra * 20
		se(horaExtra > 50){
			escreva("Suas horas extras totalizam:",horaExtra)	
		}
		senao {
			escreva("Seu salário mensal é:", salarioTrabalho)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */