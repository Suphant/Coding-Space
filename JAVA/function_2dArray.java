import java.util.Scanner;

public class function_2dArray {
    static Scanner scan = new Scanner(System.in);
    static int mainMenu(){
        System.out.println("\nMenu:" + 
            "\n1. Assign value to array" +
            "\n2. Display array by row" +
            "\n3. Display array by column" +
            "\n4. Display whole array" +
            "\n5. Exit"
        );
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        return choice;
    }
    public static void main(String[] args) {
        int[][] boxes = new int [5][5];
        int choice = -1;
        boxes[0][0] = 0;
        while (choice != 5) {
            choice = mainMenu();

            if(choice == 1){
                System.out.print("Enter row index(0-4): ");
                int row = scan.nextInt();
                System.out.print("Enter column index(0-4): ");
                int column = scan.nextInt();
                System.out.print("Enter value: ");
                int value = scan.nextInt();
                boxes[row][column] = value;
            }else if(choice == 4){
                for(int i = 0; i < boxes.length; i++){
                    for(int j = 0; j < boxes.length; j++){
                    System.out.print(boxes[i][j] + "     ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
