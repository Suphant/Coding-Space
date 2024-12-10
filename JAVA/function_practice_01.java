public class function_practice_01 {
    static int sumTwoIntegers(int a, int b){
        return a + b;
    }

    static int sumThreeIntegers(int c,int d, int e){
        return c + d + e;
    }

    static int factorial(int f){
        int total = 1;
        for(int i = 1; i <= f; i++){
            total *= i;
        }
        return total;
    }

    static char printFirstChar(String firstLetter){
        return firstLetter.charAt(0);
    }

    static char getLastChar(String lastLetter){
        int length = lastLetter.length();
        return lastLetter.charAt(length -1);
    }

    static String concatenateStrings(String word1, String word2){
            return word1 + word2;

    }

    public static void main(String[] args) {
        System.out.println(getLastChar("prymania"));
        System.out.println(concatenateStrings("Hello", "World"));
    }
}
