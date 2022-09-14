package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class EqualSums_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        if (arr.length == 1) {
            System.out.print(0);
            return;

        }

        boolean isEqual = false;

        for (int i = 0; i < arr.length; i++) {

            int sumLeft = 0;
            int sumRight = 0;

            for (int leftIndex = i - 1; leftIndex >= 0; leftIndex--) {
                sumLeft += arr[leftIndex];
            }

            for (int rightIndex = i + 1; rightIndex < arr.length; rightIndex++) {
                sumRight += arr[rightIndex];
            }

            if (sumLeft == sumRight) {
                isEqual = true;
                System.out.print(i);
            }
        }

        if (!isEqual) {
            System.out.print("no");
        }

        }
    }
