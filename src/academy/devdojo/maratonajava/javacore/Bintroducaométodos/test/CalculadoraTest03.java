package academy.devdojo.maratonajava.javacore.Bintroducaométodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaométodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros02(20, 2);
        System.out.println(resultado);
    }
}
