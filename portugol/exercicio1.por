programa
{
	
	funcao inicio(){
	//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses edias e mostre-a expressa apenas em dias.
	inteiro diasAno  = 365
	inteiro diasMes = 30
	inteiro dia
	inteiro mes
	inteiro ano

	escreva("Qual o idade : ")
	leia(ano)
	
	escreva("Qual o mês : ")
	leia(mes)

	escreva("Qual o dia : ")
	leia(dia)

	dia = (ano * diasAno) + (mes * diasMes)
	escreva ("A sua idade em dias é: " + dia)
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */