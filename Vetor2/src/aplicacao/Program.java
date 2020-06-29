package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produto[] vetor = new Produto[n];
		for (int i = 0; i < vetor.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetor[i] = new Produto(nome, preco);
		}
		double sum = 0.0;
		for (int i = 0; i < vetor.length; i++) {
			sum += vetor[i].getPreco();
		}
		double avg = sum / vetor.length;
		System.out.printf("PREÇO MÉDIO = %.2f%n", avg);
		sc.close();
	}
}