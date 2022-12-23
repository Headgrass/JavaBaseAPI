package HomeWorks.Sem5;

import java.util.HashMap;
import java.util.Map;

/*
Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности.
Реализовать алгоритм пирамидальной сортировки (HeapSort).
На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга.
 */
public class Task1 {
    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();
        db.put("Милана Майорова", "89521562233");
        db.put("Милана Кулагина", "89526762763");
        db.put("Даниил Орехов", "89521561183");
        db.put("Филипп Яковлев", "89266762543");
        db.put("Надежда Кузнецова", "89538562233");
        db.put("Алисия Макарова", "89526762289");
        db.put("Вера Егорова", "89527652239");
        db.put("Максим Осипов", "89526094253");
        db.put("Кирилл Щербаков", "89524322533");
        db.put("Ева Коновалова", "89526656209");

        System.out.println(db); //{null=null, 1=один, 2=два}
        System.out.println(db.get(44));

        System.out.println(repeatName(db));
    }

    private static String repeatName(Map<String, String> db) {
        int count = 0;
//        for (int i = 0; i < db.size(); i++) {
//            for (int j = 0; j < db.size(); j++) {
//                if (db.keySet(i) == db.keySet(j)) {
//
//                }
//            }
//            if (db.keySet() == db.keySet())
//            db.get(i);
//            count++;
        return null;
    }

}