package com.SpringBoot.DependencyInjection;

public class Tyres {

    //////////////////////////////////// variables ////////////////////////////////////////

    String name;
    String place;
    String message;

    ///////////////////////////////// Getter and Setter //////////////////////////////////
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString(){
        return "This is the Tyre object: " + name + " This is the place: " + place + " This is the message: " + message;
    }


}
