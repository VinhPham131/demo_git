package thayTai.Cau4_VII;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContactMenu {
    private Scanner sc;
    private ContactController controller;
    List<Contact> contacts = new ArrayList<>();
    public ContactMenu() {
        sc = new Scanner(System.in);
        controller = new ContactController();
    }
    public void run() {
        int choice;
        do {
            printMenu();
            choice = sc.nextInt();
            process(choice);
        } while(choice != 0);
    }
    public void addContact() {
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Phone number: ");
        String phone = sc.next();
        Contact contact = new Contact(name, phone);
        if(controller.isValid(contact)) {
            controller.add(contact);
            contacts.add(contact);
            System.out.println("\n-----Contact has been added!-----");
        } else {
            System.out.println("\n-----This contact already exists!-----");
        }
    }
    public void editContact() {
        display();
        boolean contactFound = false;
        System.out.print("Enter a contact name to edit: ");
        String newName = sc.next();
        
        for(Contact c : contacts) {
            if(c.getName().equals(newName)) {
                contactFound = true;
                controller.remove(c);
                System.out.print("Enter a new name: ");
                String name = sc.next();
                System.out.print("Enter a new phone number: ");
                String phone = sc.next();
                Contact contact = new Contact(name, phone);
                controller.edit(contact);
                controller.add(contact);
                System.out.println("\n------Contact has been edited!------");
                return;
            }
        }
        if(!contactFound) {
            System.out.println("\n-------This contact does not exist!-------");
        }
    }
    public void removeContact() {
        boolean contactFound = false;
        display();
        System.out.print("Enter a contact name to remove: ");
        String newName = sc.next();
        for(Contact c : contacts) {
            if(c.getName().equals(newName)) {
                contactFound = true;
                controller.remove(c);
                System.out.println("\n-----Contact has been removed!-----");
                return;
            }
        }
        if(!contactFound){
            System.out.println("\n-----This contact does not exist!-----");
        }
    }
    public void searchName() {
        System.out.print("Enter a name to seach contact: ");
        String newName = sc.next();
        controller.searchByName(newName);
    }
    public void searchPhone() {
        System.out.print("Enter a phone number to seach contact: ");
        String newPhone = sc.next();
        controller.searchByPhone(newPhone);
    }
    public void display() {
        if (contacts.isEmpty()) {
            System.out.println("Contact list is empty.");
        } else {
            controller.display();
        }
    }
    public void printMenu() {
        System.out.print("\n1. Add contact");
        System.out.print("\n2. Edit contact");
        System.out.print("\n3. Remove contact");
        System.out.print("\n4. Search contact by name");
        System.out.print("\n5. Search contact by phone number");
        System.out.print("\n6. Display all contacts");
        System.out.println("\n7. Exit");
        System.out.print("\n--------------------------");
        System.out.print("\nChoose a number: ");
    }
    public void process(int choice) {
        switch(choice) {
            case 1:
                addContact();
                break;
            case 2:
                editContact();
                break;
            case 3:
                removeContact();
                break;
            case 4:
                searchName();
                break;
            case 5:
                searchPhone();
                break;
            case 6:
                display();
                break;
            case 7:
                System.exit(0);
            default:
                System.out.println("Invalid choice!");
        }      
    }
}
