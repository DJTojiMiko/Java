public class Grocery2 extends GroceryItem{
    public static void main(String[] args){
        GroceryItem [] array = new GroceryItem[10];
        for (int i = 0;i<10;i++){
            array[i] = new GroceryItem();
            array[i].dataEntry();
        }
        for (int j = 0; j < 10; j++){
            array[j].printValues();
        }
    }
}