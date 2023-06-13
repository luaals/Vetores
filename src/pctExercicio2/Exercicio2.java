package pctExercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		int[] vetor2 = new int[10];
		for (int i = 0; i < 10; i++) {

			System.out.println("digite o valor: ");

			vetor[i] = entrada.nextInt();
		}
		for (int i = 0; i < 10; i++) {
			vetor2[i] = (vetor[i] * 2);
		}
		for (int i = 0; i < 10; i++) {

			System.out.println("O dobro do valor é: " + vetor2[i]);
		}
		entrada.close();
	}
}