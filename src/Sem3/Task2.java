package Sem3;

import java.util.ArrayList;
import java.util.List;

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.

 */
public class Task2 {
    public static void main(String[] args) {
        initPlanet();

    }

    private static void initPlanet() {

        Integer count = 0;
        String temp = "";

        String[] planets = {"Venera", "Mars", "Jupiter", "Venera", "Earth", "Moon", "Jupiter", "Earth", "Appolo440", "Venera"};
        String[] result = new String[0];

        for (int i = 0; i < planets.length; i++) {
            for (int j = 0; j < planets.length + 1; j++) {
                if (planets[i] == planets[j]) {
                    temp = planets[j];
                    count++;


                }
            }
        }
        System.out.println(temp);
        System.out.println(count);


//
//        for (int i = 0; i < planet.size(); i++) {
//            if (planet.equals(i)) {
//                count++;
//            }
//        }
//        System.out.println(count);
//    }

    }
}