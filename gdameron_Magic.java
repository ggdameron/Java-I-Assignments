// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 17
// Due Date     : December 5, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program prompts users for inputs and, using a two dimensional array, computes weather the numbers used could make a mgic square.

import java.util.Scanner;

public class gdameron_Magic{
    public static void main ( String args[]){

        Scanner input = new Scanner(System.in);

        boolean check = true;

        int magic [] [] = new int [4] [4];

        for(int x = 0; x < magic.length; x++){
            System.out.printf("Please enter the 4 values for row %d, separated by spaces: ", x);

            for( int y = 0; y < magic.length; y++){
                magic[x][y] = input.nextInt();
            }
        }

        System.out.print("DIAG: ");

        if(checkDiagonals(magic) == true){
            System.out.print("VALID \n");
        }
        else{
            check = false;
            System.out.print("\n");
        }

        System.out.print("ROWS: ");

        if(checkRows(magic) == true){
            System.out.print("VALID \n");
        }
        else{
            check = false; 
            System.out.print("\n");
        }

        System.out.print("RANG: ");
        if(checkRange(magic) == true){
            System.out.print("VALID \n");
        }
        else{
            check = false;
            System.out.print("\n");
        }

        if(check == true){
            System.out.println("MAGIC: YES");
        }
        else 
            System.out.println("MAGIC: NO");
    }

    public static boolean checkRows (int magic [] []){
        boolean check = true;
        int a = magic.length;
        int z = 0;
        int number = (a *((a*a)+1)/2);

        for(int x = 0; x < magic.length; x++){
            z = 0;
            for( int y = 0; y < magic.length; y++){
                z+= magic[x][y];
            }
            if(z != number){
                System.out.printf("%d ", x);
                check = false;
            }
        }
        return check;
    }

    public static boolean checkColumns (int magic [] []){

        boolean check = true;
        int a = magic.length;
        int z = 0;
        int number = (a *((a*a)+1)/2);

        for( int x = 0; x < magic.length; x++){
            z = 0;
            for(int y = 0; y < magic.length; y++){
                z+= magic[y][x];
            }
            if( z!= number){
                System.out.printf("%d ", x);
                check = false;
            }
        }
        return check;
    }

    public static boolean checkDiagonals( int magic [] []){

        boolean check = true;
        int a = magic.length;
        int z = 0, y = 0;
        int number = (a * (( a * a ) + 1)/2);

        for(int x = 0; x <  magic.length; x++){
            z+= magic[y][x];
            y++;
        }
        if(z!= number){
            System.out.printf("%d ", 0);
            check = false;
        }

        z = 0;
        for(int x = 0; x < magic.length; x ++){
            --y;
            z += magic[y][x];
        }

        if (z != number){
            System.out.printf("%d ", 1);
            check = false;
        }

        return check;
    }

    public static boolean checkRange(int magic [] [] ){

        boolean check = true;
        int z = 0;
        int high = 0;
        int a = magic.length, b = (magic.length * magic.length);
        int number = ( a * ((a * a) + 1)/2 );

        for(int x = 0; x < magic.length; x++){
            for(int y = 0; y < magic.length; y++){
                if( high < magic [x][y])
                    high = magic[x][y];
            }
        }

        int magiclin [] = new int [number];
        int num [] = new int [high +1];

        for(int x = 0; x < magic.length; x++){
            for(int y = 0; y < magic.length; y ++){
                magiclin[z] = magic[x][y];
                z++;
            }
        }

        for(int x = 0; x < magiclin.length; x++){
            if(magiclin[x] >= 0)
                num[magiclin[x]]++;
        }

        for(int x = 1; x <num.length; x++){
            if(num[x] > 1 && x<b){
                for(int y = 1; y < num[x]; y++){
                    System.out.printf("%d ", x);
                }
                check = false;
            }
        }

        for(int x = 0; x < number; x ++)
            if(magiclin[x] > b || magiclin[x] < 0 ){
                System.out.printf("%d ", magiclin[x]);
                check = false;
            }
        return check;
    }
}

