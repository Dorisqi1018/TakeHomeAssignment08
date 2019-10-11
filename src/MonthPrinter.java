

import java.util.Scanner;

public class MonthPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        System.out.println("Hello! Please enter all months number (1 through 12) ");


             // month index locations


        if (in.hasNextInt()) {
            int MonthNumber = in.nextInt();

            if ((MonthNumber >= 1) && (MonthNumber <= 12)) {


                Month m = new Month(MonthNumber);
                m.getMonthName(); //?
                m.getNumbersofDays();
                System.out.println(m);
                //System.out.println(Month[a]);


            } else {
                System.out.println("Error: Number must be 1 through 12");
            }

        }else {
            System.out.println("ERROR: Not an integer. Terminating");

        }
    }
}











