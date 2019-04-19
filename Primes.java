import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Primes{
    public static ArrayList<Integer> primes = new ArrayList<Integer>();
    public static ArrayList<Integer> divs = new ArrayList<Integer>();

    public static void PrimeCheck(int n) {
        boolean flag = false;
        for (int i = 2; i <= n/2; i++) {
            if(n % i == 0){
                flag = true;
                break;
            }
        }
        if (!flag)
            primes.add(n);
    }

    public static int phi(int n){
        for (int i = 2; i <= n; i++){
            PrimeCheck(i);
        }
        for(int i=0;i<primes.size();i++){
            if(n%primes.get(i)==0){
                divs.add(primes.get(i));
            }
        }
        System.out.println();
        float product = n;
        for (int i=0;i<divs.size();i++){
            //System.out.println(product);
            //System.out.println(1/(float)divs.get(i));
            float fraction = 1-(1/(float)divs.get(i));
            product *= fraction;
        }
        System.out.println(product);
        int result = Math.round(product);
        return result;
    } 

    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int input = scnr.nextInt();
        System.out.printf("Phi(n): %d",phi(input));
        scnr.close();
    }
}
    