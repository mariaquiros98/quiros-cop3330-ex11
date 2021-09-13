/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Maria Quiros
 */

/*Declaring package*/
package org.example;

/*Importing scanner class*/
import java.util.Scanner;

/*Specifying class*/
public class App {
    public static void main(String[] args) {

        /*Creating a scanner object*/
        Scanner scan = new Scanner(System.in);

        /*Initializing variables*/
        int amountEuros;
        double exchangeRate;

        /*Prompting for euros to be exchanged*/
        System.out.println("How many euros are you exchanging?");
        amountEuros = scan.nextInt();

        /*Prompting for current exchange rate*/
        System.out.println("What is the exchange rate?");
        exchangeRate = scan.nextDouble();

        /*Inputting conversion formula*/
        double conversion = (amountEuros * exchangeRate);

        /*Displaying amount of euros in U.S. dollars*/
        System.out.printf("%d euros at an exchange rate of %.4f is \n%.2f U.S. dollars.", +amountEuros, exchangeRate, conversion);
    }
}