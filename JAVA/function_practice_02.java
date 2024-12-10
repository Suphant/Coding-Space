public class function_practice_02 {
    static int getMax(int[] array){
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    
    static int getSum(int[] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    static boolean isAllUppercase(String str){
        String word = str.toUpperCase();
        return word == str;
    }

    static boolean containsSpecialCharacter(String str2){
        boolean isSpecial = false;
        
        for(int i = 0;i < str2.length(); i++){
            char check = str2.charAt(i);
            if(!('a' <= check && check <= 'z' || 'A' <= check && check <= 'Z' || '0' <= check && check <= '9')){
                isSpecial = true;
            }
        }
        return isSpecial;
    }

    static String getFirstString(String str3, String str4){
        return str3.compareTo(str4);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 3, 2, 6, 10, 9};
        System.out.println(getMax(intArray));
        System.out.println(getSum(intArray));
        System.out.println(isAllUppercase("HOME"));
        System.out.println(containsSpecialCharacter("asda10sad"));
    }
}
