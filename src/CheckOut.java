import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean done = false;

        do {
            itemPrice = SafeInput.getRangedDouble(in, "Enter the price of the item ", 0.50, 10);
            totalPrice += itemPrice;
            done = SafeInput.getYNConfirm(in, "Are you finished entering items? [Y/N]: ");
        } while (!done);

        System.out.printf("The total price is $%.2f", totalPrice);
    }
}
