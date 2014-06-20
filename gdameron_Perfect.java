// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 14 
// Due Date     : Nov 19, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// program tests whether a number is a perfect number or not
import java.util.Scanner;

public class gdameron_Perfect{

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        boolean i = false;
        int perfect, y;

        do{
            System.out.print("How many numbers would you like to test? ");
            y = input.nextInt();
            System.out.print("\n");
        }while(y <= 0);

        do{
            System.out.print("Please enter a possible perfect number: ");

            perfect = input.nextInt();

            i = testPerfect(perfect);

            System.out.printf("%d:", perfect);

            if( i == true){
                printFactors(perfect);

                System.out.println("\n");
            }

            if( i == false){
                System.out.print("NOT PERFECT \n\n");
            }

            y--;

        }while(y > 0);

    }

    public static boolean testPerfect( int testPerfect){
        boolean i = false;
        int sum = 0;
        
        for(int x = 1; x < testPerfect; x ++ ){

            if((testPerfect % x) == 0){
                sum += x;
            }
        }
        if(sum == testPerfect){
            i = true;
            return i;
        }
        return i;
    }

    public static void printFactors( int perfect){

        for( int x = (perfect - 1); x > 0; x--){

            if( (perfect %x) == 0){
                System.out.printf("%d ", x);
            }
        }
    }
}


