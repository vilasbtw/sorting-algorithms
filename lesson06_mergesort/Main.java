package lesson06_mergesort;

public class Main {

    public static void main(String[] args) {
        
        Student students[] = {
            new Student("Chewbacca", 4),
            new Student("Luke", 5),
            new Student("Leia", 8.5),
            new Student("Han", 9),
            new Student("Anakin", 3),
            new Student("Jabba", 6.7),
            new Student("Mandalorian", 7),
            new Student("Yoda", 9.3),
            new Student("Obi Wan", 10)
        };

        Analyzer analyzer = new Analyzer(students);

        Student[] allStudents = analyzer.merge(1, 4, students.length);
        System.out.println("Merging: ");
        for (Student s : allStudents) {
            System.out.println(s.getName() + " grade: " + s.getGrade());
        }

    }
    
}