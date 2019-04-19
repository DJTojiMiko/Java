public class PrintTable{
    public static void main(String[] args){
        final int SIZE = 3;
        int[][] table = new int[SIZE][SIZE];
        Scanner sc = new Scanner(System.in);
        for(int i =0; i < SIZE; i++){
            for(int j = 0; j < SIZE; j++){
                table[i][j] = sc.nextInt;
            }
        }
        
        //print diagonal
        for(int i =0; i < SIZE; i++){
            System.out.println(table[i][j]);
        }

        //print N-sum of table
        for(int i =0; i < SIZE; i++){
            
        }
    }
}