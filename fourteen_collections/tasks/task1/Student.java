package fourteen_collections.tasks.task1;

import java.util.ArrayList;

class Student {
    String name;
    ArrayList<Integer> grades;

    public Student(String name, int grade) {
        this.name = name;
        grades = new ArrayList<>();
        grades.add(grade);
    }

    public static int averageGradeCalculator(Student student) {
        int averageGrade = 0;
        for (int i = 0; i < student.grades.size(); i++) {
            averageGrade += student.grades.get(i);
        }
        return averageGrade / student.grades.size();
    }

    public static Student highestAverageGrade(ArrayList<Student> students) {
        /*
        взять студента  - взять его оценки - найти среднее этих оценок -
        сохранить и сравнить со следующим, если больше подставляем, если меньше то оставлялем
         */
        int tempHighestGrade = 0;
        int indexOfHighest = -1;
        for (int i = 0; i < students.size() - 1; i++) {
            if (averageGradeCalculator(students.get(i)) > averageGradeCalculator(students.get(i + 1))) {
                tempHighestGrade = averageGradeCalculator(students.get(i));
                indexOfHighest = i;
            } else {
                tempHighestGrade = averageGradeCalculator(students.get(i + 1));
                indexOfHighest = i + 1;
            }
        }
        return students.get(indexOfHighest);
    }

    public static ArrayList<Student> gradeLowerSeventy(ArrayList<Student> students) {
        ArrayList<Student> lowerSeventy = new ArrayList<>();
        for (Student s : students) {
            if (averageGradeCalculator(s) < 70) {
                lowerSeventy.add(s);
            }
        }
        return lowerSeventy;
    }

    public String toString() {
        return "Student [name=" + name + ", grades=" + grades + "]";
    }
}
