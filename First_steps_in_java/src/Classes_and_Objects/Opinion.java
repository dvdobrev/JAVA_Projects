package Classes_and_Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Opinion {

    static class Person {

        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString(){
            return String.format("%s - %d", getName(), getAge());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = Integer.parseInt(scan.nextLine());

        List<Person> allPersons = new ArrayList<>();


        for (int i = 0; i < count; i++) {
            String[] input = scan.nextLine().split(" ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);

            Person person = new Person(name, age);

            if (age > 30) {
                allPersons.add(person);
            }
        }

        allPersons.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(person -> System.out.println(person.toString()));
    }
}
