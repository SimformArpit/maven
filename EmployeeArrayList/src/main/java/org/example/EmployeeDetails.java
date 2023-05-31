package org.example;

import java.util.ArrayList;
import java.util.Comparator;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class EmployeeDetails {
    public static void main(String[] args) {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(new Employee("Arpit", 89, 21, "Computer"));
        employeeArrayList.add(new Employee("Yash", 90, 20, "IT"));
        employeeArrayList.add(new Employee("Parth", 91, 19, "Computer"));
        employeeArrayList.add(new Employee("Hardeek", 92, 67, "IT"));
        employeeArrayList.add(new Employee("Sailesh", 94, 90, "Computer"));
//        employeeArrayList
//                .stream()
//                .sorted((o1, o2) -> o1.getDepartment()
//                        .compareTo(o2.getDepartment()))
//                .forEach(System.out::println);
        employeeArrayList
                .stream()
                .sorted(Comparator.comparingInt(e -> e.getAge()))
                .map(e -> e.getAge())
                .forEach(System.out::println);
        System.out.println(employeeArrayList
                .stream()
                .mapToInt(e -> e.getAge())
                .average()
                .getAsDouble());


    }
}