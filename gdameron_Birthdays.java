// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 
// Due Date     : 
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
//
//Generates 18975 random numbers between 1 and 365 and computes how many instances
//of each number occurs.

import java.util.Random;

public class gdameron_Birthdays
{

    public static void main(String args[]){

        int largest = 0, smallest = 18975, poss = 0, posl = 0;
        int a[] = new int[18975];
        int b[] = new int [365];
        int c[] = new int [365];
        int d[] = new int [365];

        Random rand = new Random();

        for(int x = 0; x < a.length; x++){
            a[x] = rand.nextInt(365);
        }

        for(int x = 0; x < a.length; x++){
            d[a[x]] ++;
        }

        for(int x = 0; x < d.length; x++){
            if(d[x] > largest)
                largest = d[x];
        }

        for(int x = 0; x < d.length; x++){
            if(d[x] == largest){
                b[posl] = x;
                posl++;
            }
        }

        for(int x = 0; x < d.length; x++){
            if(d[x] < smallest)
                smallest = d[x];
        }

        for(int x = 0; x < d.length; x++){
            if(d[x] == smallest){
                c[poss] = x;
                poss++;
            }
        }

        for(int x = 0; x < 356; x++){
            System.out.printf("Day %d : %d people \n", x+1, d[x]);
        }

        System.out.printf("\n The following days have %d people: \n", largest);

        for(int x = 0; x < posl; x++)
            System.out.printf("%d ", b[x]+1);

        System.out.printf("\n\nThe following days have %d people:\n", smallest);

        for(int x = 0; x < poss; x++)
            System.out.printf("%d ", c[x]+1);

        System.out.printf("\n\n");
    }
}
