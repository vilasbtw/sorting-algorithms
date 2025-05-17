package lesson05_mergesort;

public class Analyzer {

    private Student[] firstClass;
    private Student[] secondClass;

    public Analyzer(Student[] firstClass, Student[] secondClass) {
        this.firstClass = firstClass;
        this.secondClass = secondClass;
    }

    public Student[] merge() {
        int studentsTotalQuantity = firstClass.length + secondClass.length;
        Student[] allStudents = new Student[studentsTotalQuantity]; 
        
        int firstClassCurrentIndex = 0;
        int secondClassCurrentIndex = 0;
        int allStudentsCurrentIndex = 0;

        while (firstClassCurrentIndex < firstClass.length &&
               secondClassCurrentIndex < secondClass.length) {

            Student firstStudent = firstClass[firstClassCurrentIndex];
            Student secondStudent = secondClass[secondClassCurrentIndex];
            
            if (firstStudent.getGrade() < secondStudent.getGrade()) {
                allStudents[allStudentsCurrentIndex] = firstClass[firstClassCurrentIndex];
                firstClassCurrentIndex++;
            } else {
                allStudents[allStudentsCurrentIndex] = secondStudent;
                secondClassCurrentIndex++;
            }
            allStudentsCurrentIndex++;
        }

        while (firstClassCurrentIndex < firstClass.length) {
            allStudents[allStudentsCurrentIndex] = firstClass[firstClassCurrentIndex];
            firstClassCurrentIndex++;
            allStudentsCurrentIndex++;
        }

        while (secondClassCurrentIndex < secondClass.length) {
            allStudents[allStudentsCurrentIndex] = secondClass[secondClassCurrentIndex];
            secondClassCurrentIndex++;
            allStudentsCurrentIndex++;
        }
    
        return allStudents;
    }

}