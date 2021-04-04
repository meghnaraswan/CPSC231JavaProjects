public class UndergraduateStudent extends Student{
  private int m_num_courses_taken;
  private int m_scholarship_amt;

  public UndergraduateStudent() {
    super();
    m_num_courses_taken = -1;
    m_scholarship_amt = -1;
  }

//overloaded constructor
  public UndergraduateStudent(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding, int numCoursesTaken, int scholarshipAmt) {
    super(name, age, address, phoneNum, year, major, minor, classStanding);
    m_num_courses_taken = numCoursesTaken;
    m_scholarship_amt = scholarshipAmt;
  }

  //accessor
  public int getNumCoursesTaken() {
    return m_num_courses_taken;
  }

  public int getScholarshipAmt() {
    return m_scholarship_amt;
  }

  //mutator
  public void setNumCoursesTaken(int numCoursesTaken) {
    m_num_courses_taken = numCoursesTaken;
  }

  public void setScholarshipAmt(int scholarshipAmt) {
    m_scholarship_amt = scholarshipAmt;
  }

  //copy constructor
  // public UndergraduateStudent(UndergraduateStudent u) {
  //   super(u.getName(), u.getAge(), u.getAddress(), u.getPhoneNum(), u.getYear());
  //   this.m_num_papers_published = u.getNumCoursesTaken();
  //   this.m_thesis_advisor = u.getScholarshipAmt();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, %d, ", m_num_courses_taken, m_scholarship_amt));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nNumber of Courses Taken: " + m_num_courses_taken;
    // ret += "\nScholarship Advisor: " + m_scholarship_amt;
    ret += String.format("%d, %d, ", m_num_courses_taken, m_scholarship_amt);
    return ret;
  }
}
