public class function_sum{
    static int sumArray(int[] numbers){
        int sum = 0;
        for(int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        return sum;
    }

    static int minmaxArray(int[] numbers){
        int min = numbers[0];  // กำหนดค่าเริ่มต้นเป็นค่าแรกของ array
        int max = numbers[0];
    
        for(int i = 1; i < numbers.length; i++) {
          if(numbers[i] < min) {
                min = numbers[i];
            } else if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    static int ruamArray(int[] a, int[] b){
        
    }

    public static void main(String[] args) {
        int[] numberArray = {1, 2, 1, 4, 5, 2, 10};
        System.out.println(sumArray(numberArray));
        System.out.println(minmaxArray(numberArray));
    }
}