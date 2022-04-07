package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05Exercicio {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o valor do seu salário: ");
        double salario = input.nextDouble();

        double taxaImpostoRendaPagar = 0;
        if(salario <= 1903.98) {
            System.out.println("Isento de pagar o imposto de renda");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            taxaImpostoRendaPagar = salario * 7.5 / 100;
        } else if (salario >= 2826.66  && salario <= 3751.05) {
            taxaImpostoRendaPagar = salario * 15 / 100;
        } else if (salario >= 3751.06   && salario <= 4664.68) {
            taxaImpostoRendaPagar = salario * 22.5 / 100;
        } else {
            taxaImpostoRendaPagar = salario * 27.5 / 100;
        }

        System.out.println("Seu salário = " + salario);
        System.out.println("Total a declarar no imposto de renda = " + taxaImpostoRendaPagar);
    }
}
