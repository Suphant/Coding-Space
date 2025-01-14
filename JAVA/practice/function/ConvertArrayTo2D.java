package practice.function;

public class ConvertArrayTo2D {
    static int[][] convert(int[] array, int n){
        int row = array.length / n;
        if(array.length % n != 0){
            row++;
        }

        int index = 0;
        int[][] array2d = new int[row][n];
        for(int i = 0; i < array2d.length; i++){
            for(int j = 0; j < array2d[i].length; j++){
                if (index < array.length) {
                    array2d[i][j] = array[index];
                    index++;
                } else {
                    array2d[i][j] = 0;  // เติม 0 ถ้าข้อมูลหมด
                }
            }
        }
        return array2d;
    }
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[][] result = convert(num, 3);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(result.length);
    }
}
