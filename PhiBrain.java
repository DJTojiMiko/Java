import java.util.Scanner;

public class PhiBrain{
    public static int gcd(int a, int b){
        if( b == 0 )
            return a;
        return gcd(b,a%b);
    }
    public static int phi(int n){
        int count = 0;
        for (int i=1;i<n;i++){
            if(gcd(i,n)==1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int input = scnr.nextInt();
        System.out.printf("Phi(n): %d",phi(input));
        scnr.close();
    }
}