package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_33 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i=0; i<numero; i++) {
			int x = entrada.nextInt();
			int y = entrada.nextInt();
			
			if (y == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double resultado = (double) x / y;	
				System.out.println(resultado);	
			}		
		}
		
		entrada.close();
	}

}
