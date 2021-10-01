import java.util.Scanner;

public class LISTA1QUESTAO3 {

	public static void main(String[] args) {
		int horas, min,segundos, seg;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite a duração do evento em segundos:  ");
		segundos = leia.nextInt();
		horas = (segundos/3600);
		min =((segundos % 3600)/60);
		seg = ((segundos %3600)%60);
		System.out.println("A duração do evento foi de "+ horas+" horas,"+min+" minutos,"+seg+" segundos.");
	}

}
