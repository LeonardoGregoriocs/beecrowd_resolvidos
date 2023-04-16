package calculate_salary;

import java.util.Locale;
import java.util.Scanner;
import calculate_salary.Employee;

public class Program {
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
				
		System.out.println("Name: ");
		employee.name = sc.nextLine();

		System.out.println("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		
		System.out.println("Which percetage to increase salary? ");
		double percetage = sc.nextDouble();
		employee.increaseSalary(percetage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
	}
}
