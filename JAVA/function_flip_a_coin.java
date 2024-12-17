import java.util.Random;

public class function_flip_a_coin {
    public static String flipCoin(){
        Random random = new Random();
        return random.nextBoolean() ? "Head" : "Tail";
    }

    public static void main(String[] args) {
        
            System.out.println("Fliping the coins.");
            for(int i = 1; i <=5; i++){
                String result = flipCoin();
                System.out.println("Flip " + i + ": " + result);
            }
    }
}
