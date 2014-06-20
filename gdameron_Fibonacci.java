// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 13 
// Due Date     : Nov 12, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
//Program accets an int and outputs the corresponding Fibonaccci number.

import java.util.Scanner;

public class gdameron_Fibonacci{

    public static void main( String args[]){

        int x;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Which fibonacci number would you like? ");

            x = input.nextInt();

        }while(x < 0 || x > 70 );

        System.out.printf("Fibonacci #%d is %.0f \n", x, fibcalc(x));
    }

    public static double fibcalc( int x ){
        
        double num1 = 0, num2 = 1, num3, tot = 0;
    
        //the 0 case
        if ( x == 0 )
            tot = 0;
        
        //the 1 case
        if ( x == 1 )
            tot = 0;

        //all other cases
        for( int z = 1; z < x; z++){
            
            //Stores num2 in num3 for later use
            num3 = num2;
            
            //The actual calculation
            num1 += num2;

            tot = num1;
            
            //resets the numbers for next calculation
            num2 = num1; num1 = num3;
        }

        return tot;

    }
}
