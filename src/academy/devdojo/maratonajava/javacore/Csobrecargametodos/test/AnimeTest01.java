package academy.devdojo.maratonajava.javacore.Csobrecargametodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {

        Anime anime = new Anime();
        anime.init("Boku No Hero", "tv", 24);
        anime.init("Boku No Hero 2", "tv 2", 24, "ação");
        anime.imprime();
    }
}
