package exercicios;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escolha o Combustível:");
		System.out.printf("1 - Álcool %n2 - Gasolina %n3 - Diesel %n4 - Fim %n8 ");
		
		int tipoCombustivel = entrada.nextInt(); 
		int Alcool = 0;
		int Gasolina = 0;
		int Diesel = 0;
		
		while (tipoCombustivel != 4) {
			
			if (tipoCombustivel == 1){
				Alcool = Alcool + 1;
				
			} else if (tipoCombustivel == 2){
				Gasolina = Gasolina + 1; 
				
			} else if (tipoCombustivel == 3) {
				Diesel = Diesel + 1;
				
			} else {
				System.out.println("Digite um número válido! ");
			}
			
			tipoCombustivel = entrada.nextInt();
		} 
		
		System.out.println("Muito Obrigado");
		System.out.printf("Alcool: %d %nGasolina: %d %nDiesel: %d", Alcool, Gasolina, Diesel);
		
		entrada.close();
	}
}
