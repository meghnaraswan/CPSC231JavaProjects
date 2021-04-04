/**
 *  A class that stores information about a full time staff
 */

public class FullTimeStaff extends Staff{
  //member variables
  private int m_yearly_salary; //represents full time staff yearly salary

  /** Default constructor initializing all of the info of a full time staff
  */
  public FullTimeStaff() {
    super();
    m_yearly_salary = -1;
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param title String representing staff title
  * @param building String representing staff building
  * @param yearlySalary int representing full time staff yearly salary
  */
  public FullTimeStaff(String name, int age, String address, String phoneNum, int year, String title, String building, int yearlySalary) {
    super(name, age, address, phoneNum, year, title, building);
    m_yearly_salary = yearlySalary;
  }

  /**
  * Accessor for full time staff yearly salary
  * @return an int value of m_yearly_salary
  */
  public int getYearlySalary() {
    return m_yearly_salary;
  }

  /**
  * Mutator for full time staff yearly salary
  * @param yearlySalary int representing full time staff yearly salary
  */
  public void setYearlySalary(int yearlySalary) {
    m_yearly_salary = yearlySalary;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the student's information correctly,
  * deriving from Staff and Affiliate classes
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nYearly Salary: " + m_yearly_salary;
    ret += String.format(",%d", m_yearly_salary);
    return ret;
  }
}
