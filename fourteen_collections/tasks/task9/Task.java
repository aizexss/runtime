package fourteen_collections.tasks.task9;

import java.util.ArrayList;
import java.util.Collections;

public class Task {
    /*
    Поиск лучшего сотрудника

    Создать:
    Comparator по зарплате;
    Comparator по опыту;
    Comparator по имени.

    Найти:
    самого опытного;
    самого дорогого;
    топ-3 сотрудников.
    */

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Aibar", 500000, 3));
        employees.add(new Employee("Dias", 700000, 5));
        employees.add(new Employee("Miras", 450000, 7));
        employees.add(new Employee("Alina", 900000, 4));
        employees.add(new Employee("Sanzhar", 650000, 6));

        // Самый опытный сотрудник
        employees.sort(new EmployeeExperienceComparator());
        Employee mostExperienced = employees.get(0);

        System.out.println("Самый опытный сотрудник:");
        System.out.println(mostExperienced);

        System.out.println();

        // Самый дорогой сотрудник
        employees.sort(new EmployeeSalaryComparator());
        Employee mostExpensive = employees.get(0);

        System.out.println("Самый дорогой сотрудник:");
        System.out.println(mostExpensive);

        System.out.println();

        // Топ-3 сотрудника по зарплате
        System.out.println("Топ-3 сотрудника по зарплате:");
        for (int i = 0; i < Math.min(3, employees.size()); i++) {
            System.out.println(employees.get(i));
        }

        System.out.println();

        // Сортировка по имени
        employees.sort(new EmployeeNameComparator());

        System.out.println("Сотрудники по имени:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}