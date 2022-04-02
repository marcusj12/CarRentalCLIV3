package com.careerdevs;

import java.util.ArrayList;
import java.util.List;

public class Dealership {
    private String dealershipName;
    private List<Car>availableCars;
    private List<Car>soldCars;

    public Dealership(String dealershipName) {
        this.dealershipName = dealershipName;
        this.availableCars = new ArrayList<>();
        this.soldCars = new ArrayList<>();
// Properties we're giving to teh class; we're blueprinting how we want things to return. Everytime we run the program it
    }

    public String getDealershipName () {
        return dealershipName;
    }

    public void setDealershipName (String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public List<Car> getAvailableCars(){
        return availableCars;
    }

    public void setAvailableCars(List<Car> availableCars){
        this.availableCars = availableCars;
    }

    public List<Car> getSoldCars(){
        return soldCars;
    }

    public void setSoldCars(List<Car>soldCars) {
        this.soldCars = soldCars;
    }
/*
What is the Override/toString method? What is its purpose and functionality?
- crafting a string that is readable to users. You're manipulating how the pointer displays the data to users.
 */
    @Override
    public String toString(){
        return "dealershipName='" + dealershipName + '\'' +
                ", availableCars='" + availableCars + '\'' +
                ", soldCars='" + soldCars;
    }
/*
The loop below is programmatically allowing users to select a car. Upon selection the car is added to the sold car array &
    removed from the available cars - demon

 */
    //todo How to fly?
    public void buyCar(String license) {
        if (availableCars.size() == 0) {
            System.out.println("Sorry there is no cars available");
            return;
        }
        for (int i =0; i < availableCars.size(); i++) {
            if (license.equals(availableCars.get(i).getLicensePlate())) {
                //System.out.println("You have selected a " + availableCars.get(i) + "for  a rental");
                soldCars.add(availableCars.get(i));
                availableCars.remove(i);
                return; // whenever we see "return"; Ends the function
            }
        }
        System.out.println("The vehicle you've selected is not available, please select from our inventory");
    }
    /* The loop below is the inverse of the loop above. The loop mimics a user returning a vehicle and it being added back
    to the available arrays
   */
    public void returnCar(String license) {
        if (soldCars.size() == 0) {
            System.out.println("No cars have been sold");
            return;
        }
        for (int i = 0; i < soldCars.size(); i++) {
            if (license.equals(soldCars.get(i).getLicensePlate())) {
                availableCars.add(soldCars.get(i));
                soldCars.remove(i);
                return;

            }
        }
        System.out.println("The vehicle you've selected has not sold yet");
    }
    /*
     */
    public void displayInventory() {
        for (int i =0; i <availableCars.size(); i++){
            System.out.println(availableCars.get(i));
        }

    }

    public void mainMenu (){
        System.out.println("1) Buy Car");

    }
}


