package com.dxc.one;

import java.util.ArrayList;
import java.util.List;
 
public class ContactBusiness {
    public List<Contact> getContactList() {
        List<Contact> listContact = new ArrayList<>();
         
        listContact.add(new Contact("Radha", "radha@gmail.com", "USA"));
        listContact.add(new Contact("shruthi", "shruthi@outlook.com", "Canada"));
        listContact.add(new Contact("sahashra", "sahashra@yahoo.com", "Australia"));
        listContact.add(new Contact("Teju", "Teju.tr@gmail.com", "India"));
         
        return listContact;
    }
}