package com.example.hostelers;

public class Contact_model {
    int img;
    String name , location;

    public Contact_model(int img, String name,String location){
        this.name = name;
        this.location = location;
        this.img = img;

    }
    public Contact_model(String name,String location){
        this.name = name;
        this.location = location;
    }
}
