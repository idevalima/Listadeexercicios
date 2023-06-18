package listaexercicio1;
import java.util.Scanner;
public class Ecercicio8 {
	public static void main(String[] args) {
	    Scanner entrada = new Scanner (System.in);
	    System.out.println("valor hora");
	    double valorhora = entrada.nextDouble();
	    System.out.println("quantidade horas");
	    double quantashoras = entrada.nextDouble();
	    double mes = valorhora * quantashoras;
	    System.out.println("valor mensal e" + mes);
	  }
}
