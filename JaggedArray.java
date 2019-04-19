import java.util.Scanner;

public class JaggedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows are in the jagged array? ");
        int rows = sc.nextInt();
        int [][] array = new int[rows][];
        String junk = sc.nextLine();

        for (int i = 0; i < rows; i++){
            System.out.print("Enter a row, seperated by spaces: ");
            String line = sc.nextLine();

            String[] tokens = line.split("\\s+");
            array[i] = new int[tokens.length];
            for(int j =0; j < tokens.length; j++){
                array[i][j] = Integer.parseInt(tokens[j]);
            } 
        }
        System.out.println("After the funky operation, the resulting array is:");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                System.out.printf("%5d", (array[i][j] * (i + j +1) ) );
            }
            System.out.println();
        }
    }
}