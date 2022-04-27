package com.company.view;

import java.util.Scanner;

public class Main {
    public Main(){
        Scanner scanner = new Scanner(System.in);
        ContactsView contactsView = new ContactsView();
        System.out.println("1.Xem danh ba");
        System.out.println("2.Them moi");
        System.out.println("3.Cap nhap");
        System.out.println("4.Xoa");
        System.out.println("5.Tim kiem");
        System.out.println("6.Thoat");
        System.out.println("chon chuc nang");
        int chooseMenu = Integer.parseInt(scanner.nextLine());
        switch (chooseMenu){
            case 1:
                contactsView.showListContacts();
                break;
            case 2:
                contactsView.formCreate();
                break;
            case 3:
                contactsView.editContacts();
                break;
            case 4:
                contactsView.delete();
                break;
            case 5:
                contactsView.findByPhoneNumber();
                break;
            case 6:
                System.exit(0);

        }
    }

    public static void main(String[] args) {
             new Main();
    }
}
