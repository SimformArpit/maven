package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Employee {
    String name;
    int enrollNumber;
    int age;
    String department;

    public Employee(String name, int enrollNumber, int age, String department) {
        this.name = name;
        this.enrollNumber = enrollNumber;
        this.age = age;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", enrollNumber=" + enrollNumber +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getEnrollNumber() {
        return enrollNumber;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }
}