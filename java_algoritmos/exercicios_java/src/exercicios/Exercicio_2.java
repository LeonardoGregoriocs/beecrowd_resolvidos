package exercicios;
import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		numero1 = entrada.nextInt();
		numero2 = entrada.nextInt();
		
		resultado = numero1 + numero2;
		
		System.out.println("SOMA = " + resultado);
	
		entrada.close();
	}

}