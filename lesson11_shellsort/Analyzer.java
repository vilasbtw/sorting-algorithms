package lesson11_shellsort;

public class Analyzer {

    private Student[] students;

    public Analyzer(Student[] students) {
        this.students = students;
    }

    public void shellSort() {
        int n = students.length;

        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                Student temp = students[i];
                int j = i;

                while (j >= gap && students[j - gap].getGrade() > temp.getGrade()) {
                    students[j] = students[j - gap];
                    j -= gap;
                }

                students[j] = temp;
            }
        }
    }
}
