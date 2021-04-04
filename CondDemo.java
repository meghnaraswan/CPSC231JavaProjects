import java.util.Scanner;

public class CondDemo{
  public static void main(String[] args){
    System.out.println("Enter your exam as a single character: ");
    Scanner sin = new Scanner(System.in);
    String grade = sin.nextLine();
    char gradeChar = grade.charAt(0);

    // if(gradeChar == 'A' || gradeChar == 'a'){
    //   System.out.println("Goodjob!");
    // }
    // else if(gradeChar == 'B' || gradeChar == 'b'){
    //   System.out.println("No med school for you.");
    // }
    // else if(gradeChar == 'C' || gradeChar == 'c'){
    //   System.out.println("They get degrees....");
    // }
    // else if(gradeChar == 'D' || gradeChar == 'd'){
    //   System.out.println("Better luck next year!");
    // }
    // else if(gradeChar == 'F' || gradeChar == 'f'){
    //   System.out.println("Say sorry to mom and dad who are crying.");
    // }
    // else{
    //   System.out.println("That's not a letter grade. Are you in school?");
    // }

    switch(gradeChar){
      case 'A':
      case 'a':
        System.out.println("Great!");
        break;
      case 'B':
      case 'b':
        System.out.println("Good!");
        break;
      case 'C':
      case 'c':
        System.out.println("Average!");
        break;
      case 'D':
      case 'd':
        System.out.println("Below Average!");
        break;
      case 'F':
      case 'f':
        System.out.println("Fail!");
        break;
      default:
        System.out.println("That's not a grade!");
        break;

    }
  }
}
