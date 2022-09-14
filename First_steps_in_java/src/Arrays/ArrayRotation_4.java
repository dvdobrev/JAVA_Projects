package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(value -> Integer.parseInt(value)).toArray();

        int rotationsCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotationsCount; i++) {
            int firstNum = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length -1] = firstNum;
        }

        System.out.println(Arrays.toString(arr));
    }
}
