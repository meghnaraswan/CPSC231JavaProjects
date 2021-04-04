public abstract class Staff extends Affiliate{
  protected int m_staff_id;
  protected String m_title;
  protected String m_building;

  public Staff() {
    super();
    m_staff_id = super.m_common_ID;
    m_title = "";
    m_building = "";
  }

//overloaded constructor
  public Staff(String name, int age, String address, String phoneNum, int year, String title, String building) {
    super(name, age, address, phoneNum, year);
    m_staff_id = super.m_common_ID;
    m_title = title;
    m_building = building;
  }

  //accessor
  public int getStaffID() {
    return m_staff_id;
  }

  public String getTitle() {
    return m_title;
  }

  public String getBuilding() {
    return m_building;
  }

  //mutator
  public void setStudentID(int staffID) {
    m_staff_id = staffID;
  }

  public void setMajor(String title) {
    m_title = title;
  }

  public void setMinor(String building) {
    m_building = building;
  }

  //copy constructor
  // public Staff(Staff s) {
  //   super(s.getName(), s.getAge(), s.getAddress(), s.getPhoneNum(), s.getYear());
  //   this.m_staff_id = s.getStaffID();
  //   this.m_title = s.getTitle();
  //   this.m_building = s.getBuilding();
  // }

  public void print(){
    // super.print();
    // System.out.print(String.format("%s, %d, %s, ", m_building, m_staff_id, m_title));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format("%s, %d, %s, ", m_building, m_staff_id, m_title);
    // ret += "\nStaff ID: " + m_staff_id;
    // ret += "\nTitle: " + m_title;
    // ret += "\nBuilding: " + m_building;
    return ret;
  }
}
