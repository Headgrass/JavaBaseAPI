package Sem6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите
процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

 */
public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            newList.add(new Random().nextInt(25));
            System.out.printf("Процент уникальных значений %s%s", uniqueNum(newList), "%");
        }
    }

            public static double uniqueNum(ArrayList<Integer> list) {
                HashSet<Integer> new_set = new HashSet<>(list);
                return ((double) new_set.size() / (double) list.size()) * 100;
            }
        }
