package thayTai.Cau3_VII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuCandidate {
    Scanner sc = new Scanner(System.in);
    List<Candidate> candidates = new ArrayList<>();
    public void inputCandidate() {
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Math: ");
        double math = sc.nextDouble();
        System.out.print("Phisic: ");
        double phisic = sc.nextDouble();
        System.out.print("Chemistry: ");
        double chemistry = sc.nextDouble();
        candidates.add(new Candidate(name, math, phisic, chemistry));
        System.out.println("The candidate has been added!");
    }
    public void printCandidate() {
        int count = 1;
        for (Candidate candidate : candidates) {
            System.out.println("--------------------------");
            System.out.println(count + ". ");
            candidate.printInfo();
            count++;
        }
        System.out.println("--------------------------");
    }
    public void sortDecrease() {
        for (int i = 0; i < candidates.size() - 1; i++) {
            for (int j = i + 1; j < candidates.size(); j++) {
                if (candidates.get(i).calculateTotal() < candidates.get(j).calculateTotal()) {
                    Candidate temp = candidates.get(i);
                    candidates.set(i, candidates.get(j));
                    candidates.set(j, temp);
                }
            }
        }
        System.out.println("The list of candidates has been sorted!");
        int count = 1;
        for (Candidate candidate : candidates) {
            System.out.println("--------------------------");
            System.out.println(count + ". ");
            candidate.printInfo();
            count++;
        }
        System.out.println("--------------------------");
    }
    public void printElect() {
        int count = 1;
        for (Candidate candidate : candidates) {
            if (candidate.getMath() + candidate.getPhisic() + candidate.getChemistry() >= 17) {
                System.out.println("--------------------------");
                System.out.println(count + ". ");
                candidate.printInfo();
                count++;
            }
        }
        System.out.println("--------------------------");
    }
    public void printMenu() {
        System.out.println("1. Input candidate");
        System.out.println("2. Print candidate");
        System.out.println("3. Print sorted candidate");
        System.out.println("4. Print list of elected candidates");
        System.out.println("5. Exit");
        System.out.println("--------------------------");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                inputCandidate();
                break;
            case 2:
                printCandidate();
                break;
            case 3:
                sortDecrease();
                break;
            case 4:
                printElect();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
