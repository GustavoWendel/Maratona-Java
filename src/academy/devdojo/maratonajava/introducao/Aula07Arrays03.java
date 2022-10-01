package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // byte, short, int, long,float e double, padrão é 0
        // boolean false
        // string null

        String [] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "Vegeta";
        nomes[2] = "Kurosakin Ichigo";


        // Percorrer lista com estrutura for
        int contador;

        for (contador = 0; contador <= nomes.length; contador++) {
            System.out.println(nomes[contador]);
        }

    }
}
