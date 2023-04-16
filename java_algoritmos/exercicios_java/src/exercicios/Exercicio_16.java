package exercicios;

import java.util.Scanner;

public class Exercicio_16 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = entrada.nextInt();
		
		int soma = 0;
		while (x != 0) {
			soma = soma + x;
			x = entrada.nextInt();
		}
		
		System.out.println(soma);
		
		entrada.close();

	}
}
