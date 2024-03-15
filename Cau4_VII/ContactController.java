package thayTai.Cau4_VII;

import java.util.ArrayList;
import java.util.List;

public class ContactController {
    private List<Contact> contacts;
    public ContactController() {
        contacts = new ArrayList<>();
    }
    public List<Contact> get() {
        return contacts;
    }
    public void add(Contact contact) {
        contacts.add(contact);
    }
    public boolean isValid(Contact contact) {
        for(Contact c: contacts) {
            if (c.getPhone().equals(contact.getPhone())) {
                return false;
            }
        }
        return true;
    }
    public void edit(Contact contact) {
        for(Contact c: contacts) {
            if (c.getName().equals(contact.getName())) {
                c.setName(contact.getName());
                c.setPhone(contact.getPhone());
                break;
            }
        }
    }
    public void remove(Contact contact) {
        for(Contact c: contacts) {
            if (c.getPhone().equals(contact.getPhone())) {
                contacts.remove(c);
                break;
            }
        }
    }
    public void searchByName(String newName) {
        boolean contactFound = false;
        for(Contact c : contacts) {
            if(c.getName().equals(newName)) {
                System.out.println("\n-----Contact has been found!-----");
                System.out.println(c.toString());
                contactFound = true;
                break;
            }
        }
        if(!contactFound) {
            System.out.println("\n-----This contact does not exist!-----");    
        }       
    }
       public void searchByPhone(String newPhone) {
        boolean contactFound = false;
        for(Contact c: contacts) {
            if (c.getPhone().equals(newPhone)) {
                System.out.println("\n-----Contact has been found!-----");
                System.out.println(c.toString());
                contactFound = true;
            }
        }
        if(!contactFound) {
            System.out.println("\n-----This contact does not exist!-----");
        }
    } 
    public void display() {
        System.out.println("\n-----Contact list-----");
            int count = 1;
            for (Contact c : contacts) {
                System.out.println(count + ". " + c.toString());
                count++;
            }
    }

}
