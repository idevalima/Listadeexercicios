package listaexercicio1;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args){
	     Scanner Entrada = new Scanner(System.in);
	      System.out.println("digite o raio");
	       double raio = Entrada.nextDouble();
	      double area = 3.1425 *raio * raio;
	      System.out.println("a area e " + area + " M²");
	    }
}
