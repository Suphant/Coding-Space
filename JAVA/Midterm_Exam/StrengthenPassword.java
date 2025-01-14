package Midterm_Exam;

public class StrengthenPassword {
    static String strengthenPassword(String password){
        String convert = "";
        String add = "1@";
        int acii;
        
        for(int i = 0; i < password.length(); i++){
            acii = (int)(password.charAt(i));
            if(acii == 'a' || acii == 'A'){
                acii = '@';
            }
            if(acii == 'i'){
                acii = '!';
            }
            if(acii == 'I'){
                acii = '1';
            }
            if(acii == 'o' || acii == 'O'){
                acii = '0';
            }
            if(acii == 's' || acii == 'S'){
                acii = '$';
            }
            convert += (char)(acii);
            
        }

        if(convert.equals(password)){
            add += convert;
            add += "@1";
            return add;
        }
        return convert;
    }

    public static void main(String[] args) {
        String pass = strengthenPassword("homies");
        System.out.println(pass);
    }
}
