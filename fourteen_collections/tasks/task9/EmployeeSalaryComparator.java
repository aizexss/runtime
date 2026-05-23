package fourteen_collections.tasks.task9;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.salary - e1.salary;
    }
}
