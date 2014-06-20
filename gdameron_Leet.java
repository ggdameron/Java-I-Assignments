

// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 6 
// Due Date     : 10-3-13
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Converts an input character to 1337Speek

import java.util.Scanner;

public class gdameron_Leet
{
    public static void main (String args[])
    {
        Scanner input = new Scanner (System.in);

        char ch;

        System.out.print( "Enter a charater for conversion: ");
        
        ch = input.next().charAt(0);

        switch (ch){
            case 'a': case 'A':
                System.out.printf( "%c @ %n", ch ); break;

            case 'b': case 'B':
                System.out.printf( "%c I3 %n", ch ); break;

            case 'c': case 'C':
                System.out.printf( "%c < %n", ch ); break;

            case 'd': case 'D':
                System.out.printf( "%c [) %n", ch ); break;

            case 'e': case 'E':
                System.out.printf( "%c & %n", ch ); break;

            case 'f': case 'F':
                System.out.printf( "%c ]= %n", ch ); break;

            case 'g': case 'G':
                System.out.printf( "%c 6 %n", ch ); break;

            case 'h': case 'H':
                System.out.printf( "%c ]-[ %n", ch ); break;

            case 'i': case 'I':
               System.out.printf( "%c 1 %n", ch ); break;

            case 'j': case 'J':
              System.out.printf( "%c _/ %n", ch ); break;

            case 'k': case 'K':
              System.out.printf( "%c X %n", ch ); break;

            case 'l': case 'L':
              System.out.printf( "%c 7 %n", ch ); break;

            case 'm': case 'M':
              System.out.printf( "%c /\\/\\ %n", ch ); break;

            case 'n': case 'N':
              System.out.printf( "%c |\\| %n", ch ); break;

            case 'o': case 'O':
              System.out.printf( "%c () %n", ch ); break;

            case 'p': case 'P':
              System.out.printf( "%c |* %n", ch ); break;

            case 'q': case 'Q':
              System.out.printf( "%c 0, %n", ch ); break;

            case 'r': case 'R':
              System.out.printf( "%c I2 %n", ch ); break;

            case 's': case 'S':
              System.out.printf( "%c $ %n", ch ); break;

            case 't': case 'T':
              System.out.printf( "%c + %n", ch ); break;

            case 'u': case 'U':
              System.out.printf( "%c (_) %n", ch ); break;

            case 'v': case 'V':
              System.out.printf( "%c \\/ %n", ch ); break;

            case 'w': case 'W':
              System.out.printf( "%c vv %n", ch ); break;

            case 'x': case 'X':
              System.out.printf("%c >< %n", ch ); break;

            case 'y': case 'Y':
              System.out.printf("%c j %n", ch ); break;

            case 'z': case 'Z':
              System.out.printf("%c 2 %n", ch ); break;

        }
    }
}


            

