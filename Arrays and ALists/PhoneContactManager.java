import java.util.ArrayList;
import java.util.Scanner;

public class PhoneContactManager {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();
    public static Scanner in = new Scanner(System.in);

    public void addContact(String name, String number) {
        Contact ob = new Contact(name, number);
        contacts.add(ob);
        System.out.println(ob.name + "'s contact added.");
    }

    public boolean searchContact(String name) {
        for(Contact c : contacts) {
            if(c.name==name) {
                return true;
            }
        }
        return false;
    }

    public boolean modifyContact(int index, String name) {
        if(index>=contacts.size()) {
            System.out.println("Index out of bounds");
            return false;
        }
        Contact c = contacts.get(index);
        System.out.println("Name modified successfully");
        c.name = name;
        return true;
    }

    public boolean modifyContact(int index, String name, String number) {
        if(index>=contacts.size()) {
            System.out.println("Index out of bounds");
            return false;
        }
        Contact c = contacts.get(index);
        System.out.println("Name and number modified successfully");
        c.name = name;
        c.number = number;
        return true;
    }

    public void printContacts() {
        System.out.println("\n\nContacts stored : ");
        for(Contact c : contacts) {
            System.out.println(c.name+" - "+c.number);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PhoneContactManager ob = new PhoneContactManager();
        ob.addContact("Pratik1", "9898989898"); 
        ob.addContact("Pratik2", "9898989897"); 
        ob.addContact("Pratik3", "9898989896");
        ob.printContacts();       
        ob.modifyContact(2, "Pratik4");
        ob.printContacts();
        ob.modifyContact(1, "Pratik5", "9898989895");
        ob.printContacts();
    }
}


class Contact {
    String name, number ;
    Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }
}