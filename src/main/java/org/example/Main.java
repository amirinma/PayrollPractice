package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        String name;
        int hours;
        double payRate;
        double grossPay;

        // creates a scanner object to read the intpu
        Scanner keyboard = new Scanner(System.in);
        // get the users name
        System.out.println("What is your name?");
        name = keyboard.nextLine();
        // get the number of hours worked this week
        System.out.println("How many hours did you work this week?");
        hours = keyboard.nextInt();
        // get the users hourly payrate
        System.out.println("What is your hourly pay rate?");
        payRate = keyboard.nextDouble();
        // calculate the gross pay
        grossPay = hours * payRate;
        //display the resulting information
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $ " + grossPay);
    }
}