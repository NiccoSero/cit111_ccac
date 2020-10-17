/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6;

import java.util.Scanner;

/**
 *A program that bases friend compatibility on a series of questions 
 * answered by the user
 * @author Nicco
 */
public class FriendMachine {
    
    final static int COMPAT_THRESHOLD = 100;
    
    public static void main(String[] args) {
        // create variables
        Scanner scan = new Scanner(System.in);
        int responseNum = 0;
        int compScore = 0;
        
        System.out.println("Welcome to Nico's Friend Machine!");
        System.out.println("Question 1: Do you play Video games? (0 = no, 1 = yes)");
        // use scanner to scan imput
        responseNum = scan.nextInt();
        // evaluates the response, and only runs if the user plays video games
        if(responseNum == 1){
            // give points 
            compScore = compScore + 100;
            
            System.out.println("Awesome, video games are pretty fun!");
            
            // nested question
            System.out.println("Question 2: Which platform do you play games on?");
            System.out.println("PS4 = 1");
            System.out.println("XBOX = 2");
            System.out.println("PC = 3");
            System.out.println("Other = 4");
            
            responseNum = scan.nextInt();
            // user perfers PS4
            if(responseNum == 1){
                System.out.println("That is a wise console choice.");
                
                compScore = compScore + 70;
            // user perfers XBOX    
            } else if(responseNum == 2){
                System.out.println("I have never owned one, but I'm sure its a");
                System.out.println(" great console.");
                
                compScore = compScore + 20;
            // user perfers PC    
            } else if(responseNum == 3){
                System.out.println("PC's are great with a wide range");
                System.out.println(" of different games!");
                
                compScore = compScore + 200;
            // user perfers Other    
            } else if(responseNum == 4){
                System.out.println("Sorry for not including your perferred platform.");
                
                compScore = compScore + 20;
            // user give invalid answer    
            } else {
                System.out.println("Not a valid answer, no points are granted.");
            }
            
        } else {
            // users that dont play video games
            System.out.println("Bummer, you should give them a try, they're alot of fun.");
            System.out.println("Skipping Q2");
        } // close if/else of question 1
        
        // bring back logic on Q3
        System.out.println("Question 3: Do you like to listen to music?");
        System.out.println("(0 = no, 1 = yes)");
        
        responseNum = scan.nextInt();
        // scan users answer
        if (responseNum == 1){
            
            System.out.println("Music is pretty awesome!");
            compScore = compScore + 100;
        } else { 
            System.out.println("Really??? Everyone likes to listen to music.");
            
            compScore = compScore - 20;
        } // close question 3 if/else
        
        // show final score
        System.out.print("Your compatability score is: ");
        System.out.println(compScore);
        System.out.print("Based on a friend threshold score of: ");
        System.out.println(COMPAT_THRESHOLD);
        
        // friend determination
        if(compScore >= COMPAT_THRESHOLD){
            System.out.println("Nice, we have a chance at being friends!");
        } else {
            System.out.println("I don't think this is going to work out.");
        } // close friend determination if/ else 
        
        System.out.println("Thanks for participating in Nico's Friend Machine!");
        
    } // close main
} // close class
