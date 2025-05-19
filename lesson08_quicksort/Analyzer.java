package lesson08_quicksort;

public class Analyzer {

    private Student[] students;

    public Analyzer(Student[] students) {
        this.students = students;
    }

    public int partitionByPivot(int beggining, int end) {
        
        int lessThanTarget = 0;
        Student pivot = students[end - 1];

        for (int i = 0; i < end - 1; i++) {
            if (students[i].getGrade() < pivot.getGrade()) {
                switchElements(i, lessThanTarget);
                lessThanTarget++;
            }
        }
        switchElements(end - 1, lessThanTarget);
        return lessThanTarget;
    }

    public void quicksort(int origin, int destination) {
        int quantity = destination - origin;
        if (quantity > 1) {
            int pivotPosition = partitionByPivot(origin, destination);
            quicksort(origin, pivotPosition);
            quicksort(pivotPosition + 1, destination);
        }
    }

    public void switchElements(int first, int second) {
        Student firstStudent = students[first];
        Student secondStudent = students[second];
        students[first] = secondStudent;
        students[second] = firstStudent;
    }

}