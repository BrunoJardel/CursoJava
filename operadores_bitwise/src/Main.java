import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0) {
			System.out.println("6o. bit é verdadeiro!");
		} else {
			System.out.println("6o. bit é falso");
		}
		
		sc.close();
	}
}