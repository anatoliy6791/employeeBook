package ru.skypro;
import java.util.Objects;
public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("Иванов М. Ю.", 50000, 1);
        employees[1] = new Employee("Петров В. А. ", 100000, 2);
        employees[2] = new Employee("Ефремов А. Б.", 70000, 3);
        employees[3] = new Employee("Васильков В. В.", 60000, 4);
        Employee.allData(employees);
        Employee.allFirstName(employees);
        System.out.println();
        Employee.sumSalary(employees);
        Employee.minSalary(employees);
        Employee.maxSalary(employees);
        Employee.averageSalary(employees);

    }
}
