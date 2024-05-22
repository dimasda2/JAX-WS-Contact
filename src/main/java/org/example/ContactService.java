package org.example;


import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService
public class ContactService {

    private List<Contact> contacts = new ArrayList<>();

    @WebMethod
    public String addContact(String name, String phone) {
        contacts.add(new Contact(name, phone));
        return "Contact added successfully!";
    }

    @WebMethod
    public List<Contact> getContacts() {
        return contacts;
    }
}
