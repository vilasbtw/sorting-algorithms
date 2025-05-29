package lesson11_shellsort;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AnalyzerTest {

    private void testShellSortScenario(Student[] students, String description) {
        Analyzer analyzer = new Analyzer(students);

        long start = System.nanoTime();
        analyzer.shellSort();
        long end = System.nanoTime();
        long duration = (end - start) / 1_000_000;

        System.out.printf("Shell Sort %s with %d elements took %d ms%n",
                description, students.length, duration);

        assertTrue(Student.isOrdered(students),
                "Shell Sort failed in: " + description);
    }

    private Student[] generateSortedStudents(int quantity) {
        Student[] students = new Student[quantity];
        for (int i = 0; i < quantity; i++) {
            students[i] = new Student("Student" + i, (double) i);
        }
        return students;
    }

    private Student[] generateReverseSortedStudents(int quantity) {
        Student[] students = new Student[quantity];
        for (int i = 0; i < quantity; i++) {
            students[i] = new Student("Student" + i, (double) (quantity - i));
        }
        return students;
    }

    @Test
    public void testShellSortPerformance() {
        int[] sizes = {5000, 50000, 500000};

        for (int size : sizes) {
            Student[] randomStudents = Student.generateRandomStudents(size);
            testShellSortScenario(randomStudents, "Random");

            Student[] sortedStudents = generateSortedStudents(size);
            testShellSortScenario(sortedStudents, "Sorted");

            Student[] reverseSortedStudents = generateReverseSortedStudents(size);
            testShellSortScenario(reverseSortedStudents, "Reverse");

            System.out.println("-----------------------------------------------");
        }
    }
}
