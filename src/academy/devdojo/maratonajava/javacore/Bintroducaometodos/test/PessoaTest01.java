package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

import java.util.Scanner;

public class PessoaTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();

        System.out.println("Digite a sua idade: ");
        int idade = scan.nextInt();

        System.out.println("Digite o seu peso: ");
        double peso = scan.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = scan.nextDouble();

        pessoa.dizerInformacao(nome);
        pessoa.dizerInformacao(idade);
        pessoa.dizerInformacao(peso, altura);


    }
}
