

// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 10 
// Due Date     : 10-29-13
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
// Program accepts a date in mm/dd/yyyy format and out puts a numerology report based on the date.

import java.util.Scanner;

public class gdameron_Numerology
{
   
    
    public static void main( String args[])
    {
    
        Scanner input = new Scanner(System.in);
        int sum, day, month, year, daytot, yeartot, monthtot, sumtot, dayv = 1, monthv =1, yearv = 1, chv = 1, leapv1, leapv2, leapv3;
        boolean leapyear = false;
        char ch1, ch2;

// Valitation of date
        do {
        System.out.println("Enter the birth date(mm/dd/yyyy): ");
        month = input.nextInt();

        ch1 = input.next().charAt(0);

        day = input.nextInt();

        ch2 = input.next().charAt(0);

        year = input.nextInt();

        leapv1 = year;leapv2 = year; leapv3 =year;
        leapv1 %= 4;
        leapv2 %= 100;
        leapv3 %= 400;

        if( leapv1 == 0 && leapv2 == 0 && leapv3 == 0){
            leapyear = true;}
            

    //Validate year
        if (year >1879 && year<2280){
            yearv = 2;}
        
    //end Validate year
    //Validate month

        if (month > 0 && month < 13){
            monthv = 2;}
    //end Validate month
    //Validation of day
    switch (month){


        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            {if (day > 0 && day < 32){
                    dayv = 2;
            }
            }
        case 4: case 6: case 9: case 11:
            { if (day > 0 && day < 31){
                    dayv = 2;
            }
            }
        case 2:
            {
                if( leapyear == true){
                    if( day > 0 && day < 30){
                        dayv = 2;}
                }
                if (leapyear == false){
                    if( day > 0 && day < 29){
                        dayv = 2;}
                        
                }
            }
    }

    if(ch1 != '/' || ch2 != '/'){
        System.out.print("Use forward slashes between mm/dd/yyyy!\n");
        chv = 1;
    }
        else{
            chv = 2;

    if (dayv == 1){
        System.out.printf("Bad day for %d/%d: %d \n", month, year, day);}

    if (monthv == 1)
        System.out.printf("Bad month: %d\n", month);

    if (yearv == 1 )
        System.out.printf("Bad year: %d\n", year);
    }} while( dayv == 1 || monthv == 1 || yearv == 1 || chv ==1 );
    //end Validation of day

// end Validation of date

//add each integer in year,month,day and store them in totals

            yeartot = (year/1000);
            year %= 1000;
            yeartot += (year/100);
            year %= 100;
            yeartot += (year/10);
            year %= 10;
            yeartot += year;

            monthtot = (month/10);
            monthtot += (month%10);


      
            daytot= (day/10);
            daytot += (day%10);
//end
//adds totals and stores them into sumtot
            sum = (yeartot+daytot+monthtot);
            
            sumtot = (sum/10);
            sumtot +=(sum%10);

           // System.out.printf(" %d \n", sumtot);
//end

        

        System.out.printf("Welcome to the numerology report for %d/%d/%d :%n", month, day, year);
    
    switch(sumtot){
        case 1:
        System.out.println("=1= Do not dwell in the past, do not dream of the future, concentrate the mind on the present\n ");break;

        case 2:
        System.out.println("=2= Health is the greatest gift, contentment the greatest wealth, faithfulness the best relationship\n ");break;

        case 3:
        System.out.println("=3= An insincere and evil friend is more to be feared than a wild beast\n");break;

        case 4:
        System.out.println("=4= The way is not in the sky. The way is in the heart \n ");break;

        case 5:
        System.out.println("=5= Holdling on to anger is like grasping a hot coal with the intent of throwing it at someone else; you are the one wh gets burned\n ");break;

        case 6:
        System.out.println("=6= Three things cannot be long hidden: the sun, the moon, and the truth \n");break;

        case 7:
        System.out.println("=7= The tongue like a sharp knife... Kills without drawing blood.\n ");break;

        case 8:
        System.out.println("=8= The mind is everything. What you think you become. \n ");break;
        
        case 9:
        System.out.println("=9= Better than a thousand hollow words, is one word that brings peace \n ");break;
  


}   
}}
