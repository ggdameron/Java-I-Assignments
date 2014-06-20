// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    :0 
// Due Date     :1/28/14 


import java.util.Scanner;

public class gdameron_SimpleList {

    final int ARRAY_LENGTH = 10;

    float [] list = new float [ARRAY_LENGTH];

    float sum, large, small, average;

    int count;

    public gdameron_SimpleList(){

        System.out.println("Welcome to the Simple List Class");

        for(int x = 0; x < list.length; x++){
            list[x] = 0;
        }

        float sum = 0;

    }

    public void getData(){

        char x;

        Scanner input = new Scanner(System.in);


        do{
            System.out.print("Enter a floating point value: ");

            list[count] = input.nextFloat();
            count++;

            do{
                System.out.print("Would you like to input another value(Y or N)? ");

                x = input.next().charAt(0);

            }while(x != 'y' && x != 'n' && x != 'Y' && x !='N');



        }while(x == 'y' || x == 'Y');



    }

    public void processData(){

        small = list[0];

        large = list[0];

        //Sum, small, large
        for(int x = 0; x < count; x++){

            if(list[x] < small){
                small = list[x];
            }

            if(list[x] > large ){
                large = list[x];
            }

            sum += list[x];

        }

        //average
        average = sum/count;

    }

    public void displayResults(){

        System.out.printf("Sum of all values = %f%n", sum);

        System.out.printf("Average of all values = %f%n", average);

        System.out.printf("Largest value = %f%n", large);

        System.out.printf("Smallest value = %f%n", small);

    }

}

