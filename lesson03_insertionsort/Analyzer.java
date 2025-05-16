package lesson03_insertionsort;

public class Analyzer {

    private Person[] persons;

    public Analyzer(Person[] persons) {
        this.persons = persons;
    }

    public void insertionSort() {
        for (int current = 1; current < persons.length; current++) {
            int analyzis = current;
            while (analyzis > 0 && persons[analyzis].getSalary() < persons[analyzis - 1].getSalary()) {
                switchElements(analyzis, analyzis - 1);
                analyzis--;
            }
        }    
    }

    public void switchElements(int first, int second) {
        Person firstPerson = persons[first];
        Person secondPerson = persons[second];
        persons[first] = secondPerson;
        persons[second] = firstPerson;
    }

}