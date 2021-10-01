programa
{
	
	funcao inicio()
	{
		/*2- Crie um algoritmo que leia uma senha fornecida pelo usuário composta por caracteres para informar se a senha é válida ou
		 * inválida. A senha do sistema corresponde a palavra “PORTUGOL”. Obs.: O algoritmo não faz distinção de letras maiúsculas e
		 * minúsculas.
		 */

		 cadeia usuario
		 caracter senha 
		 caracter valido

		 escreva("Digite o seu nome de usuário: ")
		 leia(usuario)

		 limpa()
		 escreva("Digite sua senha: ")
		 leia(senha)
		 
		 limpa()
		 escreva("Digite sua senha novamente: ")
		 leia (valido)
		 
		 limpa()
		 se(senha == valido){
		 	escreva("\nSeja bem vinde ",usuario," !")
		 }senao{
		 	escreva("\nSua senha é inválida.")
		 }
		 
		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 551; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {usuario, 11, 10, 7}-{senha, 12, 12, 5}-{valido, 13, 12, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */