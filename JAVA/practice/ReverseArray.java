package practice;

public class ReverseArray {
    static int[] reverseArray(int[] array){
        int start = 0;
        int end = array.length - 1;
        int temp = -1;
        while (start < end) {
            temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }
     public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reverse = reverseArray(intArray);
        for(int i = 0; i < reverse.length; i++){
            System.out.print(reverse[i] + " ");
        }
     }
}
