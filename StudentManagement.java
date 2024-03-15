/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;



/**
 *
 * @author nhipham
 */
public class StudentManagement {
    
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        for (Student student : students) {
            System.out.println("------------");
            System.out.println(student);
        }
    }

    public void highestGrade() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        Student highestGrade = Collections.max(students, Comparator.comparingDouble(Student::getGrade));
        System.out.println("------------");
        System.out.println("Student with the highest average grade: " + highestGrade);

    }

    public void lowestGrade() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        Student lowestGrade = Collections.min(students, Comparator.comparingDouble(Student::getGrade));
        System.out.println("------------");
        System.out.println("Student with the lowest average grade: " + lowestGrade);
    }

    public void sortStudent() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        students.sort(Comparator.comparingDouble(Student::getGrade).reversed());

        System.out.println("Students in descending order of average grade:");
        for (Student student : students) {
            System.out.println("------------");
            System.out.println(student);
        }
    }

    public void searchName(String name) {
        for (Student student : students) {
            if (student.getName().equalsIgnoreCase(name)) {
                System.out.println("Student found:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void removeStudents() {
        students.removeIf(student -> student.getGrade() < 5);
    }
    public static void main(String[] args) {
        StudentManagement s1 = new StudentManagement();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("------------------MENU------------------");
            System.out.println("1. Add student");
            System.out.println("2. Display student list");
            System.out.println("3. Student with the highest average grade");
            System.out.println("4. Student with the lowest average grade");
            System.out.println("5. Display students in descending order of average grade");
            System.out.println("6. Search student by name");
            System.out.println("7. Convert student name to uppercase");
            System.out.println("8. Convert student name to lowercase");
            System.out.println("9. Remove students with average grade below a threshold");
            System.out.print("Select an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String name = sc.next();
                    System.out.print("Enter student class: ");
                    String class1 = sc.next();
                    System.out.print("Enter average grade: ");
                    double grade = sc.nextDouble();
                    Student student = new Student(name, class1, grade);
                    s1.addStudent(student);
                    break;

                case 2:
                    s1.displayStudents();
                    break;

                case 3:
                    s1.highestGrade();
                    break;

                case 4:
                    s1.lowestGrade();
                    break;

                case 5:
                    s1.sortStudent();
                    break;

                case 6:
                    System.out.print("Enter student name to search: ");
                    String searchName = sc.next();
                    s1.searchName(searchName);
                    break;

                case 7:
                    System.out.print("Enter student name to convert to uppercase: ");
                    String upperName = sc.next();
                    for (Student s : s1.students) {
                        if (s.getName().equalsIgnoreCase(upperName)) {
                            s.upperName();
                        }
                    }
                    break;

                case 8:
                    System.out.print("Enter student name to convert to lowercase: ");
                    String lowerName = sc.next();
                    for (Student s : s1.students) {
                        if (s.getName().equalsIgnoreCase(lowerName)) {
                            s.lowerName();
                        }
                    }
                    break;

                case 9:
                    s1.removeStudents();
                    break;
                default:
                    System.out.println("Invalid option. Please select again.");
            }
        }
    }
}
