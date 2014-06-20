import java.util.Scanner;

public class gdameron_DecimalV{

    public static void main(String args[]){

        int foo, validation;

        Scanner input = new Scanner (System.in);

        do{
            validation = 1;

            System.out.print("input number \n");

            foo = input.nextInt();

            validation = foo/100000000;

        }while(validation != 0);

        System.out.printf("%d %n", validation);
    }
}

