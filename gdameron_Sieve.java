// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 16 
// Due Date     : December 3, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program calculates and displays all the sexy prime numbers in a specific boundary.


import java.util.Scanner;

public class gdameron_Sieve{

    public static void main (String args[])
    {
    final int HOWMANY = 5000;
    boolean[] sieve = new boolean[HOWMANY+1];
    int lower = 1, upper = HOWMANY;


    processSieve(sieve);

    showPrimes( sieve, lower, upper);

    lower = getLower(HOWMANY);

    upper = getUpper( lower, HOWMANY);

    showPrimes( sieve, lower, upper );

    }


    public static void processSieve(boolean[] sieve){


        for(int x= 0; x < sieve.length; x++){
            sieve[x] = true;
        }

        sieve [0] = false;
        sieve [1] = false;

        for( int x = 2; x < sieve.length; x++){

            for(int y = 2; y < sieve.length; y++){

                if((x*y) >= sieve.length){
                    break;}
                else
                    sieve[x*y] = false;
            }
        }
    }

    public static void showPrimes(boolean[] sieve, int lower, int upper){


        int z = 0, y = 0;

        System.out.printf("Here are all of the sexy prime numbers in the range %d to %d, one pair per line: \n", lower, upper);

        for(int x = lower ; x < upper; x++){

            if ( x+ 6 >= upper)
                break;

            if(sieve[x] && sieve[x+6] == true){

                System.out.printf("%d and %d \n", x, x+6);

                z++;
        }
        }


        System.out.printf("There were %d sexy prime pairs displayed.\n", z);
        System.out.print("\n");

        y++;
    }

    public static int getLower(int lower){

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Please enter the lower boundary(between 1 and 5000): ");

            lower = input.nextInt();

        }while(lower < 1 || lower > 5000);

        System.out.print("\n");
        return lower;
    }

    public static int getUpper(int lower, int upper){

        Scanner input  = new Scanner(System.in);

        do{
            System.out.printf("Please enter the upper boundary(between %d and 5000): ", lower);

            upper = input.nextInt();

        }while(upper < lower || upper > 5000);

        System.out.print("\n");
        
        return upper;

    }


}

