// Name     : Gary Dameron
// Class    : Cist 1400 - 011
// Program #    : 4
// Due Date     : September 19, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program accepts a number then outputs a result telling the user wether it is odd/even or a multiple of 13.


import java.util.Scanner;

public class gdameron_Multiple

{
    public static void main ( String args[])

        {
            Scanner input = new Scanner (System.in);

            int number, even, off, multiple;

            System.out.printf( "Please enter a non-negative (<=0) integer (whole) number: %n");


            number = input.nextInt();

            multiple = (number%13);

            even = (number%2);
            
            if (number <0)
                System.out.printf( "ERROR! %n");

            else
            {
                System.out.printf( "%d:", number);

                if (number > 12)
                {
                    if (multiple > 0)
                        System.out.print("NOT:");
                    else 
                        System.out.print("MULTIPLE:");
                }
                else 
                    System.out.print("NOT:");


                if (even > 0) 
                    System.out.printf("ODD: %n");

                else 
                    System.out.printf("EVEN: %n");
                
            }
        }
}

