package lesson11_shellsort;

import java.util.Random;

public class Student {
    
    private String name;
    private double grade;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public static Student[] generateRandomStudents(int quantity) {
           Random numberGenerator = new Random();
           Student[] students = new Student[quantity];
           for (int i = 0; i < quantity; i++) {
               students[i] = new Student("Student" + i, numberGenerator.nextDouble(10));
           }
           return students;
    }

   	public static boolean isOrdered(Student[] students) {
           for (int i = 0; i < students.length - 1; i++) {
               if (students[i].getGrade() > students[i + 1].getGrade()) {
                   return false;
               }
           }
           return true;
    }
}