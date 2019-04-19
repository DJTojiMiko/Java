public class PrintBioArguments {
    public static void main(String[] args){
        System.out.println("This program prints user's first name, last name, DOB, \nand major that are parsed from the command line as arguments.");
        System.out.println("First name:\t" + args[0]);
        System.out.println("Last name:\t" + args[1]);
        System.out.println("DOB:\t\t" + args[2]);
        System.out.println("Major:\t\t" + args[3]);
    }
}