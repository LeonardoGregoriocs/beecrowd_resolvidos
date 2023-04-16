package exercicios;

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		
		int fatorial = 1;
		for (int i=1; i<=numero; i++) {
			fatorial = fatorial * i;
		}
		
		System.out.println(fatorial);
		
		entrada.close();
	}

}
