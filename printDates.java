package ch3.APCSAch4;
public class printDates{
    public static void printAmerican(String day, String month, int date, int year){
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }
    public static void printEuropean(int numbermonth, int date, int year){
        System.out.print(year+ "/" + "0" + numbermonth + "/" + year);
    }
    public static void main (String [] arngs){
        String day = "Tuesday";
        String month = "September";
        int numbermonth = 9;
        int date = 16;
        int year = 2025;
        
        printAmerican(day,month,date,year);
        printEuropean(numbermonth,date,year);
    }
}

        