import java.util.Scanner;

public class Variance{
  public static void main(String[] args){

    Scanner sin = new Scanner(System.in);

    System.out.println("How many numbers do you want to enter");
    int numbers = sin.nextInt();

    int myArray[] = new int[numbers];

    for(int i = 0; i < numbers; ++i){
      System.out.println("Enter a number");
      double x = sin.nextDouble();
      myArray[i] = x;
    }

    double sum = 0.0;
    for(int k = 0; k < numbers; ++k){
      sum += myArray[k];
    }

    double mean = (sum/numbers);

    double variance = 0.0;
    for(int j = 0; j < numbers; ++j){
      variance += (Math.pow(2.0, (myArray[j] - mean))/numbers);
    }

    System.out.println(variance);



  }
}
