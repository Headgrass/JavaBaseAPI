package HomeWorks.Sem3;

import java.util.ArrayList;
import java.util.Arrays;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        int[] a = new int[]{21, 921, 24, 100, 75, 76, 78, 77, 900, 2100, 44, 2301, 500, 2400, 2503};
        System.out.println("Initial array " + Arrays.toString(a));
        System.out.println("Negative array  " + Arrays.toString(NegativeArray(a)));
    }

    private static int[] NegativeArray(int[] b) {
        if (b == null) {
            return null;
        }
        if (b.length < 2) {
            return b;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 2 == 0) {
                b[i] = 0;
                // что здесь написать, чтобы удалялся элемент по индексу?
            }
        }
        return b;
    }
}
