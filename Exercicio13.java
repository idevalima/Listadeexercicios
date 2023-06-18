package listaexercicio1;
import java.util.Scanner;
public class Exercicio13 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner(System.in);
	    double h, pesoIdeal;
	    String sexo;
	    System.out.println("Informe a Altura");
	    h = entrada.nextDouble();
	    System.out.println("Informe O Sexo (M - Masculino; F - Feminino:");
	    sexo = entrada.next();
	    if (sexo.equals("F")) {
	      pesoIdeal = (62.1 * h) - 44.7;
	    } else {
	      pesoIdeal = (72.7 * h) - 58;
	    }
	    System.out.println("Pseso Ideal é\n" + pesoIdeal);

	  }
}
