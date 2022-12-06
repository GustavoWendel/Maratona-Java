package academy.devdojo.maratonajava.javacore.Eblocoinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocoinicializacao.dominio.Anime;

import java.util.Arrays;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One Piece");
        System.out.println(Arrays.toString(anime.getEpisodios()));
    }
}
