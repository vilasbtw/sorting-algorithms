package lesson08_quicksort;

public class Main {

    public static void main(String[] args) {
        
        Student mandalorian = new Student("Mandalorian", 7);
        Student students[] = {
            new Student("Chewbacca", 4),
            new Student("Leia", 8.5),
            new Student("Obi Wan", 10),
            new Student("Anakin", 3),
            new Student("Luke", 5),
            new Student("Han", 9),
            new Student("Jabba", 6.7),
            new Student("Yoda", 9.3),
            mandalorian
        };

        Analyzer analyzer = new Analyzer(students);
        analyzer.quicksort(0, students.length);

        System.out.println("After the Quick Sort: ");
        for (Student s : students) {
            System.out.println(s.getName() + " grade: " + s.getGrade());
        }
    }
    
}