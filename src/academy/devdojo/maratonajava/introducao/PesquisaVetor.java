package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class PesquisaVetor {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);

		int[] vetor = { 1, 3, 5, 7, 9 };
		int numero;
		boolean achou = false;

		System.out.print("Qual n�mero deseja procurar?");
		numero = Integer.parseInt(scr.nextLine());

		for (int posicao = 0; posicao < 5; posicao++) {

			if (vetor[posicao] == numero) {
				System.out.printf("Encontrado na posi��o " + posicao + "\n");
				achou = true;
			}
		}
		
		if (achou == false) {
			System.out.println("O n�mero n�o est� no vetor\n");
		}

	}

}
