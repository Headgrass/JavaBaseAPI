package HomeWorks.Sem2;

import java.util.Arrays;

/*
Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] a = {1, 5, 9, 5, 7, 2, 1, 8, 6, 4};
        System.out.print(Arrays.toString(a));
        System.out.print("Отсортированный массив" + Arrays.toString(bubbleSort(a)));
    }

    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
}
