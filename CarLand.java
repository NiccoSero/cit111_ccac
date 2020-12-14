/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.Scanner;


/**
 *
 * @author Nicco
 */
public class CarLand {
    
    public static void main(String[] args){

        //Greet the user and ask a question
        System.out.println("------Hello welcome to CarLand, a online car Dealer in PA!------");
        System.out.println("We have a abundant amount of vehicles, ");
        System.out.println("and hopfully you cant find the right one for you!");
        System.out.println("----------------------------------------------------");
        System.out.println("What kind of car are you looking for?");
        System.out.println(" Are you looking for a SUV, sedan, or truck?");
        System.out.println("(1 = SUV, 2 = sedan, 3 = truck)");
        
        while (true) {
        //add scanner
        Scanner scanner = new Scanner(System.in);
        //create variable
        int userChoice = 0;
        
        userChoice = scanner.nextInt();
        
        // match userChoice value to cases value
        switch (userChoice){            
            
            case 1: 
                SUV newSUV;
                newSUV = new SUV();
                newSUV.SUV = "A new SUV! Thats a great choice!";
                displaySUVTypes(newSUV);
                break;
            case 2:
                Sedan newSedan;
                newSedan = new Sedan();
                newSedan.Sedan = "Sedan are a fun to drive and a great choice!";
                displaySedanTypes(newSedan);
                break;
            case 3:
                Truck newTruck;
                newTruck = new Truck();
                newTruck.Truck = "A truck is a very useful vehicle especially when towing!";
                displayTruckTypes(newTruck);
                break;
            case 4:
                System.out.println("Red is a great choice!");
                break;
            case 5:
                System.out.println("Black is nice, hope you like to wash your car alot.");
                break;
            case 6:
                System.out.println("Blue is my personal favorite color!");
                break;
            case 7:
                System.out.println("Purple is a cool and unique different.");
                break;
            case 8:
                System.out.println("-----------------------------------------------------");
                System.out.println("You have picked a great vehicle, I hope you enjoy it!");
                return;
        } // close switching block
    } // close while loop 
} // close main
    // display for users that pick SUV
    public static void displaySUVTypes(SUV newSUV){
        System.out.println(newSUV.SUV);
        System.out.println("Here are the SUV options you have to pick from:");
        System.out.println("----------------------------------------------------");
        System.out.println(newSUV.SUVOption1);
        System.out.println(newSUV.SUVOption2);
        System.out.println(newSUV.SUVOption3);
        System.out.println(newSUV.SUVOption4);
        System.out.println("----------------------------------------------------");
        
        System.out.println("Which color do you perfer?");
        System.out.println("(4 = red, 5 = black, 6 = blue, 7 = purple)");
        System.out.println("Then press 8 to complete your order.");
    } // close displaySUVTypes
    
    // display for users that pick sedan
    public static void displaySedanTypes(Sedan newSedan){
        System.out.println(newSedan.Sedan);
        System.out.println("Here are the SUV options you have to pick from:");
        System.out.println("----------------------------------------------------");
        System.out.println(newSedan.sedanOption1);
        System.out.println(newSedan.sedanOption2);
        System.out.println(newSedan.sedanOption3);
        System.out.println(newSedan.sedanOption4);
        System.out.println("----------------------------------------------------");
        
        System.out.println("Which color do you perfer?");
        System.out.println("(4 = red, 5 = black, 6 = blue, 7 = purple)");
        System.out.println("Then press 8 to complete your order.");
    } // close displaySedanTypes
        
    // display for users that pick truck
    public static void displayTruckTypes(Truck newTruck){
        System.out.println(newTruck.Truck);
        System.out.println("Here are the SUV options you have to pick from:");
        System.out.println("----------------------------------------------------");
        System.out.println(newTruck.truckOption1);
        System.out.println(newTruck.truckOption2);
        System.out.println(newTruck.truckOption3);
        System.out.println(newTruck.truckOption4);
        System.out.println("----------------------------------------------------");
        
        System.out.println("Which color do you perfer?");
        System.out.println("(4 = red, 5 = black, 6 = blue, 7 = purple)");
        System.out.println("Then press 8 to complete your order.");
    } // close displayTruckType
        
} // close class
