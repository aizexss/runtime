package fourteen_collections.tasks.task1;

import java.util.ArrayList;

import static fourteen_collections.tasks.task1.Student.*;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student student = new Student("Jack", 20);
        student.grades.add(15);

        students.add(student);

        Student student1 = new Student("Arsen", 70);
        students.add(student1);

        Student student2 = new Student("Sawa", 90);
        students.add(student2);

        Student student3 = new Student("Mawa", 50);
        students.add(student3);

        System.out.println("Вывод всех студентов: ");
        System.out.println(students);
        System.out.println();

        System.out.println("Вывод всех средних баллов каждого");
        for (Student s : students) {
            System.out.println(averageGradeCalculator(s));
        }
        System.out.println();

        System.out.println("Студент с самым высоким баллом: " + highestAverageGrade(students));
        System.out.println();

        System.out.println("Студенты с баллом меньше 70: " + gradeLowerSeventy(students));
        System.out.println();

        AverageGradeComparator averageGradeComparator = new AverageGradeComparator();
        students.sort(averageGradeComparator);
        System.out.println("После сортировки по среднему баллу: ");
        System.out.println(students);
    }
}
