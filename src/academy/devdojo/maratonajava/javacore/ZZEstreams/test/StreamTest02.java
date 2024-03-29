package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 1. Order LighNovel by title
// 2. Retrieve the first 3 light novels with price less than 4
public class StreamTest02 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of
            (new LightNovel("Tensei Shittara", 8.99),
                    new LightNovel("Overlord", 3.99),
                    new LightNovel("Violet Evergarden", 5.99),
                    new LightNovel("No Game no Life", 2.99),
                    new LightNovel("Kumo Desuga", 3.99),
                    new LightNovel("Monogatari", 4.00)));


    public static void main(String[] args) {

        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .toList();

        System.out.println(titles);

    }
}
