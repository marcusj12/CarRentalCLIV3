package com.careerdevs;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       System.out.println("What is your name?");
       String userInput = scan.nextLine();
       System.out.println("What car would you like to rent?");



       Car rental1 = new Car("Honda", "Accord", "TW564",2018);
       Car rental2 = new Car("Jeep", "Cherokee", "OP645",2016);
       Car rental3 = new Car("Nissan", "Altima", "JG674",2016);
       Car rental4 = new Car("Toyota","Rav4","QY575",2020);
       Car rental5 = new Car("Nissan", "Maxima","ZX999",2021);

       Dealership dealership1 = new Dealership("Rocky Road Dealers");
       dealership1.getAvailableCars().add(rental1);
       dealership1.getAvailableCars().add(rental2);
       dealership1.getAvailableCars().add(rental3);
       dealership1.getAvailableCars().add(rental4);
       dealership1.getAvailableCars().add(rental5);

        //System.out.println(dealership1.getAvailableCars());
        dealership1.displayInventory();
        String userInput1 = scan.nextLine();
        dealership1.buyCar(userInput1);

        System.out.println("Thank you for renting with " + " "+  dealership1.getDealershipName() + "," + " " + "we hope you enjoy your rental experience in our "+ dealership1.getSoldCars());


       }

    }



