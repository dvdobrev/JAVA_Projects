package Classes_and_Objects;

import java.util.*;

public class AdvertisementMessage {
    static class Message {

        String[] phrases = {
                "Excellent product.",
                "Such a great product.",
                "I always use that product.",
                "Best product of its category.",
                "Exceptional product.",
                "I can’t live without this product."
        };

        String[] events = {"Now I feel good.",
                "I have succeeded with this product.",
                "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.",
                "Try it yourself, I am very satisfied.",
                "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        public String randomMsg() {
            return String.format("%s %s %s – %s",
                    phrases[random.nextInt(phrases.length)],
                    events[random.nextInt(events.length)],
                    authors[random.nextInt(events.length)],
                    cities[random.nextInt(cities.length)]);
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counts = Integer.parseInt(scan.nextLine());

        Message message = new Message();

        for (int i = 0; i < counts; i++) {
            System.out.println(message.randomMsg());
        }
    }
}
