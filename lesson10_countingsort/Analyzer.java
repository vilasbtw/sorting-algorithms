package lesson10_countingsort;

public class Analyzer {

    private Person[] people;

    public Analyzer(Person[] people) {
        this.people = people;
    }

    public void countingSort() {
        if (people.length == 0) return;

        int minId = people[0].getId();
        int maxId = people[0].getId();
        for (Person person : people) {
            int id = person.getId();
            if (id < minId) minId = id;
            if (id > maxId) maxId = id;
        }

        int range = maxId - minId + 1;
        int[] count = new int[range];
        Person[] output = new Person[people.length];

        for (Person person : people) {
            count[person.getId() - minId]++;
        }

        for (int i = 1; i < range; i++) {
            count[i] += count[i - 1];
        }

        for (int i = people.length - 1; i >= 0; i--) {
            int id = people[i].getId();
            int pos = count[id - minId] - 1;
            output[pos] = people[i];
            count[id - minId]--;
        }

        for (int i = 0; i < people.length; i++) {
            people[i] = output[i];
        }
    }

}