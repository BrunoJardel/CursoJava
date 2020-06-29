
public class Main {

	public static void main(String[] args) {
		
		/* Resolução de Báscara */
		
		double a = 1;
		double b = -3.5f;
		double c = 3;
		
		double delta = Math.pow(b, 2.0) - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("##### Resolução de Báscara #####");
		System.out.printf("Equação: %.0fx^2%+.1fx%+.0f", a, b, c);
		System.out.printf("\nRaízes: x1=%.2f e x2 =%.2f", x1, x2);
		
		/* Exercícios Capítulo 4 */
		System.out.println("\n\n##### Exercícios Capítulo 4 #####");
		
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		
		System.out.println("Raiz quadrada de " + x + " = " + A);
		System.out.println("Raiz quadrada de " + y + " = " + B);
		System.out.println("Raiz quadrada de 25 = " + C);
		
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado ao quadrado = " + B);
		System.out.println("5 elevado ao quadrado = " + C);
		
		A = Math.abs(y);
		B = Math.abs(z);
		
		System.out.println("Valor absoluto de " + y + " = " + A);
		System.out.println("Valor absoluto de " + z + " = " + B);

	}

}
