package listaexercicio1;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[] args){
	    Scanner entrada = new Scanner(System.in);
	      int nota1;
	      int nota2;
	      int nota3;
	      int nota4;
	    int soma;
	    System.out.println("digite primeira nota");
	    nota1 = entrada.nextInt();
	    System.out.println("digite segunda nota");
	      nota2 = entrada.nextInt();
	    System.out.println("digite terceira nota");
	    nota3 = entrada.nextInt();
	    System.out.println("digite quarta nota");
	    nota4 = entrada.nextInt();
	    soma = nota1 + nota2 + nota3 + nota4;
	    System.out.println("média igual a " + soma /4);
	  }
}
