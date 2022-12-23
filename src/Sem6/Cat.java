package Sem6;

import java.util.ArrayList;

/*
1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java.
 */
/*
а) для ветеринарной клиники
    id
    name
    age
    color
    vacc
    diagnoses
б) архивом выставки котов
    id
    name
    age
    color
    photo
    fair
    tricks
    winsList
в) информационной системой Театра кошек Ю. Д. Куклачёва
    id
    name
    age
    color
    photo
    fair
    performance
 */
public class Cat {
    int counter = 0;
    Integer id;
    String name;
    Integer age;
    String color;
    String diagnosis;
    String vacc;
//    ArrayList<String> fair;
//    ArrayList<String> perfomance;

    public Cat(String name, String color, int age) {
        this.id = counter++;
        this.name = name;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("id: %d, name: %s, diagnosis: %s", id, name, diagnosis);
    }
}


import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.List;
        import java.util.Objects;

public class Cat {
    private String name;
    private String color;
    private int age;
    private String breed;
    private List<String> injections;

    public Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.injections = new ArrayList<String>();
    }

    public void addInjection() {
        this.injections.add(String.valueOf(LocalDateTime.now()));
    }
    public List<String> getInjections() {
        return this.injections;
    }
    public void addAge() {
        this.age++;
    }
    @Override
    public String toString() {
        return "Кличка: " + this.name + " Цвет: " + this.color + " Возраст: " + this.age;
    }
    @Override
    public boolean equals(Object o) {
        if(o instanceof Cat) {
            Cat cat = (Cat) o;
            return cat.age == this.age && cat.breed.equals(this.breed) && cat.injections.equals(this.injections) && cat.color.equals(this.color) && cat.name.equals(this.name);
        }
        return false;
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.age, this.name, this.color, this.breed, this.injections);
    }
}