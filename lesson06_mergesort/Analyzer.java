package lesson06_mergesort;

public class Analyzer {

    private Student[] students;

    public Analyzer(Student[] students) {
        this.students = students;
    }

    public Student[] merge(int beggining, int middle, int end) {
        Student[] allStudents = new Student[students.length];
        
        int allStudentsCurrentIndex = 0;
        int firstGroupCurrentIndex = beggining;
        int secondGroupCurrentIndex = middle;
        

        while (firstGroupCurrentIndex < middle &&
               secondGroupCurrentIndex < end) {
            
            Student firstStudent = students[firstGroupCurrentIndex];
            Student secondStudent = students[secondGroupCurrentIndex];
            
            if (firstStudent.getGrade() < secondStudent.getGrade()) {
                allStudents[allStudentsCurrentIndex] = firstStudent;
                firstGroupCurrentIndex++;
            } else {
                allStudents[allStudentsCurrentIndex] = secondStudent;
                secondGroupCurrentIndex++;
            }
            allStudentsCurrentIndex++;
        }

        while (firstGroupCurrentIndex < middle) {
            allStudents[allStudentsCurrentIndex] = students[firstGroupCurrentIndex];
            firstGroupCurrentIndex++;
            allStudentsCurrentIndex++;
        }

        while (secondGroupCurrentIndex < end) {
            allStudents[allStudentsCurrentIndex] = students[secondGroupCurrentIndex];
            secondGroupCurrentIndex++;
            allStudentsCurrentIndex++;
        }

        return allStudents;
    }

}