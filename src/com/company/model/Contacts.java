package com.company.model;

import java.io.Serializable;

public class Contacts implements Serializable {
    private String phoneNumber;
    private String group;
    private String name;
    private String gender;
    private String address;
    private String email;
    private String dateOfBirth;


    public Contacts() {
    }

    public Contacts(String phoneNumber, String group, String name, String gender, String address, String email, String dateOfBirth) {
        this.phoneNumber = phoneNumber;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Contacts{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
