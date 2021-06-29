package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        carro01.nome = "Voyage";
        carro01.modelo = "Volkswagen";
        carro01.ano = 2021;

        Carro carro02 = new Carro();
        carro02.nome = "Uno Sport";
        carro02.modelo = "Fiat";
        carro02.ano = 2018;

        System.out.println("Carro 1");
        System.out.println("Nome: "+ carro01.nome  + "," + " Modelo: " +
                            carro01.modelo  + "," + " Ano: "+ carro01.ano);

        System.out.println("\nCarro 2");
        System.out.println("Nome: "+ carro02.nome  + "," + " Modelo: " +
                            carro02.modelo  + "," + " Ano: "+ carro02.ano);

    }
}
