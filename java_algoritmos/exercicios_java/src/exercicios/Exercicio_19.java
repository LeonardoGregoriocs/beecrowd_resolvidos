package exercicios;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		int y = entrada.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto");
				
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");

				
			} else {
				System.out.println("Segundo");
			}
			
			x = entrada.nextInt();
			y = entrada.nextInt();
			
		}
		
		entrada.close();
	}
}
