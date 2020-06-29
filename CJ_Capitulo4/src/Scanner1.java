import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {
		String nome;
		char s;
		String sexo;
		int idade;
		double salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		nome = sc.nextLine();
		System.out.print("Sexo: ");
		s = sc.next().charAt(0);
		
		if ((s == 'M') || (s == 'm')) {
			sexo = "masculino";
		} else if ((s == 'F') || ( s == 'f')) {
			sexo = "feminino";
		} else {
			System.out.println("Sexo n�o identificado. Assumido como \"Indefinido\"");
			sexo = "indefinido";
		}
		
		System.out.print("Idade: ");
		idade = sc.nextInt();
		System.out.print("Sal�rio R$:");
		salario = sc.nextDouble();
		
		System.out.println("\n##### RESULTADO #####");
		System.out.printf("Nome: %s%nSexo: %s, Idade: %d anos, Sal�rio R$%.2f", nome, sexo, idade, salario);

		sc.close();
	}

}
