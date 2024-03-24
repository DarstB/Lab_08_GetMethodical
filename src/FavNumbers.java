import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int favInt;    // getInt
        favInt = SafeInput.getInt(in, "Enter your favorite int: ");
        System.out.println("Your favorite int is: " + favInt + "\n");

        double favDouble;  // getDouble
        favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");
        System.out.println("Your favorite double is: " + favDouble);
    }
}
