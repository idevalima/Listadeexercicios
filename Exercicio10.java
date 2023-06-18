package listaexercicio1;
import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    System.out.println("temperatura em ºc");
	    double celsios = entrada.nextDouble();
	    double  fahrenheit = (celsios * 9/5) + 32;
	    System.out.println("temperatura em ºf \n" + fahrenheit);
	  }
}
