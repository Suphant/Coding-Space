
public class funtions_methods {
    static void printMe(String s){
        System.out.println(s);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = sum(1, 2);
        int b = sum(3, 4);

        System.out.println(sum(5, 10));
        System.out.println(a);
        System.out.println(b);
    }
}
