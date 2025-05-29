package lesson10_countingsort;

import java.util.Random;

public class Person {

    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static Person[] generateRandomPerson(int quantity) {
        Random numberGenerator = new Random();
        Person[] people = new Person[quantity];
        for (int i = 0; i < quantity; i++) {
            people[i] = new Person("Person" + i, numberGenerator.nextInt(500_001));
        }
        return people;
    }

    public static boolean isOrdered(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            if (people[i].getId() > people[i + 1].getId()) {
                return false;
            }
        }
        return true;
    }
}
