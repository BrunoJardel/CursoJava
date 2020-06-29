package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> lista = new ArrayList<>();
		
		// PARTE 1 - LENDO DADOS:
		
		System.out.print("How many employess will be registrered? ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.println("\nEmployee #" + i + ":");
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(lista, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			lista.add(new Employee(id, name, salary));		
		}
		
		// PARTE 2 - UPDATING SALARY OF GIVEN EMPLOYEE
		
		System.out.print("\nEnter the employee id that wil have salary increase: ");
		int id = sc.nextInt();
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			float perc = sc.nextFloat();
			emp.increaseSalary(perc);
		}
		
		// PARTE 3 - LISTANDO EMPREGADOS
		
		System.out.println("\nList of employees:");
		for (Employee obj : lista) {
			System.out.println(obj);
		}
		
		sc.close();

	}
	
	public static boolean hasId(List<Employee> lista, int id) {
		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
