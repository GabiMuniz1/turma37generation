programa
{
	
	funcao inicio()
	{
		/*	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
			em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
			diagonal, ou seja, diagonal principal.
		 */
		 //variaveis
		 inteiro mat[3][3]
		 inteiro soma = 0,diagonal = 0

		 //processamento
		 para(inteiro x=0; x<3;x++){
		 	para(inteiro y=0; y<3; y++){
		 		escreva("Digite 10 valores: ")
		 		leia(mat[x][y])
		 		soma+= mat[x][y]
		 		se(x==y){
		 				diagonal+=mat[x][y]	}
		 		
		 	}
		 
		 	
		 }
		 //saída
		 escreva("\nA soma dos valores da diagonal principal é: ",diagonal)
		 escreva("\nA soma de todos os valores da matriz é: ",soma)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 620; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {mat, 11, 11, 3};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */