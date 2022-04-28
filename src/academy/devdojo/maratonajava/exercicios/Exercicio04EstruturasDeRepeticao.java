package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

/* 4.Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3%
 e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%.
 Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
 mantidas as taxas de crescimento.
 */
public class Exercicio04EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidadePopulacaoA = 80000;
        int quantidadePopulacaoB = 200000;
        int quantidadeAnos = 0;
        double taxaCrescimentoAnualA = (1 + 0.03);
        double taxaCrescimentoAnualB = (1 + 0.015);
        double count = 0;

        do {
            count++;

        } while (quantidadePopulacaoA >= quantidadePopulacaoB);

    }
}
