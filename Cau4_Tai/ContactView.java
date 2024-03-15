/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai.Cau4_Tai;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author tainguyen
 */
public class ContactView {
    private Scanner scanner;
    private ContactController controller = ContactController.getInstance();
    
    public ContactView() {
        scanner = new Scanner(System.in);
        
    }
    
    public void run() {
        int funcSelected;
        do {
            printMenu();
            funcSelected = scanner.nextInt();
            process(funcSelected);
        } while(funcSelected != 0);
    }
    
    private void printMenu() {
        System.out.println("-------Contact Management------");
        System.out.println("\tAn 1. Display");
        System.out.println("\tAn 2. Add");
        System.out.println("\tAn 3. Edit");
        System.out.println("\tAn 4. Delete");
        System.out.println("\tAn 5. Seach by Name");
        System.out.println("\tAn 6. Seach by Phone");
        System.out.println("\tAn 0. Exit");
        System.out.println("-------------------------------");
        System.out.print("Choose: ");
    }
    
    private void process(int funcSelected) {
        switch(funcSelected) {
            case 1: 
                display();
                break;
            case 2:
                add();
                break;
            case 3: 
                edit();
                break;
            case 0: 
                System.out.println("Bye!!!!");
                break;
            default: 
                System.out.println("Wrong function!!!");
        }
    }
    
    private void display() {
        ArrayList<Contact> contacts = controller.get();
        int index = 0;
        System.out.println("------Contacts------");
        for(Contact contact : contacts) {
            System.out.println(index + ". " + contact.toString());
            index++;
        }
        
        if (contacts.isEmpty()) {
            System.out.println("No contact");
        }
        System.out.println("--------------------");
    }
    
    private void add() {
        String name, phoneNumber;
        
        scanner.nextLine();
        System.out.println("Input information");
        System.out.print("Name: ");
        name = scanner.nextLine();
        
        System.out.print("Phone Number: ");
        phoneNumber = scanner.nextLine();
        
        Contact conntact = new Contact(name, phoneNumber);
        if (controller.isValid(conntact)) {
            controller.add(conntact);
            System.out.println("Add contact successful !!");
        } else {
            System.out.println("This phone number is existed");
        }
    }
    private void edit() {
    display();
    System.out.println("Input row to edit: ");
    int row = scanner.nextInt();
    Contact c = controller.get(row - 1);
    if (c == null) {
        System.out.println("Row is not exist");
        return;
    } else {
        System.out.println("Input new name: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Input new phone number: ");
        String phoneNumber = scanner.nextLine();
        c.setName(name);
        c.setPhoneNumber(phoneNumber);
        System.out.println("Edit successful");
    }
    }
}
