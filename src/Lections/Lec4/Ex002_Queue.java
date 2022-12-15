package Lections.Lec4;

import java.util.LinkedList;
import java.util.Queue;

public class Ex002_Queue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(28);
        System.out.println(queue);
        int item = queue.remove();
        System.out.println(item);
        System.out.println(queue);
    }
}
