package listaexercicio1;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
	    Scanner Entrada = new Scanner (System.in);
	    System.out.println("digite a medida");
	    double lado = Entrada.nextDouble();
	    double Area = lado * lado;
	    System.out.println("a area e" + Area * 2);
	  }
}
