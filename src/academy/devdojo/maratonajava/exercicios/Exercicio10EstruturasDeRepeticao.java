package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

// Faça um programa que receba dois números inteiros e
// gere os números inteiros que estão no intervalo compreendido por eles.
public class Exercicio10EstruturasDeRepeticao {
    public static void main(String[] args) {
        int num1, num2;
        Scanner input = new Scanner(System.in);

        System.out.println("Número 1: ");
        num1 = input.nextInt();

        System.out.println("Número 2: ");
        num2 = input.nextInt();

        int soma = 0;

        for (int i = num1; i <= num2; i++) {

            System.out.println(i);

            soma = soma + i;
        }

        System.out.println("Soma: " + soma);
    }
}
