package listaexerc;
import java.util.Scanner;
public class exerc18 {
public static void main(String[] args) {
	Scanner ent = new Scanner (System.in);
	System.out.println("Informe o tamanho do arquivo?");
	double tamArquivo = ent.nextDouble();
	System.out.println("Informe a velocidade da internet em mbps?");
	double velInternet = ent.nextDouble();
	
	ent.close();
	double tempo = ((tamArquivo*8) / velInternet) / 60;
	 
	System.out.println("o tempo de download e:%.2f \n" + tempo );
	
	
}
}
