/**
 *  A class that stores information about a undergrad student
 */

public class UndergraduateStudent extends Student{
  //member variables
  private int m_num_courses_taken; //represents number of courses undergrad student has taken
  private int m_scholarship_amt; //represents undergrad student scholarship amt

  /** Default constructor initializing all of the info of a undergrad student
  */
  public UndergraduateStudent() {
    super();
    m_num_courses_taken = -1;
    m_scholarship_amt = -1;
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param major String representing student major
  * @param minor String representing student minor
  * @param classStanding String representing student class standing
  * @param numCoursesTaken int representing number of courses undergrad student has taken
  * @param scholarshipAmt int representing undergrad student scholarship amt
  */
  public UndergraduateStudent(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding, int numCoursesTaken, int scholarshipAmt) {
    super(name, age, address, phoneNum, year, major, minor, classStanding);
    m_num_courses_taken = numCoursesTaken;
    m_scholarship_amt = scholarshipAmt;
  }

  /**
  * Accessor for number of courses undergrad student has taken
  * @return an int value of m_num_courses_taken
  */
  public int getNumCoursesTaken() {
    return m_num_courses_taken;
  }

  /**
  * Accessor for undergrad student scholarship amt
  * @return an int value of m_scholarship_amt
  */
  public int getScholarshipAmt() {
    return m_scholarship_amt;
  }

  /**
  * Mutator for number of courses undergrad student has taken
  * @param numCoursesTaken int representing number of courses undergrad student has taken
  */
  public void setNumCoursesTaken(int numCoursesTaken) {
    m_num_courses_taken = numCoursesTaken;
  }

  /**
  * Mutator for undergrad student scholarship amt
  * @param scholarshipAmt int representing undergrad student scholarship amt
  */
  public void setScholarshipAmt(int scholarshipAmt) {
    m_scholarship_amt = scholarshipAmt;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the undergrad studnet's information correctly,
  * deriving from Student and Affiliate classes
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%d,%d", m_num_courses_taken, m_scholarship_amt);
    return ret;
  }
}
