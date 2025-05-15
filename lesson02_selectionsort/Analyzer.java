package lesson02_selectionsort;

public class Analyzer {

    private Person[] persons;

    public Analyzer(Person[] persons) {
        this.persons = persons;
    }

    public int getIndexOfTheLowestValue(int beggining, int end) {
    
        int indexOfTheLowestValue = beggining;

        for (int current = beggining; current <= end; current++) {
            if (persons[current].getSalary() < persons[indexOfTheLowestValue].getSalary()) {
                indexOfTheLowestValue = current;
            }
        }
        return indexOfTheLowestValue;
    }

    public void selectionSort() {
        for (int current = 0; current < persons.length; current++) {
            int indexOfTheLowestValue = getIndexOfTheLowestValue(current, persons.length - 1);
            Person currentPerson = persons[current];
            Person personWithTheLowestSalary = persons[indexOfTheLowestValue];
            persons[current] = personWithTheLowestSalary;
            persons[indexOfTheLowestValue] = currentPerson;
        }

    }
}