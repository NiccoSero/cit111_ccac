/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3;

/**
 * Simulates basic recorded data about a road trip to Moab, Utah
 * @author Nicco
 */
public class RoadTrip {
    public static void main(String[] args) {
        
        final double NED_MILES_PER_GALLON = 32.0;
        final double AVERAGE_GAS_PRICE = 2.65;
        
        // declaring and initializing variables
        String carMake = "1996 Mazda Protege";
        String carName = "Nedfry";
        int maxPassengers = 5; // primitive type variable
        int currentNumberOfPassengers = 1;
        boolean carFull = false;
        double tripOdometer = 0.0;
        double cashOnHand = 300.00;
        double distanceToMoabUtah = 1806.0;
        boolean destinationReached = false;
        
        double legDistance; // declaring variable not initalizing
                
        // simulation of the roadtrip
        System.out.println("***Road trip simulater***");
        System.out.println("Make of car: " + carMake);
        System.out.println("Name of car: " + carName);
        System.out.println("Max number of passengers: " + maxPassengers);
        System.out.println("How many passengers are there currently?" + currentNumberOfPassengers);
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("Budget for the trip: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: " + distanceToMoabUtah);
        System.out.println("Destination reached? " + destinationReached);
        System.out.println("****************************************************");
        
        System.out.println();
        System.out.println("beginning leg 1:");
        
        // Calculate leg distance: 25% of total trip, store in legDistance
        double decimalOfOneQuarter = .25;
        legDistance = distanceToMoabUtah * decimalOfOneQuarter;
        System.out.println("CHECK LEG DISTANCE: " + legDistance);
        
        // increment trip odomoeter by leg distance, over-write odometer
        tripOdometer = tripOdometer + legDistance;
        
        // subtract leg distance from distanceTo destination, over-write distance
        distanceToMoabUtah = distanceToMoabUtah - legDistance;
        
        // "see" hitch hiker heading west
        System.out.println("Oh, look! A person who wants to go west, too!");
        
        // check if there is room in the car, if so, pick up hitch hiker
        if(carFull == false){
            System.out.println("Car is not full, picking up hitcher");
            currentNumberOfPassengers = currentNumberOfPassengers + 1;
            
            // alternative shorter version: currentNumberOf passengers++
        } // closes if()
        
        // calculate price of gas for first leg and store in temp variable
        // gas price = (distance / milesPerGallon) * Price per gallon
        double gasPriceForLeg = (legDistance / NED_MILES_PER_GALLON) * AVERAGE_GAS_PRICE;
        
        //deduct $ spent on gas from money remaining and over-write tripBudget
        cashOnHand = cashOnHand - gasPriceForLeg;
        
        //reprint status of variables to the console
        System.out.println();
        System.out.println("***Variable stats at the end of leg 1***");
        System.out.println("Max number of passengers: " + maxPassengers);
        System.out.println("How many passengers are there currently? " + currentNumberOfPassengers);
        System.out.println("Full car? " + carFull + "; Current odometer: " + tripOdometer);
        System.out.println("Budget for the trip: " + cashOnHand);
        System.out.println("Distance to Moab, Utah: " + distanceToMoabUtah);
        System.out.println("Destination reached? " + destinationReached);
        
    } // close main
    
} // close class
