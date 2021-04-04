/**
 *  A class that stores information about a part time staff
 */

public class PartTimeStaff extends Staff{
  //member variables
  private int m_hourly_salary; //represents part time staff hourly salary

  /** Default constructor initializing all of the info of a part time staff
  */
  public PartTimeStaff() {
    super();
    m_hourly_salary = -1;
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param title String representing staff title
  * @param building String representing staff building
  * @param hourlySalary int representing part time staff hourly salary
  */
  public PartTimeStaff(String name, int age, String address, String phoneNum, int year, String title, String building, int hourlySalary) {
    super(name, age, address, phoneNum, year, title, building);
    m_hourly_salary = hourlySalary;
  }

  /**
  * Accessor for part time staff hourly salary
  * @return an int value of m_hourly_salary
  */
  public int getHourlySalary() {
    return m_hourly_salary;
  }

  /**
  * Mutator for part time staff hourly salary
  * @param hourlySalary int representing part time staff hourly salary
  */
  public void setHourlySalary(int hourlySalary) {
    m_hourly_salary = hourlySalary;
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
    ret += String.format(",%d", m_hourly_salary);
    return ret;
  }
}
