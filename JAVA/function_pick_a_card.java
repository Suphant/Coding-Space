import java.util.Random;

public class function_pick_a_card {
    static Random random = new Random();
    static int randomNum;
    static String randomRank(){
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        return ranks[random.nextInt(0, ranks.length)];
    }

    static String randomSuit(){
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        return suits[random.nextInt(0, suits.length)];
    }

    public static void main(String[] args) {
        System.out.println("Pick the cards.");
        for(int i = 1; i <= 5; i++){
            System.out.println("Card " + i + ": " + randomRank() + " of " + randomSuit());
        }
    }
}