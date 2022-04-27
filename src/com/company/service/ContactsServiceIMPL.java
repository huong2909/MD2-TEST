package com.company.service;

import com.company.config.ConfigReadAndWriteFile;
import com.company.model.Contacts;

import java.util.List;

public class ContactsServiceIMPL implements ContactsService{
    public static String PATH = "D:\\MD2-TEST\\src\\com\\company\\data\\contacts.txt";
    public static  List<Contacts> contactsList = new ConfigReadAndWriteFile<Contacts>().readFromFile(PATH);
    @Override
    public List<Contacts> findAll() {
       new ConfigReadAndWriteFile<Contacts>().writeToFile(PATH,contactsList);
       return contactsList;
    }

    @Override
    public void save(Contacts contacts) {
        contactsList.add(contacts);
        new ConfigReadAndWriteFile<Contacts>().writeToFile(PATH,contactsList);

    }

    @Override
    public void edit(String phoneNumber, String group, String name, String genner, String address, String email, String dateOfBirth) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber())){
                contactsList.get(i).setName(name);
                contactsList.get(i).setAddress(address);
                contactsList.get(i).setEmail(email);
                contactsList.get(i).setGender(genner);
                contactsList.get(i).setDateOfBirth(dateOfBirth);
                contactsList.get(i).setGroup(group);
            }
        }
    }

    @Override
    public void delete(String phoneNumber) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber()) ){
                contactsList.remove(i);
                System.out.println("Da xoa thanh cong");
                findAll();
            }
        }

    }

    @Override
    public void findbyPhoneNumber(String phoneNumber) {
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber())){
                System.out.println(contactsList.get(i));
            }
        }

    }
}
