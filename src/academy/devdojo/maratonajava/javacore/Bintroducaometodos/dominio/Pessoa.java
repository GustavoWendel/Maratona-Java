package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {

    public void dizerInformacao(String nome) {
        System.out.println("Meu nome é " + nome);
    }

    public void dizerInformacao(int idade) {
        System.out.println("Minha idade é " + idade);
    }

    public void dizerInformacao(double peso, double altura) {
        System.out.println("Meu peso é " + peso + "e minha altura é " + altura + ".");
    }
}
