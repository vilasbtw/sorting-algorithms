package lesson05_mergesort;

public class Main {

    public static void main(String[] args) {
        
        Student sambinelliStudents[] = {
            new Student("Chewbacca", 4),
            new Student("Luke", 5),
            new Student("Leia", 8.5),
            new Student("Han", 9)
        };

        Student kaiqueStudents[] = {
            new Student("Anakin", 3),
            new Student("Jabba", 6.7),
            new Student("Mandalorian", 7),
            new Student("Yoda", 9.3),
            new Student("Obi Wan", 10)
        };

        Analyzer analyzer = new Analyzer(sambinelliStudents, kaiqueStudents);

        Student[] allStudents = analyzer.merge();

        System.out.println("Merging: ");
        for (Student s : allStudents) {
            System.out.println(s.getName() + " grade:" + s.getGrade());
        }

    }
    
}