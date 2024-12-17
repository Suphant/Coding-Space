import java.util.Scanner;

public class function_calculate_grade {
    static Scanner scan = new Scanner(System.in);

    public static int mainMenu(){
        System.out.println("==== Main Menu ====" +
        "\n1. Get Quiz Exam Score" +
        "\n2. Get Midterm Exam Score" +
        "\n3. Get Final Exam Score" +
        "\n4. Show Student" +
        "\n5. Exit Program");
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        return choice;
    }

    static int getExamScore(String s){
        System.out.printf("Enter %s score: ", s);
        int score = scan.nextInt();
        return score;
    }

    static int getGrade(int getGrade){
        return getGrade < 0 || getGrade > 100 ? null
        :getGrade > 80 ? "A"
        :getGrade > 71 ? "B"
        :getGrade > 61 ? "C"
        :getGrade >= 50 ? "D"
        :"F";

    }
    public static void main(String[] args) {
        while (true) {
            mainMenu(); 
            
            int choice = scan.nextInt();
            if(choice == 1){
                getExamScore("Quiz");
            }
        }
       

    }
}
