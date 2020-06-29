import java.util.Locale;
import java.util.Scanner;

import entities.Classe;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Classe c1 = new Classe();
		c1.id = 1;
		c1.texto = "texto1";
		
		Classe c2 = c1;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("--------------------");
		
		c2.id = 2;
		c2.texto = "texto2";

		System.out.println(c1);
		System.out.println(c2);
		
		sc.close();
	}
}