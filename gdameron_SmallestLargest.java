// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    :5
// Due Date     :10-1-13
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program accepts six number runs operations and prints
// out the largest and smallest.


import java.util.Scanner;

public class gdameron_SmallestLargest


{
    public static void main (String arge[])
    {
    int value, smallest; 
    int largest = 0;
    Scanner get = new Scanner ( System.in );
    System.out.print( "Please enter first integer: " );
    smallest = get.nextInt();

    System.out.print( "Please enter second integer: ");
    value = get.nextInt();

    if (value < smallest)
        smallest = value;
    else
        largest = value;

    System.out.print( "Please enter third integer: ");
    value = get.nextInt();

    if (value < smallest)
        smallest = value;

    if (value > largest)
        largest = value;

    System.out.print( "Please enter fourth integer: ");
    value = get.nextInt();

    if (value < smallest)
        smallest = value;

    if (value > largest)
        largest = value;

    System.out.print( "Please enter fifth integer: ");
    value = get.nextInt();

    if (value < smallest)
        smallest = value;

    if (value > largest)
        largest = value;

    System.out.print( "Please enter sixth integer: ");
    value = get.nextInt();
    if (value < smallest)
       smallest = value;

    if (value > largest)
       largest = value;


    System.out.printf( "%d:%d%n", smallest, largest);

}

}

