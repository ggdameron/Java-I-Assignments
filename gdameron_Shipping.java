

// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 9
// Due Date     : Oct 15, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// determins how much the cost of shipping a package will be based on weight and distance

import java.util.Scanner;

public class gdameron_Shipping{

    public static void main( String args[]){

        int weight, distance, multiplier=0, divisor;
        double rate = 0.00;
        double cost = 0.00;
        
        Scanner input = new Scanner (System.in);

        System.out.print("Welcome to the You Send It We Rend It Shipping Company\n");

        do{
            System.out.print("How heavy is your package in pounds (1-60)? ");

            weight = input.nextInt();

        }while( (weight < 1) || (weight > 60));


        do{
            System.out.print("How far will you be shipping the package in miles? ");

            distance = input.nextInt();

        }while(distance < 1);

          if( (weight >= 1) && (weight <= 10))
             rate = 5.01;

        if( (weight >= 11) && (weight <= 20))
            rate = 7.02;

        if( (weight >= 21) && (weight <= 30))
            rate = 9.03;

        if( (weight >= 31) && (weight <= 40))
            rate = 11.04;
    
        if( (weight >= 41) && (weight <= 60))
            rate = 15.00;
       
        
        if( distance <= 100)
            cost = rate;

        if( distance > 100){
            divisor = distance;
           while (divisor > 0){
            divisor -= 100;
            multiplier ++;
           }   
        
            cost = ( rate * multiplier);

        }   
        

        System.out.printf( "Your total shipping cost for %d miles is %.2f\n", distance, cost);

        }

        
        

    
    }
   
