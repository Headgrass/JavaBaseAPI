package Lections.Lec5;

import java.util.*;
public class Ex005_LinkedHashMap {
    public static void main(String[] args) {
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); //{11=один одинб 1=два, 2=один}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "один один");
        linkmap.put(1, "один");
        linkmap.put(2, "два");
        System.out.println(map); // {1=один, 2=два, 11=один один}
    }
}
