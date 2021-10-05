import java.util.Locale;
import java.util.Scanner;

public class CadLoja {


	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		String codigoProduto[] = {"X01","X02","X03"};
		String nomeProduto [] = {"Cal�a","Camisa","Saia"};
		int estoque [] = {20,20,20};
		double valorProduto[] = {100.50, 50.75, 70.99};
		String AuxCodigo;
		int teste=0;
		int auxQtde = 0;
		
		System.out.println("Loja da turma 37");
		System.out.println();
		System.out.println("COD\tProduto\tEstoque\tValor");
		for(int x=0; x<nomeProduto.length; x++) {
		System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto [x],estoque [x],valorProduto[x]);
	
		}
		System.out.println();
		System.out.println("Digite o c�digo do produto que deseja comprar :");
		AuxCodigo = leia.next().toUpperCase();
		
		System.out.println("Produto escolhido");
		System.out.println("COD\tProduto\tEstoque\tValor");
		for(int y = 0; y<nomeProduto.length; y++) {
			if(codigoProduto[y].equals(AuxCodigo)) {
			System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[y],nomeProduto [y],estoque [y],valorProduto[y]);
			teste = y;
			break;
			}else {
				teste++;
			}
			
		}
		if(teste==nomeProduto.length) {
			System.out.println("Produto n�o encontrado");
		}else {
			System.out.println("Quantos voc� deseja comprar: ");
			auxQtde = leia.nextInt();
			if(estoque[teste]==0) {
				System.out.println("Produto indisponivel");
			}
			if(auxQtde > estoque[teste]) {
				System.out.println("Quantidade indisponivel");
				
			}
			else {
				System.out.println("Total a pagar "+(auxQtde*valorProduto[teste]));
			    estoque[teste] -= auxQtde;
			}
		}System.out.println("P�S VENDA");
		System.out.println("COD\tProduto\tEstoque\tValor");
		for(int x=0; x<nomeProduto.length; x++) {
		System.out.printf("%s\t%s\t%d\t%.2f\n",codigoProduto[x],nomeProduto [x],estoque [x],valorProduto[x]);
	
		}
	
	}
}
