package academy.devdojo.maratonajava.exercicios;

import java.util.Objects;
import java.util.Scanner;

public class Exercicio03EstruturasDeRepeticao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean senhaValida = false;

        do {
            System.out.println("Digite o nome do usuário: ");
            String usuario = sc.nextLine();

            System.out.println("Digite a sua senha: ");
            String senha = sc.nextLine();

            if (Objects.equals(senha, usuario)) {
                System.out.println("Senha não pode ser igual ao nome do usuário, digite novamente as informações.");
            } else {
                senhaValida = true;
                System.out.println("Você digitou o usuário = " + usuario);
                System.out.println("Você digitou a senha = " + senha);
            }

        } while (!senhaValida);
    }
}
