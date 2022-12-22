package HomeWorks.Sem4;

/*
Пусть дан LinkedList с несколькими элементами.
Реализуйте метод, который вернет “перевернутый” список.
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, dequeue() - возвращает
первый элемент из очереди и удаляет его, first() - возвращает первый
элемент из очереди, не удаляя.
 */

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        System.out.println(reverseList(ll));
    }

    private static LinkedList<Integer> reverseList(LinkedList<Integer> ll) {
        Collections.reverse(ll);
        return ll;
        }
     }

