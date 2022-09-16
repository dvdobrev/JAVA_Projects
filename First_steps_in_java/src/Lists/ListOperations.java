package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<String> data = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        while (!data.contains("End")) {

            String command = data.get(0);


            switch (command) {
                case "Add" -> {
                    int number = Integer.parseInt(data.get(1));
                    numbers.add(number);

                    break;
                }
                case "Insert" -> {

                    int number = Integer.parseInt(data.get(1));
                    int index = Integer.parseInt(data.get(2));

                    if (index <= numbers.size() && index >= 0) {
                        numbers.add(index, number);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                }
                case "Remove" -> {

                    int index = Integer.parseInt(data.get(1));
                    if (index <= numbers.size() && index >= 0) {
                        numbers.remove(index);
                    } else {
                        System.out.println("Invalid index");
                    }

                    break;
                }
                case "Shift" -> {
                    String direction = data.get(1);
                    int counts = Integer.parseInt(data.get(2));
                    if (direction.equals("left")) {
                        for (int i = 0; i < counts; i++) {
                            int firstNumber = numbers.get(0);
                            numbers.remove(0);
                            numbers.add(firstNumber);
                        }

                    } else {
                        for (int i = 0; i < counts; i++) {
                            int lastNumber = numbers.get(numbers.size() - 1);
                            numbers.remove(numbers.size() - 1);
                            numbers.add(0, lastNumber);
                        }
                    }
                }
            }

            data = Arrays.stream(scan.nextLine().split(" ")).collect(Collectors.toList());

        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

}
