package org.example;

public class WriteInfo {
    public void write_info(Person per) {
        System.out.println("Фамилия: " + per.getSurname());
        System.out.println("Пол: " + per.getGender());
        System.out.println("Возраст: " + per.getAge());
    }
}
