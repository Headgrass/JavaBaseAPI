package HomeWorks.Sem2;

/*
Дана строка sql-запроса "select * from students where ".
Сформируйте часть WHERE этого запроса, используя StringBuilder.
Данные для фильтрации приведены ниже в виде json строки.
Если значение null, то параметр не должен попадать в запрос.

Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 */
public class Task1 {
    public static void main(String[] args) {
        String base = "select * from students where ";
        StringBuilder sb = new StringBuilder(base);
        System.out.println(sb.append("country: Russia"));


    }
}
