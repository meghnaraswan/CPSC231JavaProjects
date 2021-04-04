/**
 *  A class that stores information about a student
 */

public abstract class Student extends Affiliate{
  //member variables
  protected int m_student_id; //represents student ID
  protected String m_major; //represents student major
  protected String m_minor; //represents student minor
  protected String m_class_standing; //represents student class standing

  /** Default constructor initializing all of the info of a student
  */
  public Student() {
    super();
    m_student_id = super.m_common_ID;
    m_major = "";
    m_minor = "";
    m_class_standing = "";
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
  */
  public Student(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding) {
    super(name, age, address, phoneNum, year);
    m_student_id = super.m_common_ID;
    m_major = major;
    m_minor = minor;
    m_class_standing = classStanding;
  }

  /**
  * Accessor for student ID
  * @return an int value of m_student_id
  */
  public int getStudentID() {
    return m_student_id;
  }

  /**
  * Accessor for student major
  * @return an String value of m_major
  */
  public String getMajor() {
    return m_major;
  }

  /**
  * Accessor for student minor
  * @return an String value of m_minor
  */
  public String getMinor() {
    return m_minor;
  }

  /**
  * Accessor for student class standing
  * @return an String value of m_class_standing
  */
  public String getClassStanding() {
    return m_class_standing;
  }

  /**
  * Mutator for student major
  * @param major int representing student major
  */
  public void setMajor(String major) {
    m_major = major;
  }

  /**
  * Mutator for student minor
  * @param minor int representing student minor
  */
  public void setMinor(String minor) {
    m_minor = minor;
  }

  /**
  * Mutator for student class standing
  * @param classStanding int representing student class standing
  */
  public void setClassStanding(String classStanding) {
    m_class_standing = classStanding;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the student's information correctly,
  * deriving from Affiliate classe
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format(",%s,%s,%s,%d", m_class_standing, m_major, m_minor, m_student_id);
    return ret;
  }
}
