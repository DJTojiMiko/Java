import java.util.Scanner;

public class GroceryItem{
    private int stockNum;
    private int price;
    private int quantity;
    private int total;

    private void setStockNum(int newStockNum){
        this.stockNum = newStockNum;
    }
    private void setPrice(int newPrice){
        this.price = newPrice;
    }
    private void setQuantity(int newQuantity){
        this.quantity = newQuantity;
    }
    private void setTotal(){
        total = price * quantity;
    }
    public void dataEntry(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Stock Number: ");
        int x = sc.nextInt();
        Boolean invalidStockNum = true;
        if(x >= 1000 && x <= 9999){
            invalidStockNum = false;
        }
        while(invalidStockNum){
            System.out.println("Invalid Stock Number.");
            System.out.print("Stock Number: ");
            x = sc.nextInt();
            if(x >= 1000 && x <= 9999){
                invalidStockNum = false;
            }
        }
        setStockNum(x);
        System.out.print("Price: ");
        x = sc.nextInt();
        Boolean invalidPrice = true;
        if(x >= 0){
            invalidPrice = false;
        }
        while(invalidPrice){
            System.out.println("Invalid Price.");
            System.out.print("Price: ");
            x = sc.nextInt();
            if(x >= 0){
                invalidPrice = false;
            }
        }
        setPrice(x);
        System.out.print("Quantity: ");
        x = sc.nextInt();
        Boolean invalidQuantity = true;
        if(x >= 0){
            invalidQuantity = false;
        }
        while(invalidQuantity){
            System.out.println("Invalid Quality.");
            System.out.print("Quantity: ");
            x = sc.nextInt();
            if(x >= 0){
                invalidQuantity = false;
            }
        }
        setQuantity(x);
        setTotal();
    }
    public void printValues(){
        System.out.println("Stock Number: " + stockNum);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Value: " + total);
    }

    public static void main(String [] args){
        GroceryItem myItem = new GroceryItem();
        myItem.dataEntry();
        myItem.printValues();
    }
}
