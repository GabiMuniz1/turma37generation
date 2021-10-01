programa
{
	
	funcao inicio()
	{
		real indiciePoluicao = 0.00

		escreva("Digite o indice de poluição atual:")
		leia(indiciePoluicao)

		se (indiciePoluicao<= 0.29){
			escreva("Indicie Aceitavel!")
		}
		senao se (indiciePoluicao<=0.4){
			escreva("Grupo 1 - suspenda suas atividade")
		}
		senao se(indiciePoluicao<0.5){
			escreva("Grupo 1 e 2 suspendam suas atividades")
		}

		senao {
		
			escreva("Todos os grupos suspendam suas atividades")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 395; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */