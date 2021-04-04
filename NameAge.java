/*Write a program that asks the user for their name and age. Then print their name and tell them if their age is odd or even. */

import java.util.Scanner;

public class NameAge{
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);

    System.out.println("Enter your name: ");
    String name = sin.nextLine();
    System.out.println("Enter your age: ");
    int age = sin.nextInt();

    System.out.println("Hello, " + name);

    if(age % 2 == 1){
      System.out.println("Your age is an odd number.");
    }
    else{
      System.out.println("Your age is an even number.");
    }

    // int remainder = age % 2;
    // if(remainder == 0){
    //   System.out.println("Your age is an even number.");
    // }
    // else{
    //   System.out.println("Your age is an odd number.");
    // }


  }
}
