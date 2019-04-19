import java.util.Scanner;

public class Date{
    
    // assigning attributes
    public int month;
    public int day;
    public int year;

    // default date constructor
    public void setDate(){
        month = 1;
        day   = 1;
        year  = 2000;
    }

    public void setDate(int month, int day, int year){
        this.month = month;
        this.day   = day;
        this.year  = year;
    }

    public void displayValues(){
        System.out.printf("%s / %s / %s \n",month,day,year );
    }

    public static void main(String[] args){
        int inMonth;
        int inDay;
        int inYear;

        Scanner sc = new Scanner(System.in);
        Date def = new Date();
        Date tester  = new Date();

        System.out.print("Input the month of the appointment: ");
        inMonth = sc.nextInt();
        System.out.print("Input the day of the appointment: ");
        inDay = sc.nextInt();
        System.out.print("Input the year of the appointment: ");
        inYear = sc.nextInt();
        def.setDate();
        tester.setDate(inMonth, inDay, inYear);
        def.displayValues();
        tester.displayValues();
        sc.close();
    }
}