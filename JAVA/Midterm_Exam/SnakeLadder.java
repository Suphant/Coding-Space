package Midterm_Exam;

import java.util.Random;
import java.util.Scanner;



import java.util.Random;
import java.util.Scanner;

public class SnakeLadder {
    static Random rand = new Random();
    static int randomNum;
    static Scanner scan = new Scanner(System.in);

    static void initializeGame(int[] map){
        for(int i = 0; i < map.length; i++){
            map[i] = i + 1;
        }
    }

    static int[] drawMap(int[] map, int playerPosition, int computerPosition){
        for(int i = 0; i < map.length; i++){
            if(map[playerPosition] == map[computerPosition] && map[playerPosition] == map[i] && map[computerPosition] == map[i]){
                System.out.printf("%6s", "P,C");
                i++;
            }else if(map[playerPosition] == map[i]){
                System.out.printf("%6s", "P");
                i++;
            }
            
            if(map[computerPosition] == map[i]){
                System.out.printf("%6s", "C");
                i++;
            }

            

            System.out.printf("%5d ", map[i]);
            if(i == 9 || i == 19){
                System.out.println();
            }
            

        }
        return map;
    }

    static int rollDice(){
        return randomNum = rand.nextInt(1, 7);
    }

    static int movePosition(int roll, int playerPosition, int computerPosition, int[] map, String turn){
        int position = 0;
        if(turn.equals("Player")){
            for(int i = 0; i < map.length; i++){
                if(map[i] == map[playerPosition]){
                    position = map[i];
                }
            }
        }
        
        if(turn.equals("Computer")){
            for(int i = 0; i < map.length; i++){
                if(map[i] == map[computerPosition]){
                    position = map[i];
                }
            }
        }
        
        return position;
    }
    public static void main(String[] args) {
        int[] map = new int[30];
        int playerPosition = 0;
        int computerPosition = 0;

        initializeGame(map);

        while (true) {
            drawMap(map, playerPosition, computerPosition);
            System.out.print("\n\n==>Player turn");
            System.out.print("\nPress any key to roll dice!");
            scan.nextLine();
            int dice = rollDice();
            System.out.printf("Dice: %d", dice);
            playerPosition += dice;
            String playerTrun = "Player";
            int position = movePosition(dice, playerPosition, computerPosition, map, playerTrun);
            System.out.printf("\nPlayer Postition: %d\n\n", position);

            drawMap(map, playerPosition, computerPosition);
            System.out.print("\n\n==>Computer turn");
            System.out.print("\nPress any key to roll dice!");
            scan.nextLine();
            dice = rollDice();
            System.out.printf("Dice: %d", dice);
            computerPosition += dice;
            String computerTurn = "Computer";
            position = movePosition(dice, playerPosition, computerPosition, map, computerTurn);
            System.out.printf("\nComputer Postition: %d\n\n", position);
        }
        

        
    }
}

