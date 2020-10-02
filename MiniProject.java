/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5;

import java.util.Random;

import java.util.Scanner;

/**
 * This is a quiz that combines a random number generator with a password-like
 * authentication
 * @author Nicco
 */
public class MiniProject {
    public static void main(String[] args) {
        // create random object generator and scanner
        Random randGenerator = new Random();
        Scanner myScanner = new Scanner(System.in);
        // add in variables
        final int MAX_ANSWER = 5;

        int A = 0;
        int B = 0;
        int C = 0;
        int answer;
        String question;
        int attempts = 0;
        int userAnswer;
       // add random values to the question(below 5)
        A = randGenerator.nextInt(MAX_ANSWER);
        B = randGenerator.nextInt(MAX_ANSWER);
        C = randGenerator.nextInt(MAX_ANSWER);
       // 
        question = "(" + A + " + " + B + ") * " + C;
        answer = (A + B) * C;
              

        while(attempts < 5){
            System.out.println("Compute the value of " + question + "?");
           
            userAnswer = myScanner.nextInt();
            attempts = attempts + 1;
           
            if(userAnswer == answer){
               System.out.println("Correct! Good job!");
               break;
            } else if(attempts == 5) {
                System.out.println("Sorry, Incorrect");
                System.out.println("Solution:" + question + " = " + answer);
            } else {
                System.out.println("Sorry, Incorrect");
                if(userAnswer > answer){
                    System.out.println("Your answer is too high");
                } else { 
                    System.out.println("Your answer is too low");
                }
                System.out.println("*********");
            } // close if/else block 
                    
       } // close while loop
       
    }// close main
} // close class
   

