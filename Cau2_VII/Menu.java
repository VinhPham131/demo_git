package thayTai.Cau2_VII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    List<Person> persons = new ArrayList<>();
    public  void inputStudent() {
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Gender: ");
        String gender = sc.nextLine();
        System.out.print("Class name: ");
        String className = sc.nextLine();
        System.out.print("Average grade: ");
        double average = sc.nextDouble();
        persons.add(new Student(className, average, name, age, gender));
        System.out.println("The student has been added!");
    }
    public void inputTeacher() {
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();
        System.out.print("Gender: ");
        String gender = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();
        persons.add(new Teacher(salary, name, age, gender));
    }
    public void printStudent() {
        int count = 1;
        for (Person person : persons) {
            if (person instanceof Student) {
                System.out.println("--------------------------");
                System.out.println(count + ". ");
                person.printInfo();
                count++;
            }
        }
        System.out.println("--------------------------");
    }
    public void printTeacher() {
        int count = 1;
        for (Person person : persons) {
            if (person instanceof Teacher) {
                System.out.println("--------------------------");
                System.out.println(count + ". ");
                person.printInfo();
                count++;
            }
        }
        System.out.println("--------------------------");
    }
    public void printMenu() {
        System.out.print("\nPress 1. Input list of students");
        System.out.print("\nPress 2. Input list of teachers");
        System.out.print("\nPress 3. Print list of students");
        System.out.print("\nPress 4. Print list of teachers");
        System.out.print("\nPress 5. Exit");
        System.out.print("\n---------------------------------------");
        System.out.print("\nChoose a number: ");
        int choice = sc.nextInt();
        switch(choice) {
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
                System.exit(0);;
            default:
                System.out.println("Invalid choice!");
        }
    }
    public static void main(String[] args) {
        Menu menu = new Menu();
        while(true) {
            menu.printMenu();
        }
    }
}
