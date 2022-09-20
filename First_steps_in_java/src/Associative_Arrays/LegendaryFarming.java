package Associative_Arrays;

import java.util.*;

public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> items = new TreeMap<>();
        items.put("shards", 0);
        items.put("fragments", 0);
        items.put("motes", 0);

        Map<String, Integer> junk = new TreeMap<>();

        boolean notCreated = true;

        while (notCreated) {
            String[] input = scan.nextLine().toLowerCase().split(" ");

            for (int i = 0; i < input.length; i += 2) {
                if (!notCreated) {
                    break;
                }

                int quantity = Integer.parseInt(input[i]);
                String item = input[i + 1];

                if (items.containsKey(item)) {
                    items.put(item, items.get(item) + quantity);

                    if (items.get(item) >= 250) {
                        notCreated = false;
                        items.put(item, items.get(item) - 250);

                        switch (item) {
                            case "shards" -> System.out.println("Shadowmourne obtained!");
                            case "fragments" -> System.out.println("Valanyr obtained!");
                            case "motes" -> System.out.println("Dragonwrath obtained!");
                        }
                    }

                } else {
                    if (junk.containsKey(item)) {
                        junk.put(item, junk.get(item) + quantity);

                    } else {
                        junk.put(item, quantity);
                    }
                }
            }

            items.entrySet().stream()
                    .sorted((item1, item2) -> {
                        int result = item2.getValue().compareTo(item1.getValue());

                        if (result == 0) {
                            result = item1.getKey().compareTo(item2.getKey());
                        }
                        return result;
                    })
                    .forEach(itm -> System.out.println(itm.getKey() + ": " + itm.getValue()));

            junk.forEach((key, value) -> System.out.println(key + ": " + value));
        }
    }
}