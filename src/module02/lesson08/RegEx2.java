package module02.lesson08;

public class RegEx2 {
    public static void main(String[] args) {

        /**
         * Create regular expression for a password. It must contain at least 6 symbols, include numbers,
         * letters, punctuation marks and special characters like $%# - at least one of each group.
         */

        String pass = "1Lp!%l";
        String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\p{Punct})(?=.*[$%#]).{6,}$";
        if(pass.matches(pattern)){
            System.out.println("Пароль действителен");
        }
        else {
            System.out.println("Пароль недействителен");
        }
    }
}
