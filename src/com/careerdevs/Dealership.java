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

    @Override
    public String toString(){
        return "dealershipName='" + dealershipName + '\'' +
                ", availableCars='" + availableCars + '\'' +
                ", soldCars='" + soldCars;
    }

    public void buyCar(String license) {
        for (int i =0; i < availableCars.size(); i++) {
            if (license.equals(availableCars.get(i).getLicensePlate())) {
                //System.out.println("You have selected a " + availableCars.get(i) + "for  a rental");
                soldCars.add(availableCars.get(i));
                availableCars.remove(i);
            }
        }
    }
    public void returnCar(String license) {
        for (int i = 0; i < soldCars.size(); i++) {
            if (license.equals(soldCars.get(i).getLicensePlate())) {
                availableCars.add(soldCars.get(i));
                soldCars.remove(i);

            }
        }
    }
    public void displayInventory() {
        for (int i =0; i <availableCars.size(); i++){
            System.out.println(availableCars.get(i));
        }

    }
}


