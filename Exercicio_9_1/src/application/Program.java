package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account a;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char initDeposit = sc.nextLine().charAt(0);
		
		if (initDeposit == 'y') {
			System.out.print("Enter initial deposit Value: ");
			double initialDeposit = sc.nextDouble();
			a = new Account(number, holder, initialDeposit);
		} else {
			a = new Account(number, holder);
		}
		
		System.out.println("\nAccont data:");
		System.out.println(a.toString());
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		a.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(a);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		a.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(a);
		
		sc.close();
	}

}
