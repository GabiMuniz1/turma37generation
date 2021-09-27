programa
{
	
	funcao inicio()
	{
		cadeia aluno
		inteiro nota
		inteiro totalNotas= 0
		real media = 0.00
		inteiro maiorNota=0 
		
		//contador
		//totalizador	
		//comaparação - inversão
		escreva("Escreva o nome :")
		leia(aluno)

		para(inteiro x=1; x<=4; x++){
			
			escreva("digita a nota ",x," : ")
			leia(nota)
			totalNotas= totalNotas + nota
			se(nota > maiorNota){
				maiorNota = nota
			}
		}
		media = totalNotas / 4.00
			escreva("Oi ",aluno,"sua media de notas foi ",media+"\n")
			escreva("Sua maior nota foi ",maiorNota)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 535; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */