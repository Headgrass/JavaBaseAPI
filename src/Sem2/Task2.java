package Sem2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
//        String str="aaaaaaaabbbbbbccccccmmmmmcccccccd";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        char first = str.charAt(0);
        int count = 1;

        StringBuilder res = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if (first == str.charAt(i)) {
                count++;
            } else {
                if (count > 0)
                    res.append(first).append(count);
                count = 1;
                first = str.charAt(i);
            }
        }
        if (count > 0)
            res.append(first).append(count);
        else
            res.append(first);
        System.out.println(res);
    }
}
