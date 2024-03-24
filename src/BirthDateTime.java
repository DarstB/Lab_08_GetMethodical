import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year, month, hour, minute, temp;
        int day = 0;

        year = SafeInput.geRangedInt(in, "Enter the year you were born ", 1950, 2015);
        month = SafeInput.geRangedInt(in, "Enter the month you were born ", 1, 12);

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            temp = 1;
        }
        else if (month == 2) {
            temp = 2;
        }
        else {
            temp = 3;
        }

        switch (temp) {
            case 1:
                day = SafeInput.geRangedInt(in, "Enter the day you were born ", 1, 31);
                break;
            case 2:
                day = SafeInput.geRangedInt(in, "Enter the day you were born ", 1, 29);
                break;
            case 3:
                day = SafeInput.geRangedInt(in, "Enter the day you were born ", 1, 30);
                break;
        }

        hour = SafeInput.geRangedInt(in, "Enter the hour you were born ", 1, 24);
        minute = SafeInput.geRangedInt(in, "Enter the minute you were born ", 1, 59);

        System.out.println("You were born on " + month + "/" + day + "/" + year + ", at " + hour + ":" + minute + ".");
    }
}
