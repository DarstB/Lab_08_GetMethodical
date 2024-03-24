import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int userInt;    // getInt
        userInt = SafeInput.getInt(in, "Enter your int: ");
        System.out.println("Your int is: " + userInt);

        double userDouble;  // getDouble
        userDouble = SafeInput.getDouble(in, "Enter your double: ");
        System.out.println("Your double is: " + userDouble);

        int userRangedInt;  //getRangedInt
        userRangedInt = SafeInput.geRangedInt(in, "Enter your int within the range ", 1, 10);
        System.out.println("Your ranged int is: " + userRangedInt);

        double userRangedDouble;  //getRangedDouble
        userRangedDouble = SafeInput.getRangedDouble(in, "Enter your double within the range ", 1, 10);
        System.out.println("Your ranged double is: " + userRangedDouble);

        boolean userYNConfirm;  //getYNConfirm
        userYNConfirm = SafeInput.getYNConfirm(in, "Enter your answer [Y/N]: ");
        System.out.println("You confirmed: " + userYNConfirm);

        String userRegEx;   //getRegExString
        userRegEx = SafeInput.getRegExString(in, "Enter a social security number [###-##-####]: ", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your social security number is " + userRegEx);
    }
}
