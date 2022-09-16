package Classes_and_Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {

    static class Student {
        String firstName;
        String lastName;
        double grade;

        public Student(String firstName, String lastName, double grade) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public double getGrade() {
            return grade;
        }

        public void setGrade(double grade) {
            this.grade = grade;
        }

        public String toString() {
            return String.format("%s %s: %.2f", getFirstName(), getLastName(), getGrade());
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int studentCounts = Integer.parseInt(scan.nextLine());

        List<Student> allStudents = new ArrayList<>();

        for (int i = 0; i < studentCounts; i++) {
            String[] input = scan.nextLine().split(" ");

            String firsName = input[0];
            String lastsName = input[1];
            double grade = Double.parseDouble(input[2]);

        Student student = new Student(firsName, lastsName, grade);

        allStudents.add(student);

        }

        allStudents.stream().sorted((s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()))
                .forEach(student -> System.out.println(student.toString()));
    }

}
