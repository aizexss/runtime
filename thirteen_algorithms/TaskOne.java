package thirteen_algorithms;

// https://github.com/practicetasks/java_tasks/blob/main/algorithms/task_1/README.md
public class TaskOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 2));
    }

    public static int find(int[] array, int elem) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return -1;
    }
}
