public abstract class Student extends Affiliate{
  protected int m_student_id;
  protected String m_major;
  protected String m_minor;
  protected String m_class_standing;

  public Student() {
    super();
    m_student_id = super.m_common_ID;
    m_major = "";
    m_minor = "";
    m_class_standing = "";
  }

//overloaded constructor
  public Student(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding) {
    super(name, age, address, phoneNum, year);
    m_student_id = super.m_common_ID;
    m_major = major;
    m_minor = minor;
    m_class_standing = classStanding;
  }

  //accessor
  public int getStudentID() {
    return m_student_id;
  }

  public String getMajor() {
    return m_major;
  }

  public String getMinor() {
    return m_minor;
  }

  public String getClassStanding() {
    return m_class_standing;
  }

  //mutator
  // public void setStudentID(int studentID) {
  //   m_student_id = studentID;
  // }

  public void setMajor(String major) {
    m_major = major;
  }

  public void setMinor(String minor) {
    m_minor = minor;
  }

  public void setClassStanding(String classStanding) {
    m_class_standing = classStanding;
  }

  //copy constructor
  // public Student(Student s) {
  //   super(s.getName(), s.getAge(), s.getAddress(), s.getPhoneNum(), s.getYear());
  //   this.m_faculty_id = s.getStudentID();
  //   this.m_department = s.getMajor();
  //   this.m_yearly_salary = s.getMinor();
  //   this.m_num_papers = s.getClassStanding();
  // }

  public void print(){
    // super.print();
    // System.out.print(String.format("%s, %s, %s, %d, ", m_class_standing, m_major, m_minor, m_student_id));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format("%s, %s, %s, %d, ", m_class_standing, m_major, m_minor, m_student_id);
    // ret += "\nStudent ID: " + m_student_id;
    // ret += "\nMajor: " + m_major;
    // ret += "\nMinor: " + m_minor;
    // ret += "\nClass Standing: " + m_class_standing;
    return ret;
  }
}
