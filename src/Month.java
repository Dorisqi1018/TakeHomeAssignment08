public class Month {



    String MonthName;
    int NumbersofDays;



    public Month(int MonthNumber){

        String[] Month = { "January","February","March","April","May",
                "June","July","August","September","October","November","December"};
        MonthName = Month[MonthNumber-1];
        /*if (MonthNumber == 1) {
            MonthName =  "January";
        } else if (MonthNumber == 2) {
            MonthName = "February";
        } else if (MonthNumber == 3) {
            MonthName = "March";
        } else if (MonthNumber == 4) {
            MonthName = "April";
        } else if (MonthNumber == 5) {
            MonthName = "May";
        } else if (MonthNumber == 6) {
            MonthName = "June";
        } else if (MonthNumber == 7) {
            MonthName = "July";
        } else if (MonthNumber == 8) {
            MonthName = "August";
        } else if (MonthNumber == 9) {
            MonthName = "September";
        } else if (MonthNumber == 10) {
            MonthName = "October";
        } else if (MonthNumber == 11) {
            MonthName = "November";
        } else {
            MonthName = "December";
        }*/

        if ((MonthNumber == 1) || (MonthNumber == 3) || (MonthNumber == 5) ||
                (MonthNumber == 7) || (MonthNumber == 8) || (MonthNumber == 10) ||
                (MonthNumber == 11)) {
            NumbersofDays = 31;
        } else if ((MonthNumber == 4) || (MonthNumber == 6) || (MonthNumber == 9) ||
                (MonthNumber == 12)) {
            NumbersofDays = 30;
        } else {
            NumbersofDays = 28;
        }

    }


    public String getMonthName() {
        return MonthName;
    }


    public int getNumbersofDays() {
        return NumbersofDays;
    }

    public String toString(){
        return MonthName + " " + NumbersofDays;
    }
}
