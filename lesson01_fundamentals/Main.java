package lesson01_fundamentals;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("John", 5000));
        persons.add(new Person("Carl", 12000));
        persons.add(new Person("Frances", 1000));
        persons.add(new Person("Dorothy", 12000));
        persons.add(new Person("Bruno", 2000));

        Analyzer analyzer = new Analyzer(persons);
        System.out.println(analyzer.getEmployeeWithTheLowestIncome());
    }
}