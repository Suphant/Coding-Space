package practice.function;

import java.util.Random;
import java.util.Scanner;

public class SlidingPuzzle {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);
    static int playerRow = 0, playerColumn = 0;

    static void displayGrid(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    System.out.print("_" + "  ");
                    playerRow = i;
                    playerColumn = j;
                }else {
                    System.out.print(grid[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    static void randGrid(int[][] grid){
        boolean [] used = new boolean[9];
        int num;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                do{
                    num = rand.nextInt(9);
                }while(used[num]);

                grid[i][j] = num;
                used[num] = true;
            }
        }


    }

    static void moveSpace(char choice, int[][] grid){
        int num = -1;
        if(choice == 'w' && playerRow > 0){
            num = grid[playerRow - 1][playerColumn];
            grid[playerRow - 1][playerColumn] = grid[playerRow][playerColumn];
            grid[playerRow][playerColumn] = num;
            
        }else if(choice == 's' && playerRow < grid.length - 1){
            num = grid[playerRow + 1][playerColumn];
            grid[playerRow + 1][playerColumn] = grid[playerRow][playerColumn];
            grid[playerRow][playerColumn] = num;
            
        }else if(choice == 'a' && playerColumn > 0){
            num = grid[playerRow][playerColumn - 1];
            grid[playerRow][playerColumn - 1] = grid[playerRow][playerColumn];
            grid[playerRow][playerColumn] = num;
            
        }else if(choice == 'd' && playerColumn < grid[0].length -1){
            num = grid[playerRow][playerColumn + 1];
            grid[playerRow][playerColumn + 1] = grid[playerRow][playerColumn];
            grid[playerRow][playerColumn] = num;
            
        }
    }
    public static void main(String[] args) {
        int[][] grid = new int[3][3];

        randGrid(grid);
        
        char choice = '_';
        while(choice != 'q'){
            displayGrid(grid);
            System.out.print("W(Up), S(Down), A(Left), D(Right), Q(Quit): ");
            choice = scan.next().charAt(0);
            moveSpace(choice, grid);
        }

    }
}