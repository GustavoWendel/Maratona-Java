package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe a soma e a média dos números.
public class Exercicio08EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero = 0;
        float soma = 0;
        float media = 0;
        int count = 0;

        while (count <=5) {
            System.out.print("Numero: ");
            numero = sc.nextFloat();

            soma = soma + numero;

            count++;
        }

        System.out.println("A soma é = " + soma);
        System.out.println("A média é = " + media / 5);
    }
}
