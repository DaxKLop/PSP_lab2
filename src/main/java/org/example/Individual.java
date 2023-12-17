package org.example;

class Individual extends Person {
    public Individual(String surname, String gender, int age) {
        super(surname, gender, age);
    }

    @Override
    public String toString() {
        return
                "Фамилия = " + getSurname()+ '\n'  +
                "Возраст = " + getAge() + '\n' +
                "Пол = " + getGender();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Individual individual = (Individual) obj;

        if (getAge() != individual.getAge()) return false;
        if (!getSurname().equals(individual.getSurname())) return false;
        return getGender().equals(individual.getGender());
    }

    @Override
    public int hashCode() {
        int result = getSurname().hashCode();
        result = 31 * result + getAge();
        result = 31 * result + getGender().hashCode();
        return result;
    }
}