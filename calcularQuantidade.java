package compraTinta;
import java.util.Scanner;

public class calcularQuantidade {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int cobTinta = 3;
		int capLata = 18;
		double precoLata = 80.00;		
		
		System.out.println("Informe o tamanho da area em m²");
		int tamArea = ent.nextInt();
		int litros  = (tamArea/cobTinta);
		int lataInteira = litros/capLata;
		
		if (litros % capLata != 0) {
		lataInteira +=1;
		}
		System.out.println("quantidade de litros \n" + litros );
		System.out.println("Quantidade de latas \n"+ lataInteira);
		System.out.println("Valor total \n"  + lataInteira * precoLata + "reais");
		
	}

}
