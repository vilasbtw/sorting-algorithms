package lesson04_bubblesort;

public class Main {

    public static void main(String[] args) {
        
        Person persons[] = {
            new Person("John", 5000),
            new Person("Carl", 12000),
            new Person("Frances", 1000),
            new Person("Dorothy", 17000),
            new Person("Bruno", 2000),
            new Person("Kaique", 15000),
            new Person("Michael", 6000)
        };
        
        Analyzer analyzer = new Analyzer(persons);

        System.out.println("Before the Bubble Sort: ");
        for (Person p : persons) {
            System.out.println(p.getName() + " USD$" + p.getSalary());
        }

        analyzer.bubbleSort();
        System.out.println("---------------------------");
        System.out.println("After the Bubble Sort: ");
        for (Person p : persons) {
            System.out.println(p.getName() + " USD$" + p.getSalary());
        }

    }
    
}