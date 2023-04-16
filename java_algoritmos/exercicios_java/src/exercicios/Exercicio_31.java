package exercicios;

import java.util.Scanner;

public class Exercicio_31 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = entrada.nextInt();
		int in = 0, out = 0;
		
		for (int i=1; i<=numero; i++) {
			int valor = entrada.nextInt();
			if (valor >= 10 && valor <= 20){
				in += 1;
			} else {
				out += 1;
			}
			
		}
		
		System.out.printf("%d in %n%d out", in, out);
		
		entrada.close();
	}

}
