package HomeWorks.Sem2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

/*
Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] a = {1, 5, 9, 5, 7, 2, 1, 8, 6, 4};
        System.out.println("Исходный массив " + Arrays.toString(a));
        System.out.print("Отсортированный массив " + Arrays.toString(bubbleSort(a)));
    }

    static int[] bubbleSort(int[] arr) throws IOException {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                    logg(i, i + 1);
                }
            }
        }
        return arr;
    }

    private static void logg(int j, int t) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        logger.info(" " + j + t );
    }
}
