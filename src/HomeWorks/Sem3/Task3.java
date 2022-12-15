package HomeWorks.Sem3;

import java.util.ArrayList;
import java.util.Collections;

/*
Задан целочисленный список ArrayList.
Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(2);
        list.add(4);
        list.add(9);
        list.add(10);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(1);

        System.out.println("Initial array " + list);
//        System.out.println(Collections.min(list)); with help Collections
//        System.out.println(Collections.max(list)); with help Collections


        int min = list.get(0);
        int max = list.get(0);
        int sum = 0;
        for (Integer i: list) {
            if(i < min) min = i;
            if(i > max) max = i;
            sum = sum + i;
        }

        System.out.println("Min Int " + min);
        System.out.println("Max Int " + max);
        System.out.println("Mid Int " + sum / 2);
    }

}
