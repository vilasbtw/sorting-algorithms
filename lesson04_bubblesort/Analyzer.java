package lesson04_bubblesort;

public class Analyzer {

    private Person[] persons;

    public Analyzer(Person[] persons) {
        this.persons = persons;
    }

    public void bubbleSort() {  
        int changes = 0;
        
        for (int j = persons.length - 1; j > 0; j--) {
            for (int i = 0; i < persons.length - 1; i++) {
                if (persons[i].getSalary() > persons[i + 1].getSalary()) {
                    Person auxiliaryPerson = persons[i];
                    persons[i] = persons[i + 1];
                    persons[i + 1] = auxiliaryPerson;
                    changes++;
                }
            }
            if (changes == 1) break;
        }
    }

}