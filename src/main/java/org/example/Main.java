package org.example;

public class Main {
    public static void main(String[] args) {
        PersonCollectionManager collectionManager = new PersonCollectionManager();
        Individual[] people = new Individual[5];
        people[0] = new Individual("Гена", "Мужчина", 12);
        people[1] = new Individual("Гена", "Мужчина", 15);
        people[2] = new Individual("Маша", "Женщина", 11);
        people[3] = new Individual("Гена", "Мужчина", 35);
        people[4] = new Individual("Света", "Женщина", 9);




        for (int i = 0; i < people.length; i++) {
            collectionManager.addPerson(people[i]);
            System.out.println(people[i].toString() + '\n');
        }

        System.out.println("Average age: " + collectionManager.getAverageAge());
        System.out.println("Male count: " + collectionManager.getMaleCount());
    }
}