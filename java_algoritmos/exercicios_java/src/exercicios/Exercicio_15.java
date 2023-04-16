package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double salario = entrada.nextDouble();
		double valorImposto;
		
		if (salario <= 2000.00) {
			valorImposto = 0.0;
			
		} else if (salario <= 3000.00) {
			valorImposto = (salario - 2000.0) * 0.08; 
			
		} else if (salario <= 4500.00) {
			valorImposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08; 
			
		} else {
			valorImposto = (salario - 4500) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.8;		
		}
		
		if (valorImposto == 0.0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n",valorImposto);
		}
			
		
		entrada.close();
	}

}

