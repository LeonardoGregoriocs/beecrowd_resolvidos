package exercicios;
import java.util.Scanner;

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int A, B, C, D, diferenca;
		
		A = entrada.nextInt();
		B = entrada.nextInt();
		C = entrada.nextInt();
		D = entrada.nextInt();
		
		diferenca = (A * B - C * D);
		
		System.out.println("DIFERENCA = " + diferenca);
		
		entrada.close();
		
	}

}