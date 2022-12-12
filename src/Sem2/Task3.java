package Sem2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();


        BufferedReader inputStream = new BufferedReader(new InputStreamReader(System.in));

        try {

            System.out.print("Sample input: ");
            String input = inputStream.readLine();
            System.out.print("Sample output: ");
            System.out.print(isPalindrome(input));

        } catch (IOException exception) {
            System.err.println("Input error");
        }
    }

    public static boolean isPalindrome(String input) {
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder builder = new StringBuilder();

        while (matcher.find())
            builder.append(matcher.group());

        String result = builder.toString();
        String reverseResult = builder.reverse().toString();

        if (result.compareToIgnoreCase(reverseResult) == 0)
            return true;
        return false;
    }


//    public static boolean Palindrome(String s) {
//        if (s == "") return false;
//        for (int i = 0; i < s.length() / 2; i++) {
//            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) return false;
//        }
//        return true;
//    }
}

