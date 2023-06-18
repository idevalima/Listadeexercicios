package listaexercicio1;
import java.util.Scanner;
public class Exercicio9 {
	 public static void main(String[] args) {
		    Scanner entrada = new Scanner(System.in);
		    System.out.println("Digite a temperatura em Fahrenhei");
		    double temperatura = entrada.nextDouble();
		    double grauscelcios = 5 * ((temperatura -32) / 9);
		    System.out.println("temperatura graus celcios\n" + grauscelcios);
		  }
}
