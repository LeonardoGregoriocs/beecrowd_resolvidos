package exercicios;

import java.util.Scanner;

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int horaInicial = entrada.nextInt();
		int horaFinal = entrada.nextInt();
		int duracao; 
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24 - horaInicial + horaFinal;
		}
		
		System.out.printf("O jogo durou: %d hora(s)", duracao );
		
		entrada.close();
		
	}

}
