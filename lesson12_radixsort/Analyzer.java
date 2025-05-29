package lesson12_radixsort;

public class Analyzer {

    private Person[] people;

    public Analyzer(Person[] people) {
        this.people = people;
    }

    public void radixSort() {
        int n = people.length;

        int maxId = people[0].getId();
        for (int i = 1; i < n; i++) {
            if (people[i].getId() > maxId) {
                maxId = people[i].getId();
            }
        }

        for (int exp = 1; maxId / exp > 0; exp *= 10) {
            countingSort(exp);
        }
    }

    private void countingSort(int exp) {
        int n = people.length;
        Person[] output = new Person[n];
        int[] count = new int[10]; // base 10

        for (int i = 0; i < n; i++) {
            int digit = (people[i].getId() / exp) % 10;
            count[digit]++;
        }

        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int digit = (people[i].getId() / exp) % 10;
            output[count[digit] - 1] = people[i];
            count[digit]--;
        }

        for (int i = 0; i < n; i++) {
            people[i] = output[i];
        }
    }
}
