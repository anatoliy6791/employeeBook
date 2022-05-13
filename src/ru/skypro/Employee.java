package ru.skypro;
import java.util.Objects;

public class Employee {
    String fullName;
    int salary;
    int department;
    static int counter;
    int id;

    public Employee(String fullName, int salary, int department){
    this.id = getCounter();
    counter++;
    this.fullName = fullName;
    this.salary = salary;
    this.department = department;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
     return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public int setSalary(int salary) {
        return salary;
    }

    public int setDepartment(int department) {
        return department;
    }

    public String toString() {
        return "Полное имя:" + fullName + "; " + "Отдел:" + department + "; " + "Зарпалата:" +salary+ "; " + "id:" + id;
    }

    public static void allData(Employee ss[]) {
        for (int i = 0; i < counter; i++)
            System.out.println(ss[i]);
    }

    public static void sumSalary(Employee ss[]) {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum = sum + ss[i].salary;
        }
            System.out.println("Общая ЗП сотрудников: " + sum);
    }

    public static void minSalary(Employee ss[]) {
        int min = ss[0].salary;

        for (int i = 0; i < counter; i++) {
            if (ss[i].salary < min) {
                min = ss[i].salary;

            }
        }
        System.out.println("Минимальная ЗП сотрудников: " + min);
    }
    public static void maxSalary(Employee ss[]) {
        int max = ss[0].salary;

        for (int i = 0; i < counter; i++) {
            if (ss[i].salary > max) {
                max = ss[i].salary;

            }
        }
        System.out.println("Максимальная ЗП сотрудников: " + max);
    }

    public static void averageSalary(Employee ss[]) {
        int sum = 0;
        for (int i = 0; i < counter; i++) {
            sum = sum + ss[i].salary;
        }
        System.out.println("Средняя ЗП сотрудников: " + sum/counter);
    }

    public static void allFirstName(Employee ss[]) {
        for (int i = 0; i < counter; i++) {
            System.out.print(ss[i].fullName + " ");
        }
    }
}
