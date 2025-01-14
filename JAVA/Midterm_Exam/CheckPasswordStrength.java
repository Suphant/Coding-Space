package Midterm_Exam;

public class CheckPasswordStrength {

    static int checkPasswordStrength(String password){
        int point = 0;
        int specialChr = 0;
        
        boolean isAtLeastOneNumber = false;

        if(password.length() >= 8){
            point++;
        }

        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) == '1' || password.charAt(i) == '2' || password.charAt(i) == '3' || password.charAt(i) == '4' || password.charAt(i) == '5' || password.charAt(i) == '6' || password.charAt(i) == '7' || password.charAt(i) == '8' || password.charAt(i) == '9'){
                isAtLeastOneNumber = true;
                break;
            }
        }

        for(int i = 0; i < password.length(); i++){
            if(password.charAt(i) == '!' || password.charAt(i) == '@' || password.charAt(i) == '#' || password.charAt(i) == '$' || password.charAt(i) == '%'){
                specialChr++;
            }
            
        }

        if(isAtLeastOneNumber){
            point++;
        }

        if(specialChr >= 1){
            point++;
        }

        if(specialChr > 1){
            point++;
        }
        System.out.print(isAtLeastOneNumber);
        System.out.print(point);
        return point;
    }

    public static void main(String[] args) {
        int check = checkPasswordStrength("aaaaaa1aa!@");
        if(check == 0){
            System.out.println("Very Weak");
        }else if(check == 1){
            System.out.println("Weak");
        }else if(check == 2){
            System.out.println("Moderate");
        }else if(check == 3){
            System.out.println("Strong");
        }else if(check == 4){
            System.out.println("Very Strong");
        }
    }
}
