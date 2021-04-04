import java.util.Scanner;

public class CapLetter{
  public static void main(String[] args){
    System.out.println("What's your name: ");
    Scanner sin = new Scanner(System.in);
    String name = sin.nextLine();

    // if(Character.isLowerCase(name.charAt(0))){
    //   System.out.println("Please use the Queen's rules of grammer.");
    // }
    // else{
    //   System.out.println("Good form!");

    char firstLetter = name.charAt(0);
    int asciiValue = (int) firstLetter;
    if(!(asciiValue >= 65 && asciiValue <= 90)){
      System.out.println("Please use the Queen's rules of grammer.");
    }
    else{
      System.out.println("Good form!");

    }
  }
}
