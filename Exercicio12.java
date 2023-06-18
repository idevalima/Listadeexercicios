package listaexercicio1;
import java.util.Scanner;
public class Exercicio12 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	   double altura = entrada.nextDouble();
	    System.out.println("digite sua Altura");
	  double pesoIdeal = (72.7 * altura) - 58;
	    System.out.println("Seu Peso Ideal é"+ pesoIdeal);
	  }
}
