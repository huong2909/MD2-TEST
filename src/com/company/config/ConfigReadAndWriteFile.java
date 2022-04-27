package com.company.config;

import com.company.model.Contacts;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ConfigReadAndWriteFile<T> {
    public List<Contacts> readFromFile(String path){
        List<Contacts> contactsList = new ArrayList<>();
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            contactsList = (List<Contacts>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return contactsList;
    }
    public void writeToFile(String path, List<Contacts> contactsList){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(contactsList);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
