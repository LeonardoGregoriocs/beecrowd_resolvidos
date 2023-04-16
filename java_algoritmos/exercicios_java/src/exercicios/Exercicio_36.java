package exercicios;

import java.util.Scanner;

public class Exercicio_36 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i=1; i<=numero; i++) {
			
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}
		
		entrada.close();
	}

}
