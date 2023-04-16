package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_17_debug {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double largura = entrada.nextDouble();
		double comprimento = entrada.nextDouble();
		double metroQuadrado = entrada.nextDouble();
		
		double area = largura * comprimento; 
		double preco = area * metroQuadrado; 
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		entrada.close();
		
	}

}
