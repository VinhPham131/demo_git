package thayTai.Cau3_Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    List<ThiSinh> candidate = new ArrayList<>();
    public void printMenu() {
        System.out.println("----------Menu---------");
        System.out.println("1. Input candidate");
        System.out.println("2. Print list of candidate");
        System.out.println("3. Sorted list");
        System.out.println("4. Print the admission list" );
        System.out.println("5. Exit");
        System.out.println("-----------------------");
        System.out.print("Choose a number: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inputCandidate();
                break;
            case 2:
                printCandidate();
                break;
            case 3:
                sortedDecrease();
                break;
            case 4:
                printAdmission();
                break;
            case 5:
                System.exit(0);    
            default:
                System.out.println("-----Invalid Chose!!!-----");
                return;
        }
    } 
    public void inputCandidate() {
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Math: ");
        double math = sc.nextDouble();
        System.out.print("Physic: ");
        double physic = sc.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry = sc.nextDouble();
        candidate.add(new ThiSinh(name, math, physic, chemistry));
        System.out.println("----This candidate has been added!!-----");
    }
    public void printCandidate() {
        int count = 1;
        System.out.println("----------List of Candidate---------");
        for(ThiSinh c : candidate) {
            System.out.println(count + ". ");
            c.printInfo();
            count++;
        }
        System.out.println("------------------------------------");
    }
    public void sortedDecrease() {
        for (int i = 0; i < candidate.size() - 1; i++) {
            for (int j = i + 1; j < candidate.size(); j++) {
                if (candidate.get(i).calculate() < candidate.get(j).calculate()) {
                    ThiSinh temp = candidate.get(i);
                    candidate.set(i, candidate.get(j));
                    candidate.set(j, temp);
                }
            }
        }
        System.out.println("\nThe list of candidates has been sorted!");
        printCandidate();
    }
    public void printAdmission() {
        int count = 1;
        System.out.println("---------Admission List----------");
        for(ThiSinh c : candidate) {
            if(c.calculate() >= 17) {
                System.out.println(count + ". ");
                c.printInfo();
                count++;
            }
        }
        System.out.println("-----------------------------------");
    }
}

