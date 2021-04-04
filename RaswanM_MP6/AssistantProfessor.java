/**
 *  A class that stores information about an assistant professor
 */

public class AssistantProfessor extends Faculty{
  //member variables
  private int m_yrs_until_tenure; //represents years until assistant professor's tenure

  /** Default constructor initializing all of the info of an assistant professor
  */
  public AssistantProfessor() {
    super();
    m_yrs_until_tenure = -1;
  }

  /** Overloaded assistant professor constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param department String representing the department the faculty belongs to
  * @param yearlySalary int representing the yearly salary of faculty
  * @param numPapers int representing the number of papers by the faculty
  * @param yrsUntilTenure int representing the years until tenure for assistant professor
  */
  public AssistantProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsUntilTenure) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_until_tenure = yrsUntilTenure;
  }

  /**
  * Accessor for the years until assistant professor's tenure
  * @return an int value of m_yrs_until_tenure
  */
  public int getYrsUntilTenure() {
    return m_yrs_until_tenure;
  }

  /**
  * Mutator for the years until assistant professor's tenure
  * @param yrsUntilTenure int representing the years until assistant professor's tenure
  */
  public void setYrsUntilTenure(int yrsUntilTenure) {
    m_yrs_until_tenure = yrsUntilTenure;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the assistant professor's information correctly,
  * deriving from the Faculty and Affiliate class
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%d", m_yrs_until_tenure);
    // ret += "\nYears Until Tenure: " + m_yrs_until_tenure;
    return ret;
  }
}
