/**
 *  A class that stores the faculty information
 */

public abstract class Faculty extends Affiliate{
  //member variables
  protected int m_faculty_id; //represents faculty ID
  protected String m_department; //represents faculty department
  protected int m_yearly_salary; //represents faculty yearly salary
  protected int m_num_papers; //represents faculty number of papers

  /** Default constructor initializing all of the info of a faculty member
  */
  public Faculty() {
    super();
    m_faculty_id = super.m_common_ID;
    m_department = "";
    m_yearly_salary = -1;
    m_num_papers = -1;
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param department String representing the department the faculty belongs to
  * @param yearlySalary int representing the yearly salary of faculty
  * @param numPapers int representing the number of papers by the faculty
  */
  public Faculty(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers) {
    super(name, age, address, phoneNum, year);
    m_faculty_id = super.m_common_ID;
    m_department = department;
    m_yearly_salary = yearlySalary;
    m_num_papers = numPapers;
  }

  /**
  * Accessor for faculty ID
  * @return an int value of m_faculty_id
  */
  public int getFacultyID() {
    return m_faculty_id;
  }

  /**
  * Accessor for faculty department
  * @return an String value of m_department
  */
  public String getDepartment() {
    return m_department;
  }

  /**
  * Accessor for yearly salary
  * @return an int value of m_yearly_salary
  */
  public int getYealrySalary() {
    return m_yearly_salary;
  }

  /**
  * Accessor for faculty number of papers
  * @return an int value of m_num_papers
  */
  public int getNumPapers() {
    return m_num_papers;
  }

  /**
  * Mutator for faculty department
  * @param department String representing faculty department
  */
  public void setDepartment(String department) {
    m_department = department;
  }

  /**
  * Mutator for faculty yearly salary
  * @param yearlySalary int representing faculty yearly salary
  */
  public void setYealrySalary(int yearlySalary) {
    m_yearly_salary = yearlySalary;
  }

  /**
  * Mutator for faculty number of papers
  * @param numPapers String representing faculty number of papers
  */
  public void setNumPapers(int numPapers) {
    m_num_papers = numPapers;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the full professor's information correctly,
  * deriving Affiliate class
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%s,%d,%d,%d", m_department, m_faculty_id, m_num_papers, m_yearly_salary);
    return ret;
  }
}
