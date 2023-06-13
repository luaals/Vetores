package pctExercicio3;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetor = new int[10];
		int[] vetor2 = new int[10];
		int[] vetor3 = new int[10];
		vetor[0] = 1;
		vetor[1] = 2;
		vetor[2] = 3;
		vetor[3] = 4;
		vetor[4] = 5;

		vetor2[0] = 10;
		vetor2[1] = 20;
		vetor2[2] = 30;
		vetor2[3] = 40;
		vetor2[4] = 50;

		for (int i = 0; i < 5; i++) {

			vetor3[i] = vetor[i] + vetor2[i];

		}
		for (int i = 0; i < 5; i++) {

			System.out.println("As somas dos vetores é " + vetor3[i]);

		}
	}

}
