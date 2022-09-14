import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int[] array = new int[5];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 1;
//        }
//        System.out.print(Arrays.toString(array));

//        String[] days = {
//                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
//        };
//
//        int day = Integer.parseInt(scan.nextLine());
//
//        if (day >= 1 && day <= 7) {
//            System.out.println(days[day - 1]);
//        } else {
//            System.out.println("Invalid Day");
//        }

//        int n = Integer.parseInt(scan.nextLine());
//
//        int[] array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = Integer.parseInt(scan.nextLine());
//        }
//
//        System.out.println(Arrays.toString(array));

//        String input = scan.nextLine();
//
//        String[] values = input.split(" ");
//
//        int[] arr = new int[values.length];
//
//        for (int i = 0; i < values.length; i++) {
//            arr[i] = Integer.parseInt(values[i]);
//        }
//        System.out.println(Arrays.toString(arr));

//        String input = scan.nextLine();
//
//        String[] valeues = input.split(" ");
//
//        int[] arr = Arrays.stream(valeues).mapToInt(e -> Integer.parseInt(e)).toArray();
//
//        System.out.println(Arrays.toString(arr));

//        int[] arr = Arrays.stream(scan.nextLine().split(" "))
//                .mapToInt(e -> Integer.parseInt(e))
//                .toArray();
//
//        int evenSum = 0;
//        int oddSum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                evenSum += arr[i];
//            } else {
//                oddSum += arr[i];
//            }
//        }

        // {1 2 3 4 5}

        int[] arr = Arrays.stream(scan.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e)).toArray();

        int rotationCount = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < rotationCount; i++) {
            int currentNum = arr[0];

            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }

            arr[arr.length - 1] = currentNum;
        }
    }
}
