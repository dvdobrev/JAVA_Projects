package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        List<Integer> wagons = Arrays.stream(input.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scan.nextLine());

        String text = scan.nextLine();

        while (!text.equals("end")) {
            if (text.contains("Add")) {
                List<String> data = Arrays.stream(text.split(" ")).collect(Collectors.toList());
                int newWagon = Integer.parseInt(data.get(1));
                wagons.add(newWagon);

            } else {
                int passengers = Integer.parseInt(text);

                for (int i = 0; i < wagons.size(); i++) {
                    int currentWagon = wagons.get(i);
                    if (currentWagon + passengers <= maxCapacity) {
                        wagons.set(i, currentWagon + passengers);
                        break;
                    }
                }
            }

            text = scan.nextLine();

        }

        for (Integer wagon : wagons) {
            System.out.print(wagon + " ");
        }

    }
}
