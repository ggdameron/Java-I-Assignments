import java.util.Scanner;

public class gdameron_DecimalC{

    public static void main (String args[]){

        Scanner input = new Scanner(System.in);

        int holder, power;

        holder = input.nextInt();

        int [] n = new int [8];
        int [] m = new int[8];
        m[0] = 1;

        for( int i = 0; i < 8; i++){
            n[i] = holder%10;
            holder /= 10;}

        for ( int a = 1; a < 8; a++)
            m[a] = 8 * m[a-1];

        for ( int j = 0; j < 8; j++){
            n[j] = n[j] * m[j];}

        for( int k = 0; k < 8; k++){
            holder += n[k];}

       
        System.out.printf( "%d, %d, %d, %d, %d, %d%n", n[0], n[1], n[2], m[0], m[1], m[2]);
        System.out.printf( "%d %n", holder);
    }
}

