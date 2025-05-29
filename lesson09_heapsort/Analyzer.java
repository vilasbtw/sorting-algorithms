package lesson09_heapsort;

public class Analyzer {

    private Student[] students;

    public Analyzer(Student[] students) {
        this.students = students;
    }

    public void heapSort() {
        int total = students.length;

        for (int i = total / 2 - 1; i >= 0; i--) {
            heapify(total, i);
        }

        for (int i = total - 1; i > 0; i--) {
            switchElements(0, i);
            heapify(i, 0);
        }
    }

    private void heapify(int quantity, int origin) {
        int largest = origin;
        int left = 2 * origin + 1;
        int right = 2 * origin + 2;

        if (left < quantity && students[left].getGrade() > students[largest].getGrade()) {
            largest = left;
        }

        if (right < quantity && students[right].getGrade() > students[largest].getGrade()) {
            largest = right;
        }

        if (largest != origin) {
            switchElements(origin, largest);
            heapify(quantity, largest);
        }
    }

    public void switchElements(int first, int second) {
        Student temp = students[first];
        students[first] = students[second];
        students[second] = temp;
    }

}