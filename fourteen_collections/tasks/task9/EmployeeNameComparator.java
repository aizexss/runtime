package fourteen_collections.tasks.task9;

import java.util.Comparator;

public class EmployeeNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return String.CASE_INSENSITIVE_ORDER.compare(e1.name, e2.name);
    }
}
