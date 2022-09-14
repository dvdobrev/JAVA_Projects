package Methods;

import java.util.Scanner;

public class Password_Validator_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        int digitsCount = 0;
        boolean isValid = true;

        if (input.length() < 6 || input.length() > 10) {
            isValid = false;

            System.out.println("Password must be between 6 and 10 characters");
        }

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i))) {
                digitsCount += 1;
            }
        }

        for (int i = 0; i < input.length(); i++) {

            if (Character.isDigit(input.charAt(i)) || Character.isAlphabetic(input.charAt(i))) {
                continue;

            } else {
                isValid = false;
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }

        if (digitsCount < 2) {
            isValid = false;

            System.out.println("Password must have at least 2 digits");
        }

        if(isValid) {
            System.out.print("Password is valid");
        }
    }
}
