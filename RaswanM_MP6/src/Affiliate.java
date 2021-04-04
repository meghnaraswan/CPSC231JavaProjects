/**
 *  A class that stores information about an affiliate
 */

public abstract class Affiliate implements Printable, Comparable<Affiliate> {
  //member variables
  protected String m_name; //represents name of affiliate
  protected int m_age; //represents age of affiliate
  protected String m_address; //represents address of affiliate
  protected String m_phone_num; //represents phone number of affiliate
  protected int m_year; //represents year affiliate came to Chapman
  protected int m_common_ID; //represents the common ID of affiliate
  private static int m_current_common_ID = 0; //represents the current common ID for each affiliate, making each affiliate's ID unique

  /** Default constructor initializing all of the info of an affiliate
  */
  public Affiliate(){
    m_name = "";
    m_age = -1;
    m_address = "";
    m_phone_num = "";
    m_year = -1;
    m_common_ID = m_current_common_ID;
  }

  /** Overloaded affiliate constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNumber String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  */
  public Affiliate(String name, int age, String address, String phoneNum, int year){
    m_name = name;
    m_age = age;
    m_address = address;
    m_phone_num = phoneNum;
    m_year = year;
    m_common_ID = m_current_common_ID;
  }

  /** Copy constructor
  * @param a the affiliate to copy
  */
  public Affiliate(Affiliate a) {
    this.m_name = a.m_name;
    this.m_age = a.m_age;
    this.m_address = a.m_address;
    this.m_phone_num = a.m_phone_num;
    this.m_year = a.m_year;
  }

  /**
  * Accessor for the name of affiliate
  * @return a String value of m_name
  */
  public String getName() {
    return m_name;
  }

  /**
  * Accessor for the age of affiliate
  * @return an int value of m_age
  */
  public int getAge() {
    return m_age;
  }

  /**
  * Accessor for the address of affiliate
  * @return a String value of m_address
  */
  public String getAddress() {
    return m_address;
  }

  /**
  * Accessor for the phone number of affiliate
  * @return a String value of m_phone_num
  */
  public String getPhoneNum() {
    return m_phone_num;
  }

  /**
  * Accessor for the year affiliate came to Champman
  * @return an int value of m_year
  */
  public int getYear() {
    return m_year;
  }

  /**
  * Accessor for the common ID of affiliate
  * @return a int value of m_common_ID
  */
  public int getCommonID() {
    return m_common_ID;
  }

  /**
  * Mutator for the name of affiliate
  * @param name String representing the name
  */
  public void setName(String name) {
    m_name = name;
  }

  /**
  * Mutator for the age of affiliate
  * @param age int representing the age
  */
  public void setAge(int age) {
    m_age = age;
  }

  /**
  * Mutator for the address of affiliate
  * @param address int representing the address
  */
  public void setAddress(String address) {
    m_address = address;
  }

  /**
  * Mutator for the phone number of affiliate
  * @param phoneNum int representing the phone number
  */
  public void setPhoneNum(String phoneNum) {
    m_phone_num = phoneNum;
  }

  /**
  * Mutator for the year affiliate came to Champman
  * @param year int representing the year
  */
  public void setOrigin(int year) {
    m_year = year;
  }

  public void print(){
    System.out.println(String.format("%s, %d, %s, %s, %d, ", m_address, m_age, m_name, m_phone_num, m_year));
  }

  public String toString(){
    String ret = "";
    ret += "Name: " + m_name;
    ret += "\nAge: " + m_age;
    ret += "\nPhone Number: " + m_phone_num;
    ret += "\nYear Arriving at Chapman: " + m_year;
    return ret;
  }

  /**
  * Comparable 
  */
  public int compareTo(Affiliate a){
    int ret = 0;
    if (this.m_year < a.m_year){
      ret = -1;
    }
    else if (this.m_year > a.m_year){
      ret = 1;
    }
    else{
      ret = 0;
    }
    return ret;
  }
}
