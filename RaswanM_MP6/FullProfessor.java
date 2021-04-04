/**
 *  A class that stores information about a full professor
 */

public class FullProfessor extends Faculty{
  //member variables
  private int m_yrs_until_retirement; //represents years until the full professor retires

  /** Default constructor initializing all of the info of a full professor
  */
  public FullProfessor() {
    super();
    m_yrs_until_retirement = -1;
  }

  /** Overloaded full professor constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param department String representing the department the faculty belongs to
  * @param yearlySalary int representing the yearly salary of faculty
  * @param numPapers int representing the number of papers by the faculty
  * @param yrsUntilRetirement int representing the years until retirement for full professor
  */
  public FullProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsUntilRetirement) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_until_retirement = yrsUntilRetirement;
  }

  /**
  * Accessor for the years until the full professor retires
  * @return an int value of m_yrs_until_retirement
  */
  public int getYrsUntilTenure() {
    return m_yrs_until_retirement;
  }

  /**
  * Mutator for the years until the full professor retires
  * @param yrsUntilRetirement int representing the years until the full professor retires
  */
  public void setYrsUntilTenure(int yrsUntilRetirement) {
    m_yrs_until_retirement = yrsUntilRetirement;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the full professor's information correctly,
  * deriving from the Faculty and Affiliate class
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%d", m_yrs_until_retirement);
    return ret;
  }
}
