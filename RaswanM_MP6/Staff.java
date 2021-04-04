/**
 *  A class that stores information about a staff
 */

public abstract class Staff extends Affiliate{
  //member variables
  protected int m_staff_id; //represents staff ID
  protected String m_title; //represents staff title
  protected String m_building; //represents staff building

  /** Default constructor initializing all of the info of a staff member
  */
  public Staff() {
    super();
    m_staff_id = super.m_common_ID;
    m_title = "";
    m_building = "";
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param title String representing staff title
  * @param building String representing staff building
  */
  public Staff(String name, int age, String address, String phoneNum, int year, String title, String building) {
    super(name, age, address, phoneNum, year);
    m_staff_id = super.m_common_ID;
    m_title = title;
    m_building = building;
  }

  /**
  * Accessor for staff ID
  * @return an int value of m_staff_id
  */
  public int getStaffID() {
    return m_staff_id;
  }

  /**
  * Accessor for staff title
  * @return an String value of m_title
  */
  public String getTitle() {
    return m_title;
  }

  /**
  * Accessor for staff building
  * @return an String value of m_building
  */
  public String getBuilding() {
    return m_building;
  }

  /**
  * Mutator for staff ID
  * @param staffID int representing staff ID
  */
  public void setStudentID(int staffID) {
    m_staff_id = staffID;
  }

  /**
  * Mutator for staff title
  * @param title int representing staff title
  */
  public void setTitle(String title) {
    m_title = title;
  }

  /**
  * Mutator for staff building
  * @param building int representing staff building
  */
  public void setBuilding(String building) {
    m_building = building;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the student's information correctly,
  * deriving Affiliate class
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%s,%d,%s", m_building, m_staff_id, m_title);
    return ret;
  }
}
