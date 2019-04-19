import java.util.Scanner;

public class GymnasticScores{
    public static double Mean(double[]x , int size){
        double largest =0;
        double smallest = x[0];
        double sum = 0;
        for (int i = 0; i<size;i++){
            if (x[i] > largest){
                largest = x[i];
            }
            if (x[i]<smallest){
                smallest = x[i];
            }
            sum += x[i];
        }
        sum -= smallest;
        sum-= largest;
        double avg = sum/5;
        return avg;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double [] scores = new double[7];
        for (int k=0;k<7;k++){
            scores[k] = sc.nextDouble();
        }
        double average = Mean(scores, 7);
        System.out.printf("Average score of: %.2f",average);
        sc.close();
    }
}