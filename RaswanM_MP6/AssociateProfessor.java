/**
 *  A class that stores information about an associate professor
 */

public class AssociateProfessor extends Faculty{
  //member variables
  private int m_yrs_since_tenure; //represents years since the associate professor's tenure

  /** Default constructor initializing all of the info of an associate professor
  */
  public AssociateProfessor() {
    super();
    m_yrs_since_tenure = -1;
  }

  /** Overloaded associate professor constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param department String representing the department the faculty belongs to
  * @param yearlySalary int representing the yearly salary of faculty
  * @param numPapers int representing the number of papers by the faculty
  * @param yrsSinceTenure int representing the years since tenure for associate professor
  */
  public AssociateProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsSinceTenure) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_since_tenure = yrsSinceTenure;
  }

  /**
  * Accessor for the years since associate professor's tenure
  * @return an int value of m_yrs_since_tenure
  */
  public int getYrsSinceTenure() {
    return m_yrs_since_tenure;
  }

  /**
  * Mutator for the years since associate professor's tenure
  * @param yrsSinceTenure int representing the years since associate professor's tenure
  */
  public void setYrsSinceTenure(int yrsSinceTenure) {
    m_yrs_since_tenure = yrsSinceTenure;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the associate professor's information correctly,
  * deriving from the Faculty and Affiliate class
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%d", m_yrs_since_tenure);
    return ret;
  }
}
