package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of
            (new LightNovel("Tensei Shittara", 8.99),
                    new LightNovel("Overlord", 3.99),
                    new LightNovel("Violet Evergarden", 5.99),
                    new LightNovel("No Game no Life", 2.99),
                    new LightNovel("Kumo Desuga", 3.99),
                    new LightNovel("Monogatari", 4.00)));

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        var count =
                stream
                        .distinct()
                        .filter(ln -> ln.getPrice() <= 4)
                        .count();

        System.out.println(count);

    }
}
