import java.util.Scanner;

public class PrimeNumber{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.println("Enter an integer value: ");
    int number = sin.nextInt();

    Boolean isPrime = true;
    for(int i = 2; i < number; ++i){
      if(number % i == 0){
        isPrime = false;
        break;
      }
    }
    if(number != 1 && isPrime){
      System.out.println("It's prime!");
    }
    else{
      System.out.println("It's NOT prime!");
    }
  }
}
