package lesson13;

public class Month {
    public int daysOfMonth(int monthNumber) {
        switch (monthNumber) {
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public static void main(String[] args) {
        Month month = new Month();
        System.out.printf("January 2015 had %d days\n", month.daysOfMonth(1));
        System.out.printf("February 2015 had %d days\n", month.daysOfMonth(2));
        System.out.printf("March 2015 had %d days\n", month.daysOfMonth(3));
        System.out.printf("April 2015 had %d days\n", month.daysOfMonth(4));
        System.out.printf("May 2015 had %d days\n", month.daysOfMonth(5));
        System.out.printf("June 2015 had %d days\n", month.daysOfMonth(6));
        System.out.printf("July 2015 had %d days\n", month.daysOfMonth(7));
        System.out.printf("August 2015 had %d days\n", month.daysOfMonth(8));
        System.out.printf("September 2015 had %d days\n", month.daysOfMonth(9));
        System.out.printf("October 2015 had %d days\n", month.daysOfMonth(10));
        System.out.printf("November 2015 had %d days\n", month.daysOfMonth(11));
        System.out.printf("December 2015 had %d days\n", month.daysOfMonth(12));
    }
}