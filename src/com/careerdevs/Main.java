package com.careerdevs;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
//       System.out.println("What would you like to do?");
       //String userInput = scanner.nextLine();
//       System.out.println("What car would you like to rent, based off of license plate?");


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

        System.out.println("Hello! Welcome to the " + dealership1.getDealershipName() + "dealership ") ;

        while (true){
            System.out.println("Would you like to do: (1) Buy a Car (2) Return a Car (3) Leave the dealership");
            int res = 0;

            try{ // we have code, taht is prone to throw an exception;
                res = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception ex) {

            }

            if (res == 3) {
                System.out.println("You are now leave the dealership");
                break;
            } else if (res ==2){
                //return logic here
                System.out.println("Which car would you like to return? Input license plate");
                for (int i =0; i <dealership1.getSoldCars().size(); i++) {
                    System.out.println(dealership1.getSoldCars().get(i));
                }

                String userInput = scanner.next();
                dealership1.returnCar(userInput);
                System.out.println(dealership1.getAvailableCars());
                System.out.println(dealership1.getSoldCars());

            }else if (res == 1){
                //buy car logic here
                System.out.println("Which car would you like to rent? Input license plate");
                for (int i =0; i <dealership1.getAvailableCars().size(); i++) {
                    System.out.println(dealership1.getAvailableCars().get(i));
            }
                String userInput = scanner.next();
                dealership1.buyCar(userInput);
                System.out.println(dealership1.getAvailableCars());
                System.out.println(dealership1.getSoldCars());

            } else {
                System.out.println("");
            }
        }
        //System.out.println(dealership1.getAvailableCars());

//        for (int i =0; i < dealership1.getAvailableCars().size();i++){
//            System.out.println(dealership1.getAvailableCars().get(i));
//        }
        dealership1.displayInventory();
        String userInput1 = scanner.nextLine();
        dealership1.buyCar(userInput1);

        System.out.println("Thank you for renting with" + " "+  dealership1.getDealershipName() + "," + " " + "we hope you enjoy your rental experience in our "+ dealership1.getSoldCars());
       }
    }


/*
While loops run indefinitely we have to find a way to break out of the loop
In a business sense, we want to make sure the logic of the program and our menu is sound. The issue we were having or
rather the issue we are trying to remedy is the break in the code. If a user inputs a response that doesn't match
the data It's trying to access then it defaults to the main menu. If users have already indicated that they already wanted
to buy or rent a vehicle, why should they be asked again.
 */