package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        /* idade < 15 categoria infantil
           idade >= 15 && idade < 18 categoria juvenil
           idade > 18 categoria adulto
        */

        Scanner scr = new Scanner(System.in);

        System.out.println("Digite a idade: ");
        int idade = scr.nextInt();
        String categoria;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria ="Categoria Juvenil";
        } else {
            categoria = "Categoria adulto";
        }

        System.out.println("Idade = " + idade);
        System.out.println(categoria);
    }
}
