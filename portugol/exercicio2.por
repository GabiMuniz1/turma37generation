programa
{
	
	funcao inicio()
	{
		//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.

		inteiro dia 
		inteiro meses
		inteiro anos 
		inteiro dias

		escreva("Digite a idade em dias:")
		leia(dias)
		anos =  (dias/365)
		meses = (dias%365)/30
		dia = (dias%365)%30
		escreva("A idade final é "+ anos+" anos,"+meses+" meses e "+dia+" dias") 
		
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