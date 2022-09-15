package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HouseParty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> guests = new ArrayList<>();
        
        int commandsNumber = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < commandsNumber; i++) {
            List<String> input = Arrays.stream(scan.nextLine().split(" ")).toList();

            String name = input.get(0);

            if(input.contains("not")) {
                if (!guests.contains(name)) {
                    System.out.printf("%s is not in the list!", name);
                } else guests.remove(name);

            } else {
                if (guests.contains(name)) {
                    System.out.printf("%s is already in the list!", name);
                } else guests.add(name);
            }

        }

        for (String s : guests) {
            System.out.println(s);
        }
    }
}
