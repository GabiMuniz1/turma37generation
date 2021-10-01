programa 
{
	
	funcao inicio()
	{		
			
			cadeia res
			cadeia relacaoProduto [4] ={"RELAÇÃO PRODUTO","COD","VALOR R$","ESTOQUE"}
		
			escreva("G2 GEEK")
			escreva("\nDÊ UM START NO SEU ESTILO")

			escreva("\nDESEJA FAZER COMPRAS S/N?")
			leia (res)

			se(res == "S"){
			para(inteiro i = 0; i <= 4; i++){
				escreva(relacaoProduto[i],"\n")
			
			
			}
			
			}
						
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 309; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {relacaoProduto, 8, 10, 14};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */