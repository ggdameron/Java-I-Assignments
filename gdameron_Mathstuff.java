// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 11
// Due Date     : Nov 5, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
//Uses Math class to do various calculations.

import java.util.Scanner;
import java.lang.Math;

public class gdameron_Mathstuff{

    public static void main (String args[]){
        
        double square, cube, pi, circle, acube, numx, numy, max, min;

        Scanner input = new Scanner(System.in);
        

        //Area of square
        System.out.printf("Please enter the length of a side of your square: ");

        square = input.nextDouble();

        square = Math.pow(square, 2.000);

        System.out.printf("Area of your square is : %.3f%n%n", square);


        //Area of cube
        System.out.printf("Please enter the length of a side of your cube: ");

        cube = input.nextDouble();

        cube = Math.pow(cube, 3.000);

        System.out.printf("Volume of your cube is : %.3f%n%n", cube);

        //Area of circle
        System.out.printf("Please enter the radius of your circle: ");

        circle = input.nextDouble();

        pi = Math.PI;

        circle = Math.pow(circle, 2);

        circle *= pi;

        System.out.printf("Area of your circle is : %.3f%n%n", circle);

        //Surface area of cube
        System.out.print("Please enter the length of a side of your cube: ");

        acube = input.nextDouble();

        acube = (6 * Math.pow(acube, 2.000));

        System.out.printf("Surface area of your cube is : %.3f%n%n", acube);

        //larger value
        System.out.printf("Please enter two numbers separated by spaces: ");

        numx = input.nextDouble();

        numy = input.nextDouble();

        max = Math.max(numx, numy);

        System.out.printf("Larger of first two numbers is : %.3f%n%n", max);

        //Smaller value
        System.out.print("Please enter two numbers separated by spaces: ");

        numx = input.nextDouble();

        numy = input.nextDouble();

        min = Math.min(numx, numy);

        System.out.printf("Smaller of second two numbers is : %.3f%n%n", min);

    }
}

