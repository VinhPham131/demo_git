/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thayTai.Cau4_Tai;

import java.util.ArrayList;

/**
 *
 * @author tainguyen
 */
public class ContactController {
    private ArrayList<Contact> contacts;
    private static ContactController instance = null;
    
    private ContactController() {
        contacts = new ArrayList();
    }
    public static ContactController getInstance() {
        if (instance == null) {
            instance = new ContactController();
        }
        return instance;
    }
    public ArrayList<Contact> get() {
        return contacts;
    }
    public Contact get(int index) {
        if (index < 0 || index >= contacts.size()) {
            return null;
        }else{
            return contacts.get(index);
        }
    }
    public void add(Contact contact) {
        contacts.add(contact);
    }
    public boolean isValid(Contact contact) {
        for(Contact c: contacts) {
            if (c.getPhoneNumber().equals(contact.getPhoneNumber()))
                return false;
        }
        return true;
    }
}
