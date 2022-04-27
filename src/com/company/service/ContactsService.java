package com.company.service;

import com.company.model.Contacts;

import java.util.List;

public interface ContactsService {
    List<Contacts> findAll();
    void save(Contacts contacts);
    void edit(String phoneNumber,String group,String name,String genner,String address,String email,String dateOfBirth);
    void delete(String phoneNumber);
    void findbyPhoneNumber(String phoneNumber);


}
