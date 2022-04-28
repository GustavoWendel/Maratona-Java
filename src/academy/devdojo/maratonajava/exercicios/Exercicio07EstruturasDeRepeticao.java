package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe o maior número
public class Exercicio07EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float numero = 0, maior;
        int count = 2;

        System.out.println("Número 1: ");
        numero = sc.nextFloat();
        maior = numero;

        while (count <=5) {
            System.out.print("Numero " + count + ": ");
            numero = sc.nextFloat();

            if(numero > maior) {
                maior = numero;
            }

            count++;
        }

        System.out.println("O maior número é: " + maior);
    }
}
