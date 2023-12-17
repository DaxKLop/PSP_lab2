package org.example;

import java.util.ArrayList;
import java.util.List;

class PersonCollectionManager implements CollectionManager {
    private List<Person> persons;

    public PersonCollectionManager() {
        persons = new ArrayList<>();
    }

    @Override
    public void addPerson(Person person) {
        persons.add(person);
    }

    @Override
    public double getAverageAge() {
        if (persons.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Person person : persons) {
            totalAge += person.getAge();
        }

        return (double) totalAge / persons.size();
    }

    @Override
    public int getMaleCount() {
        int maleCount = 0;
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("Мужчина")) {
                maleCount++;
            }
        }
        return maleCount;
    }
}
