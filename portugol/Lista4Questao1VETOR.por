programa
{
	
	funcao inicio()
	{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
	**atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	 */

		//VARIAVEIS	 
		inteiro pontos[5]		
		inteiro maiorPontos=0

		para(inteiro x=0; x<5; x++){
			escreva("Digite a pontuação das atividades: ")
			leia(pontos[x])
			se(pontos[x] > maiorPontos){
					maiorPontos = pontos[x]
			
			}
			
								
		}
		para(inteiro x=0; x<5; x++){
			escreva("\nA atividade ", x+1," Recebe o valor de: ",pontos[x],"\n")
				}
		
			escreva("\nA maior pontuação da atividade é: "+ maiorPontos)	
	}
		
			
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 583; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */