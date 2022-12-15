package HomeWorks.Sem3;

import java.util.ArrayList;

// Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(21);
        list.add(24);
        list.add(921);
        list.add(100);
        list.add(77);
        list.add(2301);
        list.add(2400);
        System.out.println("Initial array " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.println("Negative array  " + list);
    }
}
