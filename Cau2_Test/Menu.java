package thayTai.Cau2_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    List<Person> persons = new ArrayList<>();
    public void printMenu() {
        System.out.println("\n\t     Menu");
        System.out.println("---------------------------------");
        System.out.println("1. Input list of student");
        System.out.println("2. Input list of teacher");
        System.out.println("3. Print list of student");
        System.out.println("4. Print list of teacher");
        System.out.println("5. Exit");
        System.out.println("---------------------------------");
        System.out.print("Choose a number: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inputStudent();
                break;
            case 2:
                inputTeacher();
                break;
            case 3:
                printStudent();
                break;
            case 4:
                printTeacher();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid chose !!!");
        }
    }
    private void inputStudent() {
        System.out.println("\n------------Input Student-----------");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Gender: ");
        String sex = sc.next();
        System.out.print("Class name: ");
        String className = sc.next();
        System.out.print("Average grades: ");
        double average = sc.nextDouble();
        persons.add(new Student(name, age, sex, className, average));
        System.out.println("\n----This student has been added!!----");
    }
    private void printStudent() {
        int count = 1;
        for(Person person : persons) {
           if(person instanceof Student) {
            System.out.println("----------Student List------------");
            System.out.println(count + ". ");
            person.printInfo();
            count++;
           }
        }
    }
    private void inputTeacher() {
        System.out.println("-----------Input Teacher-----------");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Gender: ");
        String sex = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        persons.add(new Teacher(name, age, sex, salary));
        System.out.println("\n----This teacher has been added!!----");
    }
    private void printTeacher() {
        int count = 1;
        for(Person person : persons) {
            if (person instanceof Teacher) {
            System.out.println("----------Teacher List------------");
            System.out.println(count + ". ");
            person.printInfo();
            count++;
            } 
        }
    }
}
