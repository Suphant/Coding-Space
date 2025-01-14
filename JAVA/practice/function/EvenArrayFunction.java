package practice.function;

public class EvenArrayFunction {
    static int[] evenNum(int[] array){
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                count++;
            }
        }

        int[] even = new int[count];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                even[index] = array[i];
                index++;
            }
        }
        System.out.println(index);
        return even;
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] even = evenNum(num);
        for(int i = 0; i < even.length; i++){
            System.out.print(even[i] + " ");
        }
    }
}
