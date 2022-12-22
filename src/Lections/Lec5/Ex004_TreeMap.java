package Lections.Lec5;

import java.util.TreeMap;

public class Ex004_TreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один");
        System.out.println(tMap); // {1=один}
        tMap.put(6, "шесть");
        System.out.println(tMap); // {6=шесть}
        tMap.put(4, "четыре");
        System.out.println(tMap); // {4=четыре}
        tMap.put(3, "три");
        System.out.println(tMap); // {3=три}
        tMap.put(2, "два");
        System.out.println(tMap); // {2=два}
        tMap.put(2, "два");
        System.out.println(tMap.descendingMap());
        tMap.put(2, "два");
        System.out.println(tMap.descendingKeySet());
    }
}
