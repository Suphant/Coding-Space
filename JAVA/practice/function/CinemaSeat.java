package practice.function;

import java.util.Random;
import java.util.Scanner;

public class CinemaSeat {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    static void makeSeat(char[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = rand.nextBoolean() ? 'O':'X';
            }
        }
    }

    static void displayGrid(char[][] grid){
        char row = 'A';
        for(int i = 0; i < grid.length; i++){
            System.out.print(row+ " ");
            for(int j = 0; j < grid[0].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
            row++;
        }
    }

    static int showMenu(){
        int choice = 0;
        System.out.print("\nMenu:"+ 
                            "\n1. Buy Ticket"+
                            "\n2. Cancel Ticket" +
                            "\n3. Empty Seats" +
                            "\n4. Income" +
                            "\nSelect menu: ");
            return choice = scan.nextInt();
    }

    static void buyTicket(char[][] grid){
        System.out.print("What Row?(A-E): ");
                    char row = scan.next().charAt(0);
                    int rowInt = -1;
                    if(row == 'A'){
                        rowInt = 0;
                    }else if(row == 'B'){
                        rowInt = 1;
                    }else if(row =='C'){
                        rowInt = 2;
                    }else if(row == 'D'){
                        rowInt = 3;
                    }else if(row == 'E'){
                        rowInt = 4;
                    }
                    System.out.print("What Column?(1-8): ");
                    int column = scan.nextInt();
                    if(grid[rowInt][column - 1] == 'X'){
                        System.out.print("Can't buy ticket because have seat\n");
                    }else {
                        System.out.print("\nBought ticket success!\n");
                        grid[rowInt][column - 1] = 'X';
                    }
                
        
    }
    public static void main(String[] args) {
        char[][] grid = new char[5][8];
        
        int choice = -1;
        makeSeat(grid);
        while (choice != 5) {
            System.out.print("  ");
            for(int i = 1; i <= 8; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            displayGrid(grid);
            choice = showMenu();
            if(choice == 1){
                buyTicket(grid);
                    
            }
            

        }

    }
}
