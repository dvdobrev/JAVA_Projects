package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TopIntegers_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value))
                .toArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isTopIntiger = true;
            int currentNum = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (currentNum <= arr[j]){
                    isTopIntiger = false;
                }
            }
            if (isTopIntiger){
                System.out.print(currentNum + " ");
            }

            }
        }

    }
