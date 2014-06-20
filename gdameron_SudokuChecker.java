// Name     : Gary Dameron
// Class    : CIST 1400 - 011
// Program #    : 19 
// Due Date     : December 12, 2013
//
// Honor Pledge:  On my honor as a student of the University
// of Nebraska at Omaha, I have neither given nor received
// unauthorized help on this homework assignment.
//
// NAME: Gary G Dameron II
// NUID: 922
// EMAIL: garydameron@gmail.com
//
//A program that checks a 4x4 sudoku puzzle for consistancy.

import java.util.Scanner;



public class gdameron_SudokuChecker {



    private int grid [] [] = new int [4] [4];

    // put private data members here
    // put constructor here

    public gdameron_SudokuChecker(){
        System.out.print("Welcome to the Sudoku Checker v1.0!\n\n");

        System.out.print("This program checks simple, small, 4x4\nSudoku grids for correctness. Each column,\n");

        System.out.print("row and 2x2 region contains the numbers 1\nthrough 4 only once.");

        System.out.print("To check your Sudoku, enter your borad one\nrow at a time, with each digit separated by\n");

        System.out.print("a space. Hit ENTER at the end of a row.\n\n");

    }
    // put getGrid() here

    public void getGrid(){

        Scanner input = new Scanner(System.in);

        for(int x = 0; x < 4; x++){

            System.out.printf("Enter row %d:", x+1);

            for(int y = 0; y < 4; y++){

                grid[x][y] = input.nextInt();       
            }
        }
        System.out.print("\n");

    }

    public void displayGrid(){

        System.out.println("Here's the grid as I see it now:");

        int count = 0;

        for(int x = 0; x < 4; x++){
            
            
                System.out.print("\n");
                
            
            for(int y = 0; y < 4; y++){
                System.out.printf("%d ", grid[x][y]);

            }
        }

        System.out.print("\n\n");
    }

    public void checkGrid(){

        boolean sudo = true;
        int tally = 0;

        //check regions

        System.out.print("Thank you. Now checking...\n\n");

        if(grid[0][0]+grid[0][1]+grid[1][0]+grid[1][1] == 10){
            System.out.print("REG-1:GOOD\n");
        }
        else{
            sudo = false;
            System.out.print("REG-1:BAD\n");
        }

        if(grid[0][2]+grid[0][3]+grid[1][2]+grid[1][3] == 10){
            System.out.print("REG-3:GOOD\n");
        }
        else{
            sudo = false;
            System.out.print("REG-3:BAD\n");
        }
        if(grid[2][0]+grid[2][1]+grid[3][0]+grid[3][1] == 10){
            System.out.print("REG-2:GOOD\n");
        }
        else{
            sudo = false;
            System.out.print("REG-2:BAD\n");
        }
        if(grid[2][2]+grid[2][3]+grid[3][2]+grid[3][3] == 10){
            System.out.print("REG-4:GOOD\n");
        }
        else{
            sudo = false;
            System.out.print("REG-4:BAD\n");
        }

        System.out.print("\n");

        //check rows
        for(int y = 0; y < grid.length; y++){

            for(int x = 0; x < grid.length; x++){
                tally += grid[y][x];
            }

            System.out.printf("ROWS-%d:", y+1);

            if( tally == 10){
                System.out.print("GOOD\n");
            }
            else{
                sudo = false;  
            System.out.print("BAD\n");
        }

        tally = 0;
        }


        System.out.print("\n");

        tally =0;

        //check cols
        for(int y = 0; y < grid.length; y++){

            for(int x = 0; x < grid.length; x++){
                tally += grid[x][y];
            }

            System.out.printf("COL-%d:", y);

            if( tally == 10){
                System.out.print("GOOD\n");
            }
            else{
                sudo = false;
            System.out.print("BAD\n");
            }
            tally = 0;
            }

        System.out.print("\n");

        if(sudo == true){
            System.out.print("SUDO:VALID\n");
        }
        else
            System.out.print("SUDO:INVALID\n");






    }
}
