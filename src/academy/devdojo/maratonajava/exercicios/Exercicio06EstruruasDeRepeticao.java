package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

/*
*  6.Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
* Depois modifique o programa para que ele mostre os números um ao lado do outro.
*/
public class Exercicio06EstruruasDeRepeticao {
    public static void main(String[] args) {
        int numero = 0;
        int numero02 = 0;

        for (int i = 0; i <= 20; i++) {
            System.out.println(numero++);
        }

        for (int k = 0; k <= 20; k++) {
            System.out.print(", " + numero02++);
        }
     }
}
