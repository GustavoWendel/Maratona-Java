package academy.devdojo.maratonajava.javacore.Bintroducaométodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaométodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
    }
}
