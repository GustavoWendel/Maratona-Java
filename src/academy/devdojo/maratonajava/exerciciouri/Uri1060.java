package academy.devdojo.maratonajava.exerciciouri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1060 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int count = 0;
        for (int i = 0; i < 6; i++){
           double n = input.nextDouble();
           if (n > 0) count++;
        }

        System.out.println(count + " valores positivos");

    }
}
