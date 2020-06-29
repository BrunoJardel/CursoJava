package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Retangle r = new Retangle();
		System.out.println("Enter rectangle width and height:");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f", r.area());
		System.out.printf("\nPERIMETER = %.2f", r.perimeter());
		System.out.printf("\nDIAGONAL = %.2f", r.diagonal());
		
		sc.close();

	}

}
