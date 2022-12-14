package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(new Random().nextInt(100));
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println(arr);
    }
}
