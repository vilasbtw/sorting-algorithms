package lesson01_fundamentals;

import java.util.ArrayList;

public class Analyzer {

    private ArrayList<Person> persons;

    public Analyzer(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public String getEmployeeWithTheLowestIncome() {

        int lowestIncome = persons.get(0).getSalary();
        String employee = persons.get(0).getName();

        for (int i = 0; i < persons.size(); i++) {
            if (persons.get(i).getSalary() < lowestIncome) {
                lowestIncome = persons.get(i).getSalary();
                employee = persons.get(i).getName();
            }
        }
        return "The lowest income is " + lowestIncome + " from " + employee;
    }
}