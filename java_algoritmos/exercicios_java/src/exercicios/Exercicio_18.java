package exercicios;

import java.util.Scanner;

public class Exercicio_18 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
	
		int senha = entrada.nextInt();
		
		while (senha != 2002) {
			System.out.println("Senha Inválida");
			senha = entrada.nextInt();
		}
		
		System.out.println("Acesso Permitido!");
		
		entrada.close();

	}
}
