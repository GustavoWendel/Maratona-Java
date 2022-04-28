package academy.devdojo.maratonajava.exercicios;

import java.util.Scanner;

public class Exercicio01EstruturasDeRepeticao {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome;
        String sexo;
        int idade;
        double salario;
        String estadoCivil;
        boolean validaNome = false;
        boolean validaIdade = false;
        boolean validaSalario = false;
        boolean validaSexo = false;
        boolean validaEstadoCivil = false;

        do {
            System.out.println("Nome: ");
            nome = sc.nextLine();

            if (nome.length() > 3) {
                validaNome = true;
            } else {
                System.out.println("Quantidade de caracteres inferior a 3, digite novamente seu nome.");
            }
        } while (!validaNome);


        do {

            System.out.println("Idade: ");
            idade = sc.nextInt();

            if (idade >= 0 && idade <= 150) {
                validaIdade = true;
            } else {
                System.out.println("A idade deve ser entre 0 e 150. Você digitou uma idade inválida!");
            }

        } while (!validaIdade);


        do {

            System.out.println("Salário: ");
            salario = sc.nextDouble();

            if (salario > 0) {
                validaSalario= true;
            } else {
                System.out.println("O salário deve ser maior que 0. Digite novamente!");
            }

        } while (!validaSalario);


        do {

            System.out.println("Sexo: ");
            sexo = sc.nextLine();

            if (sexo.equalsIgnoreCase("f")  || sexo.equalsIgnoreCase("m")) {
                validaSexo = true;
            } else {
                System.out.println("O sexo é inválido. Digite novamente a informação!");
            }
        } while (!validaSexo);


        do {

            System.out.println("Estado Civil: ");
            estadoCivil = sc.nextLine();

            if ( estadoCivil.equalsIgnoreCase("s")  || estadoCivil.equalsIgnoreCase("c")
                    || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d") ) {
                validaEstadoCivil = true;
            } else {
                System.out.println("O estado civil digitado é inválido. Digite novamente a informação!");
            }

        } while (!validaEstadoCivil);


        System.out.println("Seu nome: " + nome);
        System.out.println("Sua idade: " + idade);
        System.out.println("Sua salario: " + salario);
        System.out.println("Seu sexo = " + sexo);
        System.out.println("Seu estado civil = " + estadoCivil);
    }
}
