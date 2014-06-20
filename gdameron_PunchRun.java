//Name: Gary Dameron 
//Class: 1400-001 
//Program #:1 
//Due Date: September 11th, 2013
//
//Honor Pledge:     On my honor as a student of the Univeristy
//                  of Nebraska at Omaha, I have neither given nor received
//                  unauthorized help on this homework assignment.
//
//NAME: Gary G Dameron II
//EMAIL: Garydameron@gmail.com
//NUID: 922


//Progam asks for 2 integers and compaires them

import java.util.Scanner;

public class gdameron_PunchRun

{
        public static void main (String args[] )
        {

            Scanner input = new Scanner ( System.in);
            int number1, number2;

            System.out.print ( "Enter first integer: " );
            number1 = input.nextInt();

            System.out.print ( "Enter secon integer: ");
            number2 = input.nextInt();

            if (number1 == number2)
                System.out.printf( "%d == %d\n", number1, number2);

            if (number1 != number2)
                System.out.printf( "%d != %d\n", number1, number2);

            if (number1 < number2)
                System.out.printf( "%d < %d\n", number1, number2);

            if (number1 > number2)
                System.out.printf( "%d > %d\n", number1, number2);

            if (number1 <= number2)
                System.out.printf( "%d <= %d\n", number1, number2);

            if (number1 >= number2)
                System.out.printf( "%d >= %d\n", number1, number2);

        }
}


