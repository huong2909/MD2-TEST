package com.company.view;

import com.company.comtroller.ContactsController;
import com.company.model.Contacts;
import com.company.service.ContactsServiceIMPL;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactsView {
    Scanner scanner = new Scanner(System.in);
    List<Contacts> contactsList = ContactsServiceIMPL.contactsList;
    ContactsController contactsController = new ContactsController();
    public void showListContacts(){
        System.out.println(contactsController.showListContacts());
        new Main();
    }
    public void formCreate(){

        System.out.println("Nhap so dien thoai 10 so");
        String phone;
        boolean checkPhone;
        while (true) {
            phone = scanner.nextLine();
            checkPhone = Pattern.matches("[0-9_-]{10}", phone);
            if (!checkPhone) {
                System.err.println("Sai rồi!vui lòng nhập lại!");
            } else {
                break;
            }
        }
//        System.out.println("Nhap nhom");
//        String group = scanner.nextLine();
        System.out.println("Nhập nhom: ");
        String group;
        boolean checkGroup;
        while (true) {
            group = scanner.nextLine();
            checkGroup = Pattern.matches("(.|\\s)*\\S(.|\\s)*", group);
            if (!checkGroup) {
                System.err.println("Không được để trống!! Vui lòng nhập lại");
            } else {
                break;
            }
        }

//        System.out.println("Nhap ten");
//        String name = scanner.nextLine();
        System.out.println("Nhập tên (it nhat 6 ky tu) ");
        String name;
        boolean checkName;
        while (true) {
            name = scanner.nextLine();
            checkName = Pattern.matches("[a-z]{6,}", name);
            if (!checkName) {
                System.err.println("Nhập sai!!! Vui lòng nhập lại");
            } else {
                break;
            }
        }
        System.out.println("Nhap gioi tinh NAM/NU");
        String genner;
        boolean checkGerner;
        while (true) {
            genner = scanner.nextLine();
            checkGerner = Pattern.matches("NAM|NU", genner);
            if (!checkGerner) {
                System.err.println("Nhập sai!! Vui lòng nhập lại");
            } else {
                break;
            }
        }

        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();

        System.out.println("Nhập email");
        String email;
        boolean checkEmail;
        while (true) {
            email = scanner.nextLine();
            checkEmail = Pattern.matches("^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$", email);
            if (!checkEmail) {
                System.err.println("Sai rồi!vui lòng nhập lại!");
            } else {
                break;
            }
        }

        System.out.println("Nhap ngay sinh");
        String birthday = scanner.nextLine();
        Contacts contacts = new Contacts(phone,group,name,genner,address,email,birthday);
        contactsController.creatContacts(contacts);

        new Main();
    }
    public void editContacts(){
//        System.out.println("Nhap so dien thoai");
//        String phoneNumber = scanner.nextLine();
        System.out.println("Nhap so dien thoai");
        String phoneNumber = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber())) {
                check = true;
            }
        }
        if (check == false) {
            System.err.println("SDT không tồn tại");
            new Main();
        }
        System.out.println("Nhap nhom");
        String group = scanner.nextLine();
        System.out.println("Nhap ten");
        String name = scanner.nextLine();
        System.out.println("Nhap gioi tinh");
        String genner = scanner.nextLine();
        System.out.println("Nhap dia chi");
        String address = scanner.nextLine();
        System.out.println("Nhap email");
        String email = scanner.nextLine();
        System.out.println("Nhap ngay sinh");
        String birthday = scanner.nextLine();
        contactsController.edit(phoneNumber,group,name,genner,address,email,birthday);
        System.out.println("Cap nhap thanh cong");
        showListContacts();

        new Main();
    }
    public void delete(){
        System.out.println("Nhap so dien thoai");
        String phoneNumber = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber())) {
                check = true;
            }
        }
        if (check == false) {
            System.err.println("SDT không tồn tại");
            new Main();
        }
        contactsController.delete(phoneNumber);
        showListContacts();
        new Main();
    }
    public void findByPhoneNumber(){
        System.out.println("Nhap so dien thoai");
        String phoneNumber = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < contactsList.size(); i++) {
            if (phoneNumber.equals(contactsList.get(i).getPhoneNumber())) {
                check = true;
            }
        }
        if (check == false) {
            System.err.println("SDT không tồn tại");
            new Main();
        }
        contactsController.findbyPhoneNumber(phoneNumber);
        new Main();
    }

}
