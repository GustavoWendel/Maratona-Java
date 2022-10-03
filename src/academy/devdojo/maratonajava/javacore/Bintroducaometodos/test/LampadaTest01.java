package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Lampada;

public class LampadaTest01 {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();

        lampada.ligar();
        System.out.println(lampada.ligada);

        lampada.desligar();
        System.out.println(lampada.ligada);
    }
}
