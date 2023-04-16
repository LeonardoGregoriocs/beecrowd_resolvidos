package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double valor, resultado;
		
		valor = entrada.nextDouble();
		
		resultado = 3.14159 * valor * valor;
		
		System.out.printf("A=%.4f%n", resultado);
		
		entrada.close();
		
	}

}
