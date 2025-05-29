package lesson10_countingsort;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnalyzerTest {

    private void testCountingSortScenario(Person[] people, String description) {
        Analyzer analyzer = new Analyzer(people);

        long start = System.nanoTime();
        analyzer.countingSort();
        long end = System.nanoTime();
        long duration = (end - start) / 1_000_000;

        System.out.printf("Counting Sort %s with %d elements took %d ms%n",
                description, people.length, duration);

        assertTrue(Person.isOrdered(people),
                "Counting Sort failed in: " + description);
    }

    private Person[] generateSortedPersons(int quantity) {
        Person[] people = new Person[quantity];
        for (int i = 0; i < quantity; i++) {
            people[i] = new Person("Person" + i, i);
        }
        return people;
    }

    private Person[] generateReverseSortedPersons(int quantity) {
        Person[] people = new Person[quantity];
        for (int i = 0; i < quantity; i++) {
            people[i] = new Person("Person" + i, quantity - i);
        }
        return people;
    }

    @Test
    public void testCountingSortPerformance() {
        int[] sizes = {5000, 50000, 500000};

        for (int size : sizes) {
            Person[] randomPeople = Person.generateRandomPerson(size);
            testCountingSortScenario(randomPeople, "Random");

            Person[] sortedPeople = generateSortedPersons(size);
            testCountingSortScenario(sortedPeople, "Sorted");

            Person[] reverseSortedPeople = generateReverseSortedPersons(size);
            testCountingSortScenario(reverseSortedPeople, "Reverse");

            System.out.println("-----------------------------------------------");
        }

    }

}