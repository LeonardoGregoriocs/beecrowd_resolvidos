package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalhadas;
		double salarioPorHora, salarioTotal;
		
		numeroFuncionario = entrada.nextInt();
		horasTrabalhadas = entrada.nextInt();
		salarioPorHora = entrada.nextDouble();
		
		salarioTotal = horasTrabalhadas * salarioPorHora;
		
		System.out.println("Numero do funcionario: " + numeroFuncionario);
		System.out.println("Salário total do funcionario: R$ " + salarioTotal);
		
		
		entrada.close();
	}

}
