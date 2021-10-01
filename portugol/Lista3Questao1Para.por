programa
{
	inclua biblioteca Matematica --> Mat
	
	funcao inicio()
	{
	/*	A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes,
		coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
		a) média do salário da população;
		b) média do número de filhos;
		c) maior salário;
		d) percentual de pessoas com salário até R$100,00.
		2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são
		múltiplos de três e que se encontram no conjunto dos números de 1 até 500.
	 * 
	 */
	 	
			inteiro popu = 3
			inteiro filhos = 0
			real salario = 0.00
			real mediaSala = 0.00 
			real totalSala = 0.00
			real maiorSala = 0.00
			real mediaFilhos = 0.00
			real totalFilhos = 0.00
			real total100 = 0.00
			
			//comentario de teste
			//para testar o git
			para(inteiro x=1; x<=popu; x++){
				escreva ("Digite o salário: ")
			leia(salario)
			totalSala = totalSala + salario
			se(salario > maiorSala){
				maiorSala = salario
			}
			se(salario <= 100){
				total100++
			}

			escreva("Digite o número de filhos:")
			leia(filhos)
			totalSala = totalSala + salario
			totalFilhos = totalFilhos + filhos	
			
			}
			mediaSala = totalSala / popu
			mediaFilhos = totalFilhos / popu
			total100 = (total100 / popu)*100
			
			escreva("\n Média salarial: R$",Mat.arredondar(mediaSala, 2))			
			escreva("\n Maior sálario é : R$",Mat.arredondar(maiorSala, 2))
			escreva("\n salários até R$ 100,00: ",Mat.arredondar(total100, 2)," %")
			escreva("\n Média de filhos: ",Mat.arredondar(mediaFilhos, 2))
			
		}
	}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 815; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */