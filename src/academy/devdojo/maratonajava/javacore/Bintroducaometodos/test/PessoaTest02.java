package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa02;

public class PessoaTest02 {
    public static void main(String[] args) {
        Pessoa02 pessoa  = new Pessoa02();
        pessoa.setNome( "Jiraya");
        pessoa.setIdade(15);
//        pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
