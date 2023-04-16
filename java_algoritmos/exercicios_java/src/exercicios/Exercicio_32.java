package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_32 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();

		for (int i=0; i<numero; i++) {
			
			double x = entrada.nextDouble();
			double y = entrada.nextDouble();
			double z = entrada.nextDouble();
			
			double media =  (x * 2.0 + y * 3.0 + z * 5.0)/10.0;
			
			System.out.printf("%.1f%n", media);
		
		}
		entrada.close();

}
}
