import java.util.Scanner;

public class Flip{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        String sentinel = scnr.next();
        while (!(sentinel.equals("STOP"))){
            int ln = sentinel.length(); 
            for (int i=0; i<ln; i++) { 
                int ch = sentinel.charAt(i); 
                if (ch>64&&ch<91) {
                    ch = ch + 32;
                    System.out.print((char)ch);
                }
                else if(ch>96&&ch<123){
                    ch = ch-32;
                    System.out.print((char)ch);
                }
                if(ch==32){
                    System.out.print(" ");
                }
            }
            System.out.print("");
            sentinel = scnr.next();
        }
    }
} 