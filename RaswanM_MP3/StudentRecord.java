/**
 *  A class that stores information about a single student’s grading
 *  record within a specific course
 * @author Meghna Raswan
 */

public class StudentRecord {
  /**A number double representing the first quiz score of the student*/
  private double firstQuiz;
  /**A double representing the second quiz score of the student*/
  private double secondQuiz;
  /**A double representing the third quiz score of the student*/
  private double thirdQuiz;
  /**A double representing the midterm score of the student*/
  private double midtermExam;
  /**A double representing the final exam score of the student*/
  private double finalExam;

  /** This is the default constructor initializing all fields/scores to 0.0*/
  public StudentRecord() {
    firstQuiz = 0.0;
    secondQuiz = 0.0;
    thirdQuiz = 0.0;
    midtermExam = 0.0;
    finalExam = 0.0;
  }

  /** Overloaded student record constructor
  * @param studentFirstQuiz double representing the first quiz score of the student
  * @param studentSecondQuiz double representing the second quiz score of the student
  * @param studentThirdQuiz double representing the third quiz score of the student
  * @param studentMidtermExam double representing the midterm score of the student
  * @param studentFinalExam double representing the final exam score of the student
  */
  public StudentRecord(double studentFirstQuiz, double studentSecondQuiz, double studentThirdQuiz, double studentMidtermExam, double studentFinalExam) {
    firstQuiz = studentFirstQuiz;
    secondQuiz = studentSecondQuiz;
    thirdQuiz = studentThirdQuiz;
    midtermExam = studentMidtermExam;
    finalExam = studentFinalExam;
  }

  /**
  * Accessor for the first quiz
  * @return a double value of firstQuiz
  */
   public double getFirstQuiz() {
      return firstQuiz;
   }

   /**
   * Accessor for the second quiz
   * @return a double value of secondQuiz
   */
   public double getSecondQuiz() {
      return secondQuiz;
   }

   /**
   * Accessor for the third quiz
   * @return a double value of thirdQuiz
   */
   public double getThirdQuiz() {
      return thirdQuiz;
   }

   /**
   * Accessor for the midterm
   * @return a double value of midterm
   */
   public double getMidtermExam() {
      return midtermExam;
   }

   /**
   * Accessor for the final
   * @return a double value of finalExam
   */
   public double getFinalExam() {
      return finalExam;
   }

    /**
    * A public method that returns the student's numeric score.
    * @return a double value representing the student's numeric score.
    */
   public double computeNumericScore() {
     double quizTotal = firstQuiz + secondQuiz + thirdQuiz; //calculate the total of all 3 quizzes
     double quizAvgPercentage = (quizTotal / 30) * 100; //find the overall percentage of the 3 quizzes divided by the total amount of points, wich would be 30 in this case
     double numericScore = ((quizAvgPercentage * 0.25) + (midtermExam * 0.35) + (finalExam * 0.40)); //find the weighted score by taking each exam or total quiz score (whcih would be a value from 0-100) and multiplying each score by its corresonding weighted percentage
     return numericScore; //return the total numeric score the student has in the class
   }

   /**
   * A public method that returns the student's letter grade based on his/her numeric score.
   * @param numericScore double representing the student's numeric score
   * @return a double value representing the student's letter grade.
   */
  public char computeLetterGrade(double numericScore) {
    char letterGrade;
    if (numericScore >= 90) { //if the numeric score is greater than or equal to 90, the letter grade will be an A
      letterGrade = 'A';
    }
    else if (numericScore >= 80) { //if the numeric score is greater than or equal to 80, the letter grade will be an B
      letterGrade = 'B';
    }
    else if (numericScore >= 70) { //if the numeric score is greater than or equal to 70, the letter grade will be an C
      letterGrade = 'C';
    }
    else if (numericScore >= 60) { //if the numeric score is greater than or equal to 60, the letter grade will be an D
      letterGrade = 'D';
    }
    else { //if the numeric score is less than 60, the letter grade will be an F
      letterGrade = 'F';
    }
    return letterGrade; //return the letter grade the student has in the class
  }

  /** Creates a string representation of the student record
  * @return A formatted string with the student' student record attributes
  */
  public String toString() {
    double numericScore = computeNumericScore(); //call the computeNumericScore() method and assign it as a varible named numericScore
    char letterGrade = computeLetterGrade(numericScore); //call the computeLetterGrade() method and pass the numericScore variable as a parameter and assign this method as the variable letterGrade
    return String.format("%.2f percent with a %c letter grade.", numericScore, letterGrade); //return a statement with the student's numeric score and letter grade
  }

  /** Tests two studnets' student records for equality
  * @param s the object to test against
  * @return true if the objects are equal and false otherwise
  */
  public boolean equals(StudentRecord s) { //passes an object as a parameter, reassigning it as variable s
    return (this.computeNumericScore() == s.computeNumericScore()); //compares the first object's numeric score with the second object's numeric score by calling the computeNumericScore method, returning a boolean
  }

  /**
  * It creates new StudentRecord objects and calls the constructor StudentRecord().
  * It uses StudentRecord's computeNumericScore() and computeLetterGrade() methods
  * to properly calculate the student's numeric score and letter grade
  * @param args command-line arguments
  * @see StudentRecord#toString()
  * @see StudentRecord#equals(StudentRecord s)
  */
  public static void main(String[] args) {

    /**
    * This is the main method
    * It creates new StudentRecord objects and calls the constructor StudentRecord().
    * Then it passes the first, second, and third quizzes, midterm, and final as parameters
    */
    StudentRecord recordOne = new StudentRecord(9, 7, 10, 85, 93);
    StudentRecord recordNotEquals = new StudentRecord(10, 7, 10, 89, 99);
    StudentRecord recordEquals = new StudentRecord(10, 6, 10, 85, 93);

    //displays all of the student's records by calling the toString method on the objects
    System.out.println("Student 1's Record: " + recordOne.toString()); //calls the toString method on the object, recordOne
    System.out.println("Student 2's Record: " + recordNotEquals.toString()); //calls the toString method on the object, recordNotEquals
    System.out.println("Student 3's Record: " + recordEquals.toString()); //calls the toString method on the object, recordEquals
    System.out.println();

    //compares Student 2's and Student 3's Records with Student 1 to see if the numeric scores are eqaul or not equal by calling the equals method on the objects
    System.out.println("Is Student 1's record equal to Student 2's record: " + recordOne.equals(recordNotEquals)); //calls the equals method on the objects recordOne and recordNotEquals
    System.out.println("Is Student 1's record equal to Student 3's record: " + recordOne.equals(recordEquals)); ////calls the equals method on the objects recordOne and recordEquals

  }
}
