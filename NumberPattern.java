import java.util.Scanner;

public class NumberPattern {
   // TODO: Write recursive printNumPattern() method
   /*printNumPattern(12, 3)
   stack: activation record (a=12, b=3)
   output: 12
   Stack: AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9
   Stack: AR(a=6, b=3), AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6
   Stack: AR(a=3, b=3), AR(a=6, b=3), AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6 3
   Stack: AR(a=0, b=3), AR(a=6, b=3), AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6 3 0
   Stack: AR(a=3, b=3), AR(a=6, b=3), AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6 3 0 3
   Stack: AR(a=6, b=3), AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6 3 0 3 6
   Stack: AR(a=9, b=3), AR(a=12, b=3)
   output: 12 9 6 3 0 3 6 9
   stack: activation record (a=12, b=3)
   output: 12 9 6 3 0 3 6 9 12
   stack: Empty and we're done

   */

   public static void printNumPattern(int a, int b){
     //base case
     System.out.println("Activation record for: " + a + " , " + b);
     if(a <= 0){
       System.out.print(a + " ");
     }
     else {
       System.out.print(a + " "); //decrement
       //do something recursive
       printNumPattern(a-b,b);
       System.out.println("Activation record for: " + a + " , " + b);
       System.out.print(a + " "); //increment
     }

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int num1;
      int num2;

      num1 = scnr.nextInt();
      num2 = scnr.nextInt();
      printNumPattern(num1, num2);
   }
}
