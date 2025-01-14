package Midterm_Exam;

import java.util.Random;
import java.util.Scanner;

public class RollDice {
    static Random rand = new Random();
    static int randomNum;
    static Scanner scan = new Scanner(System.in);
    
    static int rollDice(String str){
        if(str.equals("cube")){
            return randomNum = rand.nextInt(1, 7);
        }else if(str.equals("octahedron")){
            return randomNum = rand.nextInt(1, 9);
        }else if(str.equals("pentagonal")){
            return randomNum = rand.nextInt(1, 11);
        }else if(str.equals("dodecahedron")){
            return randomNum = rand.nextInt(1, 13);
        }else if(str.equals("icosahedron")){
            return randomNum = rand.nextInt(1, 21);
        }else 
        return 0;
    }

    public static void main(String[] args) {
        System.out.print("Roll Dice:\n" +
                        "cube have 6 faces\n" + //
                        "octahedron have 8 faces\n" + //
                        "pentagonal have 10 faces\n" + //
                        "dodecahedron have 12 faces\n" + //
                        "icosahedron have 20 faces\n\n");
        System.out.print("What dice you what to roll?: ");
        String str = scan.nextLine();
        int roll = rollDice(str);
        System.out.print(roll);

    }
}
