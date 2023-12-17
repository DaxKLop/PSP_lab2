package org.example;

abstract class Person {
    String surname;
    String gender;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Person() {
    }

    public Person(String surname, String gender, int age) {
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }


}
