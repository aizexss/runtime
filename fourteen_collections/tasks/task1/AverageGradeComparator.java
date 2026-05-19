package fourteen_collections.tasks.task1;

import java.util.Comparator;

import static fourteen_collections.tasks.task1.Student.averageGradeCalculator;

public class AverageGradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s, Student s1) {
        return averageGradeCalculator(s) - averageGradeCalculator(s1);
    }
}
