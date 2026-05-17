package thirteen_algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(array);

        int target = 4;
        int res = byner(array, target);
        System.out.println(res);

        int[] array1 = {1, 3, 4, 6, 8, 2, 9};
        System.out.println(Arrays.toString(array1));
        System.out.println((Arrays.toString(bubble(array1))));

    }


    //1. Найти элемент, который находится в середине массива.
    //2. Если элемент меньше искомого, то поиск нужно продолжить в правой части массива.
    //3. Если элемент больше искомого, то поиск нужно продолжить в левой части массива.
    //4. Если текущий элемент равен искомому — нужно вернуть его индекс.

    public static int byner(int arr[], int num) {
        int left = 0;
        int right = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == num) {
                return arr[mid];
            }

            if (arr[mid] < num) {
                left = mid + 1;
            }

            if (arr[mid] > num) {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static int[] bubble(int array[]) {
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array.length - 1; k++) {
                if (array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] insertionSort(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int key = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = key;

        }
        return data;
    }
}
