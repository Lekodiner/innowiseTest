package com.company;

import java.io.Serializable;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String firstLevelRole;
    private String secondLevelRole;
    private String thirdLevelRole;
    private String firstPhoneNumber;
    private String secondPhoneNumber;
    private String thirdPhoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstLevelRole() {
        return firstLevelRole;
    }

    public void setFirstLevelRole(String firstLevelRole) {
        this.firstLevelRole = firstLevelRole;
    }

    public String getSecondLevelRole() {
        return secondLevelRole;
    }

    public void setSecondLevelRole(String secondLevelRole) {
        this.secondLevelRole = secondLevelRole;
    }

    public String getThirdLevelRole() {
        return thirdLevelRole;
    }

    public void setThirdLevelRole(String thirdLevelRole) {
        this.thirdLevelRole = thirdLevelRole;
    }

    public String getFirstPhoneNumber() {
        return firstPhoneNumber;
    }

    public void setFirstPhoneNumber(String firstPhoneNumber) {
        this.firstPhoneNumber = firstPhoneNumber;
    }

    public String getSecondPhoneNumber() {
        return secondPhoneNumber;
    }

    public void setSecondPhoneNumber(String secondPhoneNumber) {
        this.secondPhoneNumber = secondPhoneNumber;
    }

    public String getThirdPhoneNumber() {
        return thirdPhoneNumber;
    }

    public void setThirdPhoneNumber(String thirdPhoneNumber) {
        this.thirdPhoneNumber = thirdPhoneNumber;
    }

    public void printUser() {
        System.out.println(this.getFirstName());
        System.out.println(this.getLastName());
        System.out.println(this.getEmail());
        if (this.getFirstLevelRole() != null) {
            System.out.println(this.getFirstLevelRole());
        } else {
            System.out.println("No role.");
        }
        if (this.getSecondLevelRole() != null) {
            System.out.println(this.getSecondLevelRole());
        } else {
            System.out.println("No role.");
        }
        if (this.getThirdLevelRole() != null) {
            System.out.println(this.getThirdLevelRole());
        } else {
            System.out.println("No role.");
        }
        System.out.println(this.getFirstPhoneNumber());
        if (this.getSecondPhoneNumber() != null) {
            System.out.println(this.getSecondPhoneNumber());
        } else {
            System.out.println("No number.");
        }
        if (this.getThirdPhoneNumber() != null) {
            System.out.println(this.getThirdPhoneNumber());
        } else {
            System.out.println("No number.");
        }
    }
}
