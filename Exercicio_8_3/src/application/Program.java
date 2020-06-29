package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		s.nome = sc.nextLine();
		s.nota1 = sc.nextDouble();
		s.nota2 = sc.nextDouble();
		s.nota3 = sc.nextDouble();
		
		System.out.println(s.avaliacaoFinal());
				
		sc.close();
	}

}
