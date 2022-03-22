package com.careerdevs;

public class Car {
    private String make;
    private String model;
    private int year;
// Car Class Constructor
    public Car(String make,String model,int year){
        this.make = make;
        this.model = model;
        this.year = year;
    }
    /*
    Constructors are used to initialize objects; "Classes represent real world objects & objects are made within classes"
    initialize - is the process of locating and using the defined values for variable data that is used by a computer program.
    Important role in retrieving and updating the value of a variable outside the "encapsulating" class.
    Encapsulating - the idea of bundling data and methods that work on that data within one unit;the purpose is to hide
    sensitive data from users in order to access and update the private variable. (4 pillars of OOP).
    Setter updates the value of a variable
    Getters read the value of a variable
    **Accessing variables outside a class without getters/setters, we have to mark those as public, protected, or default.
    Essentially losing control over data---- thus compromising fundamental OOp principle encapsulation.--- since anyone can
    can change the non-private fields outside the class directly... thus we can not achieve immutability**
     */

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

