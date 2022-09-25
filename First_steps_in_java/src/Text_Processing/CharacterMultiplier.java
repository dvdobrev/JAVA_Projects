package Text_Processing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] data = scan.nextLine().split(" ");
        String firstString = data[0];
        String secondString = data[1];

        if (firstString.length() > secondString.length()) {
            System.out.println(calculateSum(secondString, firstString));
        } else {
            System.out.println(calculateSum(firstString, secondString));
        }
    }

    private static int calculateSum(String smalest, String longest) {
        int lastCharsCount = longest.length() - smalest.length();
        int totalSum = 0;

        for (int i = 0; i < smalest.length(); i++) {
            char symbolOne = smalest.charAt(i);
            char symbolTwo = longest.charAt(i);
            totalSum += symbolOne * symbolTwo;

        }

        for (int i = longest.length() - 1; i >= smalest.length(); i--) {
            char symbol = longest.charAt(i);
            totalSum += symbol;

        }
        return totalSum;
    }
}
