package com.example.paic;

public class UserProfile {
    public String userPhone;
    public String userEmail;
    public String userName;

    public UserProfile() {

    }

    public UserProfile(String Phone, String Email, String Name) {
        this.userPhone = Phone;
        this.userEmail = Email;
        this.userName = Name;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}