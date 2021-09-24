programa
{
	
	funcao inicio()
	{
	
		inteiro p , excesso , m
		escreva("Qual o o peso total de tomates?")
		leia(p)

		excesso = p-50

		m= excesso*4

		se(excesso<=0){
			escreva("não há peso escedente")
		}
		senao se(excesso >0){
			escreva("Possuí",excesso," quilos a mais, sua multa é de",m,"reais")
		}
		senao se (p<0){
			escreva("invalido")
		}
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 212; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */