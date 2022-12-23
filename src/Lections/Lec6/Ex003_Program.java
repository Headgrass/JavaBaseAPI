package Lections.Lec6;

import java.util.Arrays;
import java.util.HashSet;

public class Ex003_Program {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.firstName = "Василий";
        w1.lastName = "Петрович";
        w1.salary = 160;
        w1.id = 1001;

        Worker w2 = new Worker();
        w2.firstName = "Василий";
        w2.lastName = "Петрович";
        w2.salary = 150;
        w2.id = 1002;

        Worker w3 = new Worker();
        w3.firstName = "Иван";
        w3.lastName = "Петрович";
        w3.salary = 150;
        w3.id = 1003;

        Worker w4 = new Worker();
        w4.firstName = "Василиса";
        w4.lastName = "Валиева";
        w4.salary = 200;
        w4.id = 1004;

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        System.out.println(w4);

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}
