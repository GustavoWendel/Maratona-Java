package academy.devdojo.maratonajava.exerciciouri;

import java.util.Scanner;

public class Uri1066 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        for (int i = 0; i < 5; i++){
            double n = input.nextDouble();

            if (n % 2 == 0) count++;

            if (n % 2 != 0) count1++;

            if (n > 0) count2++;

            if (n < 0) count3++;
        }

        System.out.println(count + " valor(es) par(es)");
        System.out.println(count1 + " valor(es) impar(es)");
        System.out.println(count2 + " valor(es) positivo(s)");
        System.out.println(count3 + " valor(es) negativo(s)");
    }
}
