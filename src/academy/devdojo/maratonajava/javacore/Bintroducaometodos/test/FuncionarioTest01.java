package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

import java.util.Scanner;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Gustavo";
        funcionario.idade = 15;
        funcionario.salarios = new double[]{1200, 1550, 1900};


        funcionario.imprimeDados();
        funcionario.imprimeMediaSalario();
    }
}
