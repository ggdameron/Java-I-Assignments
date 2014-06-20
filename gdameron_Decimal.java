// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 12
// Due Date     : November 5, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program accepts an octal number converts it to decimal

import java.util.Scanner;

public class gdameron_Decimal{


    public static void main( String arges[]){

        int foo, validation;

        Scanner input = new Scanner (System.in);


        do{

            validation = 1;

            System.out.print ("Enter up to an 8-digit octal number and I will convert it for you: ");

            foo = input.nextInt();

            }while( foo < 0 || foo > 99999999);

        System.out.printf ("%d:%d%n", foo, convert(foo));

    }
    //method "convert" will do the calculations to convert from octal to decimal
    public static int convert (int octalNumber){

        int holder = octalNumber;

        octalNumber = 0;
        int [] n = new int [8];
        int [] m = new int [8];
        m[0] = 1;

        for( int i = 0; i < 8; i++){
            n[i] = holder%10;
            holder /= 10;}

        for ( int a = 1; a < 8; a++){
            m[a] = 8 * m[a-1];
        }

        for (int j = 0; j < 8; j++){
            n[j] = n[j] * m[j];
        }

        for (int k = 0; k < 8; k++){
            octalNumber += n[k];
        }


        return octalNumber;


    }
}
