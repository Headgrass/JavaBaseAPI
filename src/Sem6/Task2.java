package Sem6;

/*
1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
Создайте несколько экземпляров этого класса, выведите их в консоль.
2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка,
цвет и возраст (или другие параметры на ваше усмотрение).

 */
public class Task2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.id = 1;
        cat1.age = 5;
        cat1.color = "белый";
        cat1.vacc = "бешенство";
        cat1.diagnosis = "бешенство";

        Cat cat2 = new Cat();
        cat1.id = 1;
        cat1.age = 5;
        cat1.color = "белый";
        cat1.vacc = "бешенство";

        System.out.printf(cat1.toString(), cat2.toString());
    }
}
