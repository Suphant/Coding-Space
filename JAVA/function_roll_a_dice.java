import java.util.Random;

public class function_roll_a_dice {
    static Random random = new Random();
    static int randomNum;
    static int rollDice(){
        return randomNum = random.nextInt(1,7);
    }

    public static void main(String[] args) {
        System.out.println("Roll A dice.");
        for(int i = 1;i <= 10; i++){
            System.out.println("Roll " + i + " : " + rollDice() );
        }

    }
}
