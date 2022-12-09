package Sem2;

import java.io.BufferedReader;

public class Task1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        char ch1 = 'X';
        char ch2 = 'Y';
        int n = 8;
        for (int i = 0; i <= n; i++) {
            sb.append(ch1);
            sb.append(ch2);
        }
        System.out.println(sb);
    }
}
