import java.util.Scanner;

public class function_encrypt_decrypt {
    static Scanner scan = new Scanner(System.in);

    static int mainMenu(){
        System.out.println("Main menu" +
            "\n1. Encrypt the text" +
            "\n2. Decrypt the text" +
            "\n3. Exit"
        );
        System.out.print("Enter your choice: ");
        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }

    static String encrypt(String text){
        String x = "";
        
        for(int i = 0; i < text.length(); i++){
            x += ((char)((text.charAt(i)) + 5));
        }
        System.out.printf("Encrypted text = %s\n", x);
        return x;
    }

    static String decrypt(String text){
        String x = "";
        
        for(int i = 0; i < text.length(); i++){
            x += ((char)((text.charAt(i)) - 5));
        }
        System.out.printf("Decrypted text = %s\n", x);
        return x;
    }
    
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 3) {
            choice = mainMenu();
            if(choice == 1){
               System.out.print("Enter text to encrypt: ");
               String text = scan.nextLine();
               encrypt(text);
            }else if(choice == 2){
               System.out.print("Enter text to decrypt: ");
               String text = scan.nextLine();
               decrypt(text);
            }
        }
    }
}
