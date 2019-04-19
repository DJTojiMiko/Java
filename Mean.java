import java.util.Scanner;

public class Mean{
    public static double mean(double [] x,int size){
        double sum = 0;
        for (int i=0;i<size;i++){
            sum += x[i];
        }
        double avg = sum/size;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("What is the size of the array? ");
        int ln = sc.nextInt();
        double [] values = new double[ln];
        for (int i = 0;i<ln;i++){
            values[i] = sc.nextDouble();
        }
        double avg = mean(values,ln);
        System.out.printf("The average of these %d numbers is %.2f.",ln,avg);
        sc.close();
    }
}