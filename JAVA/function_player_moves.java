import java.util.Scanner;

public class function_player_moves {
    static char[][] grid = new char[5][5];
    static int playerRow = 2, playerCol = 2;
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        
        char move = '_';
        while (move != 'q') {
            System.out.print("Moving using W (up), S (down), A (left), D (right). Press Q to quit.\n");
            displayBox(playerRow, playerCol);
            System.out.print("Player Move: ");
            move = scan.next().charAt(0);
            movePlayer(move);
        }
            
    }
    

    static void displayBox(int row, int column){
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                grid[i][j] = '_';
                grid[row][column] = 'p';
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
        
    }

    static void movePlayer(char move){
        if(move == 'w' && playerRow > 0){
            playerRow -= 1;
        }else if(move == 's' && playerRow < grid.length - 1){
            playerRow += 1;
        }else if(move == 'a' && playerCol > 0){
            playerCol -= 1;
        }else if(move == 'd' && playerCol < grid.length - 1){
            playerCol += 1;
        }
    }
    
}
