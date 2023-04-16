package exercicios;

import java.util.Scanner;

public class Exercicio_30 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		for (int i=1; i <= numero; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		entrada.close();
	}

}
