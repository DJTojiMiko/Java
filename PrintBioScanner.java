/*
    Name: Abel Gonzalez
    Class: CS1233
*/

import java.util.Scanner;

public class PrintBioScanner{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);

    //Prompts user for first name
    System.out.print("Enter first name: ");
    String firstName = myScanner.nextLine();

    // Prompt user for last name
    System.out.print("Enter last name: ");
    String lastName = myScanner.nextLine();

    //prompt user for DOB
    System.out.print("Enter DOB: ");
    String dOB = myScanner.nextLine();

    //prompt user for major
    System.out.print("Enter major: ");
    String major = myScanner.nextLine();

    System.out.println();

    System.out.println("First name:\t" + firstName);
    System.out.println("Last name:\t" + lastName);
    System.out.println("DOB:\t\t" + dOB);
    System.out.println("Major:\t\t" + major);
    }
}