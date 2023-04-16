package buy_dollars;

import java.util.Locale;
import java.util.Scanner;

import buy_dollars.CurrencyConverter;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		System.out.println("What is the dollar price: ");
		double dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought: ");
		double amount = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.dollarToReal(amount, dollarPrice));
		
	}
	
}
