package Associative_Arrays;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());

        Map<String, List<Double>> students = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String name = scan.nextLine();
            double grade = Double.parseDouble(scan.nextLine());

            students.putIfAbsent(name, new ArrayList<>());
            students.get(name).add(grade);

        }

        students.entrySet().stream()
                .filter(s -> s.getValue().stream().mapToDouble(Double::doubleValue).average().getAsDouble() >= 4.50)
                .sorted((f, s) -> {
                    double firststudent = f.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    double secondStudent = s.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    return Double.compare(secondStudent, firststudent);
                }).forEach(student -> {
                    double average = student.getValue()
                            .stream()
                            .mapToDouble(Double::doubleValue)
                            .average()
                            .getAsDouble();

                    System.out.printf("%s -> %.2f%n", student.getKey(), average);

                });
    }
}
