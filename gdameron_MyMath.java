import java.util.Scanner;

public class gdameron_MyMath{
    public static void main ( String args[]){
        Scanner input = new Scanner(System.in);
        double x, y;

        System.out.print("Please enter a first number: ");
        x = input.nextDouble();
        System.out.print("Please enter a second number: ");
        y = input.nextDouble();

        double a = max(x,y);
        System.out.println("Max value is " + a);

        a = min(x,y);
        System.out.println("Min value is " + a);

        a = floor(x);
        System.out.printf( "Floor of %.1f is %.1f\n", x, a);

        a = floor(y);
        System.out.printf( "Floor of %.1f is %.1f\n", y, a);

        a = pow(x, 5);
        System.out.printf("%.1f to the %d power is %.1f\n", x, 5, a);

        a = abs(x);
        System.out.printf( "Abs value ot %.1f is %.1f \n", x, a);

        a = abs (y);
        System.out.printf("Abs value of %.1f is %.1f\n", y, a);

    }
    public static double max(double x, double y){
        if ( x > y )
            return x;
        else 
            return y;
    }

    public static double min(double x, double y){
        if (x<y)
            return x;
        else 
            return y;
    }
    public static double floor(double z){
        if(z<0){
            z = (int) z;
            return(double) z-1;
            }
        if (z> 0){
            z = (int) z;
            return (double) z;
        }
        z = 0.00;
        return z;
    }

    public static double pow(double x, double y){
        double z = x;
        for(int a = 1; a < y; a++){
            z *= x;
        }
        return z;
    }
    public static double abs(double x){
        if ( x < 0){
            x *= -1;
            return x;}
        return x;
    }

}
