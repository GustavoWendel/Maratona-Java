package academy.devdojo.maratonajava.exerciciouri;

import java.util.Scanner;

public class Uri1070 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int count = 0;
        while (count < 6) {
            if (x % 2 == 1) {
                System.out.println(x);
                count++;
            }
            x++;
        }

    }
}
