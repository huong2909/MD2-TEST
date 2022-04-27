package com.company.comtroller;

import com.company.model.Contacts;
import com.company.service.ContactsServiceIMPL;

import java.util.List;

public class ContactsController {
    ContactsServiceIMPL contactsServiceIMPL = new ContactsServiceIMPL();
    public List<Contacts> showListContacts(){
        return contactsServiceIMPL.findAll();
    }
    public void creatContacts(Contacts contacts){
        contactsServiceIMPL.save(contacts);
    }
    public void findbyPhoneNumber(String phoneNumber){
        contactsServiceIMPL.findbyPhoneNumber(phoneNumber);
    }
    public void edit(String phoneNumber, String group, String name, String genner, String address, String email, String dateOfBirth ){
        contactsServiceIMPL.edit(phoneNumber, group, name, genner, address, email, dateOfBirth);
    }
    public void delete(String phoneNumber){
        contactsServiceIMPL.delete(phoneNumber);
    }


}
