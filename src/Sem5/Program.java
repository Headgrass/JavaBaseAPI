package Sem5;

import java.util.HashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(123456, "Иванов");
        employees.put(456764,"Петров");
        employees.put(234547,"Васильев");
        employees.put(654321,"Иванов");
        employees.put(234432,"Петрова");

        for(Map.Entry entry: employees.entrySet()){
            if(entry.getValue().equals("Иванов")) {
                System.out.println(String.format("%d, %s", entry.getKey(), entry.getValue()));
            }
        }
    }
}
