import java.util.Scanner;

public class function_user_password {
    static Scanner scan = new Scanner(System.in);
    static String[][] USER = new String[10][2];
    static int userCount = 0;
    static int mainMenu(){
        System.out.print("Please Select" +
                        "\n1. Register" +
                        "\n2. Login" +
                        "\n3. Show All Users" +
                        "\n4. Exit\n");
        System.out.print("Please Select: ");
        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }

    static boolean addUser(String username, String password){
        if(userCount > USER.length){
            return false;
        }
        USER[userCount][0] = username;
        USER[userCount][1] = password;
        return true;
    }

    static boolean login(String username, String password){
        boolean isUserFound = false;
        for(int i = 0; i < USER.length; i++){
            if(username.equals(USER[i][0])) {
                isUserFound = true;
                if(password.equals(USER[i][1])) {
                    System.out.print("Login Success!\n");
                    isUserFound = true;
                } else {
                    System.out.print("Password is wrong! Please try again.\n");
                    return false;
                }
            }
        }
        if(!isUserFound){
            System.out.print("User Not Found! Please Try Again.\n");
            return false;
        }
        return true;
    }
    
    static void showAllUsers(String[][] user) {
        for(int i = 0; i < user.length; i++){
            for(int j = 0; j < user[0].length; j++){
                System.out.print(user[i][j]+ "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int choice = -1;
        while(choice != 4){
            choice = mainMenu();
            if(choice == 1){
                System.out.print("Enter Username: ");
                String username = scan.nextLine();
                System.out.print("\nEnter Password: ");
                String pass = scan.nextLine();
                addUser(username, pass);
            }else if(choice == 2){
                System.out.print("Enter Username: ");
                String username = scan.nextLine();
                System.out.print("\nEnter Password: ");
                String pass = scan.nextLine();
                login(username, pass);
            }else if(choice == 3){
                showAllUsers(USER);
            }
        }
    }
}
