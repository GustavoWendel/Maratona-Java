package academy.devdojo.maratonajava.exerciciouri;

import java.util.Locale;
import java.util.Scanner;

public class Uri1065 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        int count = 0;

        for (int i = 0; i < 5; i++){
           double n = input.nextDouble();
           if (n % 2 == 0) count++;
        }

        System.out.println(count + " valores pares");

    }
}
