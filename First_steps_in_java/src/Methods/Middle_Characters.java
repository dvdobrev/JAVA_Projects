package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class Middle_Characters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        boolean hasEvenNum = input.length() % 2 == 0;

        int middleIndex = input.length() / 2;

        if (hasEvenNum) {

            System.out.print(input.charAt(middleIndex - 1));
            System.out.print(input.charAt(middleIndex));

        } else {
            System.out.print(input.charAt(middleIndex));
        }
    }
}
