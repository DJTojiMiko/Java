import  java.util.Scanner;

public class Person{

    // Attributes
    public String lastName;
    public String firstName;
    public String zip;

    // Default Constructor
    Person(){
        lastName = "X";
        firstName = "X";
        zip = "X";
    }
    
    public void person(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
        this.zip = "X";
    }

    public void person(String lastName, String firstName, String zip){
        this.lastName = lastName;
        this.firstName = firstName;
        this.zip = zip;
    }

    public void display(){
        System.out.println("Patient Information");
        System.out.println("Name: " + this.lastName + "," + this.firstName);
        System.out.println("Zip Code: " + this.zip);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        Person one = new Person();
        one.display();
        System.out.println("");

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
         
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter Zip Code: ");
        String zip = sc.nextLine();
        sc.close();

        System.out.println("");
        
        Person two = new Person();
        two.person(lastName, firstName, zip);
        two.display();
    }

}