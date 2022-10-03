package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {

    public String nome;

    public int idade;
    public double[] salarios;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + " ");
        }
        imprimeMediaSalario();
    }

    public void imprimeMediaSalario() {
        double media = 0;
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial: " + media);
    }

}
