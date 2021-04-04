
import java.util.Scanner;

public class MilesPerGal{
  public static void main(String[] args){
    System.out.println("Enter your car's mpg: ");
    Scanner sin = new Scanner(System.in);
    int mpg = sin.nextInt();
    if(mpg > 50){
      System.out.println("Going green! #teamTrees");
    }
    else if(mpg >= 35){
      System.out.println("Good form!");
    }
    else if(mpg >= 25){
      System.out.println("So waht, you got a car!");
    }
    else if(mpg >= 0){
      System.out.println("Boooo!");
    }
    else{
      System.out.println("Are you just trying to kill animals?");
    }

  }
}
