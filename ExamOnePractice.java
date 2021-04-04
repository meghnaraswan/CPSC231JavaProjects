import java.util.Scanner;

public class ExamOnePractice{
  public static void main(String[] args){

    // Scanner sin = new Scanner(System.in);
    // System.out.println("Enter a string: ");
    // String words = sin.nextLine();
    // words = words.toLowerCase();
    // int count = 0;
    // for(int i = 0; i < words.length(); ++i){
    //   if(words.charAt(i) == 'r' || words.charAt(i) == 's' || words.charAt(i) == 't'){
    //     ++count;
    //   }
    // }
    // System.out.println(count);

    // Scanner sin = new Scanner(System.in);
    // System.out.println("Enter a string: ");
    // String words = sin.nextLine();
    // String newWord = "";
    // for (int i = 0; i < words.length(); i = i + 2){
    //   newWord = newWord + words.charAt(i);
    // }
    // System.out.println(newWord);

    int[] myArray = {1, 3, 5, 5, 3, 2, 6, 7, 6};
    for(int i = 0; i < myArray.length; ++i){
      for(int j = i + 1; j < myArray.length; ++j){
        if(myArray[i] == myArray[j]){
          System.out.println(myArray[i] + " is a duplicate");
        }
      }
    }

    // Scanner sin = new Scanner(System.in);
    // int [][] a = new int[3][5];
    // int i; //rows
    // int j; //columns
    // int value;
    // for (i = 0; i < 3; ++i){
    //     for (j = 0; j < 5; ++j){
    //         System.out.println("Enter an integer value: ");
    //         value = sin.nextInt();
    //         a[i][j] = value;
    //     }
    // }
    // for (i = 0; i < 3; ++i){
    //     for (j = 0; j < 5; ++j){
    //         System.out.print(a[i][j] + " ");
    //     }
    //     System.out.println();
    // }

    // Scanner sin = new Scanner(System.in);
    // final int NUM_ELEMENTS = 21;
    // int[] userValues = new int[NUM_ELEMENTS];
    // int slopeNum;
    // int yIntercept;
    // System.out.println("Enter the slope: ");
    // slopeNum = sin.nextInt();
    // System.out.println("Enter the y-intercept: ");
    // yIntercept = sin.nextInt();
    // for(int i = 0; i < userValues.length; ++i){
    //   userValues[i] = (slopeNum * i) + yIntercept;
    // }
    // for(int i = 0; i < userValues.length; ++i){
    //   System.out.println("x = " + i + ", y = " + userValues[i]);
    // }






  }
}
