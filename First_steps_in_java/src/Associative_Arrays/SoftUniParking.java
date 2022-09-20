package Associative_Arrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> parking = new LinkedHashMap<>();

        int count = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < count; i++) {

            String[] data = scan.nextLine().split(" ");

            String command = data[0];
            String name = data[1];


            if (command.equals("register")){
                String plateNumber = data[2];

                if (parking.containsKey(name)) {
                    System.out.printf("ERROR: already registered with plate number %s%n", plateNumber);

                } else {
                    parking.put(name, plateNumber);
                    System.out.printf("%s registered %s successfully%n", name, plateNumber);
                }

            } else {
                if (!parking.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);

                } else {
                    parking.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }

        parking.forEach((n, num) -> System.out.printf("%s => %s%n", n, num));

    }
}
