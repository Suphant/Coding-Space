package Midterm_Exam;

import java.util.Scanner;

public class CountChar {
    static Scanner scan = new Scanner(System.in);

    static int countChar(String str, char chr){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(chr == str.charAt(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.print("Enter String: ");
        String str = scan.nextLine();
        System.out.print("Enter Char you want to find count: ");
        char chr = scan.next().charAt(0);
        int count = countChar(str, chr);
        System.out.printf("%s have %d %c\n", str, count, chr);
    }
}
