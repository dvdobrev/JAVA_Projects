package Classes_and_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderByAge {

    static class Person {
        String name;
        int id;
        int age;


        public Person(String name, int id, int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public String personInfo() {
            return String.format("%s with ID: %d is %d years old.", getName(), getId(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Person> allPersons = new ArrayList<>();

        String[] input = scan.nextLine().split(" ");

        while (!input[0].equals("End")) {

            String name = input[0];
            int id = Integer.parseInt(input[1]);
            int age = Integer.parseInt(input[2]);

            Person person = new Person(name, id, age);
            allPersons.add(person);

            input = scan.nextLine().split(" ");
        }

        allPersons.stream().sorted((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .forEach(person -> System.out.println(person.personInfo()));
    }
}
