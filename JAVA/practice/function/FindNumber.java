package practice.function;

import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    static Random rand = new Random();
    static Scanner scan = new Scanner(System.in);

    static void randomNumber(int[][] ran){
        for(int i = 0; i < ran.length; i++){
            for(int j = 0; j < ran[0].length; j++){
                int RANDOM = rand.nextInt(51);
                ran[i][j] = RANDOM;
            }
        }
    }

    static void displayBox(int[][] display){
        for(int i = 0; i < display.length; i++){
            for(int j = 0; j < display[0].length; j++){
                System.out.printf("%2d  ", display[i][j]);
            }
            System.out.println();
        }
    }

    static int findNumber(int x, int[][] array){
        int count = 0;
        System.out.printf("Founded number %d in:", x);
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == x){
                    System.out.printf("\n -Row %d Column %d", i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] ranArray = new int[5][5];

        
        
        char choice = '_';
        do {
            randomNumber(ranArray);
            displayBox(ranArray);
            System.out.print("Enter interger you want to find: ");
            int find = scan.nextInt();
            int finded = findNumber(find, ranArray);
            System.out.printf("\nFounded: %d reps", finded);
            System.out.print("\nYou want to find more?(y/n): ");
            choice = scan.next().charAt(0);
        }while(choice != 'n');

        
        
    }
}
