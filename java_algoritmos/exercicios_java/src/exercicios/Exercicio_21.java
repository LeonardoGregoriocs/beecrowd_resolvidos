package exercicios;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		int soma = 0;
		
		for (int i=0; i<numero; i++) {
			int x = entrada.nextInt();
			soma = soma + x;
		}
		
		System.out.println(soma);
		
		entrada.close();

	}

}
