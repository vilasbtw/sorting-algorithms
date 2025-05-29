package lesson12_radixsort;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnalyzerTest {

    private void testRadixSortScenario(Person[] people, String description) {
        Analyzer analyzer = new Analyzer(people);

        long start = System.nanoTime();
        analyzer.radixSort();
        long end = System.nanoTime();
        long duration = (end - start) / 1_000_000;

        System.out.printf("Radix Sort %s with %d elements took %d ms%n",
                description, people.length, duration);

        assertTrue(Person.isOrdered(people),
                "Radix Sort failed in: " + description);
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
    public void testRadixSortPerformance() {
        int[] sizes = {5000, 50000, 500000};

        for (int size : sizes) {
            Person[] randomPeople = Person.generateRandomPerson(size);
            testRadixSortScenario(randomPeople, "Random");

            Person[] sortedPeople = generateSortedPersons(size);
            testRadixSortScenario(sortedPeople, "Sorted");

            Person[] reverseSortedPeople = generateReverseSortedPersons(size);
            testRadixSortScenario(reverseSortedPeople, "Reverse");

            System.out.println("--------------------------------------------------");
        }

    }

}