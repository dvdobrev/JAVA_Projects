package Text_Processing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split("\\s+");
        double sum = 0;

        for (String data : input) {
            char firstLetter = data.charAt(0);
            char secondLetter = data.charAt(data.length() - 1);
            double number = Double.parseDouble(data.substring(1, data.length() - 1));

            int firstLetterPosition = getLetterPosition(firstLetter);
            int secondLetterPosition = getLetterPosition(secondLetter);

            if (Character.isUpperCase(firstLetter)) {
                sum += number / firstLetterPosition;
            } else {
                sum += number * firstLetterPosition;
            }

            if (Character.isUpperCase(secondLetter)) {
                sum -= secondLetterPosition;

            } else {
                sum += secondLetterPosition;
            }

        }
        System.out.printf("%.2f", sum);

    }

    private static int getLetterPosition(char c) {
        char targetChar = Character.toLowerCase(c);
        char initialChar = 'a';
        int position = targetChar - initialChar +  1;

        return position;

    }
}
