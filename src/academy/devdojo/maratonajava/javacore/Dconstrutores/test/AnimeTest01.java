package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Boku No Hero 2", "tv 2", 24, "ação");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}
