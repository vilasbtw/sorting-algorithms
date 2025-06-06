package lesson03_insertionsort;

public class Main {

    public static void main(String[] args) {
        
        Person persons[] = {
            new Person("John", 5000),
            new Person("Carl", 12000),
            new Person("Frances", 1000),
            new Person("Dorothy", 17000),
            new Person("Bruno", 2000)
        };
        
        Analyzer analyzer = new Analyzer(persons);

        System.out.println("Before the Insertion Sort: ");
        for (Person p : persons) {
            System.out.println(p.getName() + " USD$" + p.getSalary());
        }

        analyzer.insertionSort();
        System.out.println("---------------------------");
        System.out.println("After the Insertion Sort: ");
        for (Person p : persons) {
            System.out.println(p.getName() + " USD$" + p.getSalary());
        }

    }
    
}