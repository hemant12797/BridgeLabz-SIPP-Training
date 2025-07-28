import java.io.*;
import java.util.*;

class Contact implements Serializable {
    private String name;
    private String phone;
    private String email;
    private String address;

    public Contact(String name, String phone, String email, String address) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public String getName() { return name; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return name + " | " + phone + " | " + email + " | " + address;
    }
}

class AddressBook<T extends Contact> {
    private Map<String, T> contacts = new HashMap<>();

    public void addContact(T contact) {
        contacts.put(contact.getPhone(), contact);
    }

    public void removeContact(String phone) {
        contacts.remove(phone);
    }

    public T searchByPhone(String phone) {
        return contacts.get(phone);
    }

    public List<T> searchByName(String name) {
        List<T> result = new ArrayList<>();
        for (T contact : contacts.values()) {
            if (contact.getName().equalsIgnoreCase(name)) {
                result.add(contact);
            }
        }
        return result;
    }

    public List<T> listContacts() {
        return new ArrayList<>(contacts.values());
    }

    public void saveToFile(String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(contacts);
        }
    }

    @SuppressWarnings("unchecked")
    public void loadFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            contacts = (Map<String, T>) ois.readObject();
        }
    }

    public boolean hasSameAddress(T c1, T c2) {
        return c1.getAddress().equalsIgnoreCase(c2.getAddress());
    }

    public List<T> sortByName() {
        List<T> list = listContacts();
        list.sort(Comparator.comparing(Contact::getName));
        return list;
    }

    public List<T> sortByPhone() {
        List<T> list = listContacts();
        list.sort(Comparator.comparing(Contact::getPhone));
        return list;
    }
}

public class Main {
    public static void main(String[] args) {
        AddressBook<Contact> book = new AddressBook<>();

        Contact c1 = new Contact("Alice", "123", "alice@example.com", "123 Street");
        Contact c2 = new Contact("Bob", "456", "bob@example.com", "456 Avenue");
        Contact c3 = new Contact("Charlie", "789", "charlie@example.com", "123 Street");

        book.addContact(c1);
        book.addContact(c2);
        book.addContact(c3);

        System.out.println("Search by name:");
        for (Contact c : book.searchByName("Alice")) {
            System.out.println(c);
        }

        System.out.println("Sorted by name:");
        for (Contact c : book.sortByName()) {
            System.out.println(c);
        }

        System.out.println("Has same address: " + book.hasSameAddress(c1, c3));

        try {
            book.saveToFile("contacts.dat");
            AddressBook<Contact> newBook = new AddressBook<>();
            newBook.loadFromFile("contacts.dat");
            System.out.println("Loaded from file:");
            for (Contact c : newBook.listContacts()) {
                System.out.println(c);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
