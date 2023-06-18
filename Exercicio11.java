package listaexercicio1;
import java.util.Scanner;
public class Exercicio11 {

	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    System.out.println("digite primeiro numero ");
	   double num1 = entrada.nextInt();
	    System.out.println("digite segundo numero");
	    double num2 = entrada.nextInt();
	    System.out.println("digite terceiro numero");
	      double num3 = entrada.nextDouble();
	    double res1 = ((num1 * 2) + num2 /2);
	    double res2 = ((num1 * 3) + num3);
	    double res3 = num3 * num3 * num3;
	    System.out.println("Doblo do 1º com metade do 2º\n" + res1);
	    System.out.println("triplo do primeiro mais o terceiro \n" + res2);
	    System.out.println("terceiro elevado ao cubo \n" + res3);
	  }
}
