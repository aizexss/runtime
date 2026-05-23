package fourteen_collections.tasks.task9;

import java.util.Comparator;

public class EmployeeExperienceComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.experience - e1.experience;
    }

}
