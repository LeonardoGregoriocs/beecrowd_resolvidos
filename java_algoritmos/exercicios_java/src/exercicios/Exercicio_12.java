package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int escolha = entrada.nextInt();
		int quantidade = entrada.nextInt();
		
		double total = 0;
		
		if (escolha == 1) {
			total = quantidade * 4.00;
			
		} else if (escolha == 2) {
			total = quantidade * 4.50;
			
		} else if (escolha == 3) {
			total = quantidade * 5.00;

		} else if (escolha == 4) {
			total = quantidade * 2.00;
			
		} else if (escolha == 5){
			total = quantidade * 1.50;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		entrada.close();
	}

}