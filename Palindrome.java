// checks if a string is a palindrome
import java.util.Scanner;
public class Palindrome{
    public static String reverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i);
        }
        return result;
    }
    public static boolean isPalindrome(String str){
        if (str.length()<2)
            return true;
        int start = 0;
        int last = str.length()-1;
        if ( str.charAt(start) == str.charAt(last) ){
            return isPalindrome(str.substring(start+1,last));
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println("This program tests if strings are palindromes.");
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scnr.next();
        while (!(input.equals("quit"))){
            if (isPalindrome(input)){
                System.out.printf("%s is a palindrome. \n",input);
            }
            else{
                System.out.printf("%s is not a palindrome. \n",input);
            }
            System.out.print("Enter a string: ");
            input = scnr.next();
        }
    }
}