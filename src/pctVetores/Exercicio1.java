package pctVetores;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int[] vetor = new int[10];
		double aux = 0;
		for (int i = 0; i < 10; i++) {

			System.out.println("digite a nota: ");

			vetor[i] = entrada.nextInt();

		}

		for (int i = 0; i < 10; i++) {

			aux = (aux + vetor[i]);

		}
		System.out.println("A média das notas é: " + aux / 10);
		entrada.close();
	}

}
