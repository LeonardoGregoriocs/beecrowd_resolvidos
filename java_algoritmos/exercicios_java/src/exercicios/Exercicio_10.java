package exercicios;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A = entrada.nextInt();
		int B = entrada.nextInt();
		
		
		if (A % B == 0 || B % A == 0) {
			System.out.println("São multiplos");
		} else {
			System.out.println("Não são multiplos");
		}
		
		entrada.close();
		
	}

}

