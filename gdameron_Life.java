// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 18
// Due Date     : December 10, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
//A java implementation of Conway's Game of Life

// PUT YOUR HEADER DOCUMENTATION HERE!

import java.util.Scanner;

import java.util.Random;

// Change NetID to your NetID
public class gdameron_Life
{

    // the size of the grid (GRIDSIZE x GRIDSIZE)
    final private static int GRIDSIZE = 18;

    /********************************************************************************/
    public static void main ( String args[] )
    {
        boolean[][] board = new boolean[GRIDSIZE][GRIDSIZE];
        char choice;
        int x = 1;
        Scanner sc = new Scanner ( System.in );

        do
        {
            System.out.print ( "Start with a (r)andom board, the (q)ueen bee shuttle or the (g)lider pattern? ");
            choice = sc.next().charAt(0);
        } while ( choice != 'r' && choice != 'q' && choice != 'g' );

        clearGrid (board);
        setup(board,choice);

        do
        {
            System.out.printf ("Viewing generation #%d:\n\n", x++);
            displayGrid(board);
            genNextGrid(board);
            System.out.print ("\n(q)uit or any other key + ENTER to continue: ");
            choice = sc.next().charAt(0);
        } while ( choice != 'q' );

    }

    /********************************************************************************/
    public static void setup (boolean[][] board, char which )
    {
        Random randomNumbers = new Random();

        clearGrid(board);

        if ( which == 'q' )
        {
            // Set up the Queen Bee Shuttle pattern
            board[5][1] = true;board[5][2] = true;board[6][3] = true;board[7][4] = true; 
            board[8][4] = true;board[9][4] = true;board[10][3] = true;board[11][2] = true;
            board[11][1] = true;        
        }
        else if ( which == 'g' )
        {
            // Set up a Glider
            board [17][0] = true; board[16][1] = true; board[15][1] = true;
            board[16][2] = true;
            board [17][2] = true;
        }
        else
        {
            // set up random
            for (int row = 0; row < board.length; row++ )
            {
                for (int col = 0; col < board[row].length; col++ )
                {
                    if ( randomNumbers.nextInt() % 2 == 0 )
                        board[row][col] = true;
                }
            }
        }

    }

    /********************************************************************************/
    public static void displayGrid (boolean[][] grid)
    {
        // Start printing the top row of numbers
        System.out.print ("   ");
        for (int x = 1; x <= grid.length; x++)
        {
            if ((x / 10) != 0)
                System.out.printf ( "%d", x / 10 );
            else
                System.out.print ( " " );
        }

        System.out.println();
        System.out.print( "   " );

        for (int x = 1; x <= grid.length; x++)
        {
            System.out.printf ( "%d", x % 10 );
        }
        System.out.println();

        for (int r = 0; r < grid.length; r++)
        {
            System.out.printf ( "%d", r+1 );
            if (r + 1 < 10)
                System.out.print ( "  " );
            else
                System.out.print ( " " );
            for (int c = 0; c < grid.length; c++)
            {
                if (grid[r][c] == true)
                    System.out.print ( "*" );
                else
                    System.out.print ( " " );
            }
            System.out.println();
        }
    }


    /*******************************************************************************/

    // put the three methods you must write here and make sure to document
    // them!

    public static void clearGrid ( boolean[][] grid )
    {
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid.length; y++){
                grid[x][y] = false;

            }

        }
    }

    public static void genNextGrid ( boolean[][] grid )
    {

        boolean gridTemp [] [] = new boolean [grid.length] [grid.length];

        for(int x = 0; x < grid.length ; x++){
            for(int y = 0; y < grid.length; y++){
                if( grid[x][y] == true ){
                    if(countNeighbors(grid,x,y) == 2 || countNeighbors(grid,x,y) == 3){
                        gridTemp[x][y] = true;
                    }
                }

                else if(grid[x][y] == false){
                    if(countNeighbors(grid,x,y) == 3 ){
                        gridTemp[x][y] = true;
                    }

                }

                else{
                    gridTemp[x][y] = false;
                }
            }
        }

        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid.length; y++){
                grid[x][y] = gridTemp[x][y];
            }
        }



    }

    public static int countNeighbors ( final boolean[][] grid, final int row, final int col )
    {

        int tally = 0;

        //adds for the rows 1 and 18 if not on corners
        if( (row == 0 || row == 17) && ( col > 0 && col <  17)){


            //adds adjacent cols
            if( grid [row][col -1] == true )
                tally ++;
            if( grid [row][col +1] == true )
                tally ++;

            //adds adjacent rows/cols+1 if square is on row 1
            if(row == 0){
                for(int x = 0; x < 3; x++){
                    if(grid [row+1][col-1+x]== true)
                        tally++;
                }
            }

            // adds adjacent rows/cols-1 if square is on row 18
            if(row == 17){
                for(int x = 0; x < 3; x++){
                    if(grid [row - 1][col - 1 + x]== true)
                        tally++;
                }
            }
        }

        if( (col == 0 || col == 17) && ( row > 0 && row <  17)){


            //adds adjacent cols
            if( grid [row - 1][col] == true )
                tally ++;
            if( grid [row + 1][col] == true )
                tally ++;

            //adds adjacent rows/cols+1 if square is on row 1
            if(col == 0){
                for(int x = 0; x < 3; x++){
                    if(grid [row - 1 + x][col +1]== true)
                        tally++;
                }
            }

            // adds adjacent rows/cols-1 if square is on row 18
            if(col == 17){
                for(int x = 0; x < 3; x++){
                    if(grid [row - 1 + x][col -1]== true)
                        tally++;
                }
            }
        }

        /********************Corners*************************************/

        if(row == 0 && col == 0 ){
            if(grid [row][col+1]== true){
                tally ++;}

            for(int x = 0; x < 2; x++){
                if(grid [row + 1][col + x]== true)
                    tally++;        
            }   
        }

        if(row == 0 && col == 17 ){
            if(grid [row][col-1]== true){
                tally ++;}

            for(int x = 0; x < 2; x++){
                if(grid [row + 1][col - x]== true)
                    tally++;        
            }   
        }

        if(row == 17 && col == 0 ){
            if(grid [row][col + 1]== true){
                tally ++;}

            for(int x = 0; x < 2; x++){
                if(grid [row - 1][col + x]== true)
                    tally++;        
            }   
        }

        if(row == 17 && col == 17 ){
            if(grid [row][col - 1]== true){
                tally ++;}

            for(int x = 0; x < 1; x++){
                if(grid [row - 1][col - x]== true)
                    tally++;        
            }   
        }

        /*********************End Corners**************/

        if(row > 0 && row < 17 && col > 0 && col < 17){
            if(grid [row] [col -1] == true){
                tally ++;
            }
            if(grid [row] [col+1]== true){
                tally++;
            }
            for(int x =0; x < 3; x++){
                if(grid [row - 1] [col-1+x ]  == true){
                    tally ++;
                }
            }

            for(int x = 0; x < 3; x++){
                if(grid[row + 1][col-1+x] == true){
                    tally++;
                }
            }
        }

        return tally;   
    }

}
