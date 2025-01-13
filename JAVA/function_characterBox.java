import java.util.Random;
import java.util.Scanner;

public class function_characterBox {
    static void initializedBox(char[][] box, char[][] displayBox){
        Random ran = new Random();

        for(int i = 0; i < box.length; i++){
            for(int j = 0; j < box[0].length; j++){
                box[i][j] = (char)(ran.nextInt(26) + 'a');
            }
        }

        for(int k = 0; k < box.length; k++){
            for(int l = 0; l < box[0].length; l++){
                displayBox[k][l] = '_';
            }
        }
    }

    static void displayGrid(char[][] grid){
        for(int k = 0; k < grid.length; k++){
            for(int l = 0; l < grid[0].length; l++){
                System.out.print(grid[k][l] + "   ");
            }
            System.out.println();
        }
    }

    static int revealCharacter(char[][] box, char[][] displayBox, char guess){
        int correctPosition = 0;
        boolean found = false;
        for(int j = 0; j < box.length; j++){
            for(int k = 0; k < box[0].length; k++){
                if(box[j][k] == guess){
                    displayBox[j][k] = guess;
                    found = true;
                    correctPosition++;
                }
            }
        }
        if(found){
            System.out.printf("Correct! found %d position(s)\n", correctPosition);
        }
        if(!found){
            System.out.printf("Sorry the character %s not in the box.\n", guess);
        }
        return correctPosition;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[][] box = new char[5][5];
        char[][] displayBox = new char[5][5];

        initializedBox(box, displayBox);

        int totalCorrectGuesses = 0;
        
        System.out.print("Welcome to character guessing game!" +
                        "\nThe grid is hidden. Guess characters from a - z" +
                        "\nYou have a 5 guesses, Let's begins!\n");
        for(int i = 1; i < 6; i++){
            System.out.printf("Attempt %d: \n", i);
            displayGrid(displayBox);
            System.out.print("Enter your guess: ");
            char guess = scan.next().charAt(0);
            totalCorrectGuesses += revealCharacter(box, displayBox, guess);
            
        }

        System.out.print("Game Over!\n");
        displayGrid(displayBox);
        System.out.printf("Total positions guessed correctly: %d", totalCorrectGuesses);

    }
}
