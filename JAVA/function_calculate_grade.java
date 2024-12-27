import java.util.Scanner;

public class function_calculate_grade {
    static Scanner scan = new Scanner(System.in);

    public static int mainMenu(){
        System.out.println("==== Main Menu ====" +
        "\n1. Get Quiz Exam Score" +
        "\n2. Get Midterm Exam Score" +
        "\n3. Get Final Exam Score" +
        "\n4. Show Student grade" +
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

    static String getGrade(int getGrade){
        return getGrade < 0 || getGrade > 100 ? null
        :getGrade > 80 ? "A"
        :getGrade > 71 ? "B"
        :getGrade > 61 ? "C"
        :getGrade >= 50 ? "D"
        :"F";

    }
    public static void main(String[] args) {
        int quizScore = 0 ;
        int midternScore = 0;
        int finalScore = 0;
        int choice = -1;
         
        while (choice != 5) {
            choice = mainMenu();
            if(choice == 1){
                quizScore = getExamScore("Quiz");
                System.out.println(quizScore);
            }else if(choice== 2){
                midternScore = getExamScore("Midterm");
            }else if(choice == 3){
                finalScore = getExamScore("Final");
            }else if(choice == 4){
                int totalScore = quizScore + midternScore + finalScore;
                System.out.println(getGrade(totalScore));
            }
        }

       

    }
}
