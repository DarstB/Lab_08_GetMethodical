import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String ssn, mNumber, menuChoice;

        ssn = SafeInput.getRegExString(in, "Enter a social security number [###-##-####]: ", "^\\d{3}-\\d{2}-\\d{4}$");
        mNumber = SafeInput.getRegExString(in, "Enter an MNumber [M#####]: ", "^M\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "Enter your choice [O, S, V, Q]: ", "^[OoSsVvQq]$");

        System.out.println("Your ssn is " + ssn);
        System.out.println("Your MNumber is " + mNumber);
        System.out.println("You chose " + menuChoice);
    }
}
