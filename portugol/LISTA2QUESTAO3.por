programa 
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		real n1, n2, n3, n4
		escreva("Digite 4 números!\n")
		
		escreva("Primeiro número:")
		leia(n1)

		escreva("Segundo número:")
		leia(n2)

		escreva("Terceiro número:")
		leia(n3)

		escreva("Quarto número:")
		leia(n4)

		mat.potencia(n1,2)
		mat.potencia(n2,2)
		mat.potencia(n3,2)
		mat.potencia(n4,2)

		se(n3 >= 1000){
			escreva("O terceiro valor do número ao quadrado ultrapassa 1000 com o valor de:\n",n3)
		}
		senao{
			escreva("\nO quadrado do primeiro valor é igual a:",n1)
			escreva("\nO quadrado do segundo valor é igual a:",n2)
			escreva("\nO quadrado do terceiro valor é igual a:",n3)
			escreva("\nO quadrado do quarto valor é igual a:",n4)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 390; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */