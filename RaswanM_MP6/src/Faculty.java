public abstract class Faculty extends Affiliate{
  protected int m_faculty_id;
  protected String m_department;
  protected int m_yearly_salary;
  protected int m_num_papers;

  public Faculty() {
    super();
    m_faculty_id = super.m_common_ID;
    m_department = "";
    m_yearly_salary = -1;
    m_num_papers = -1;
  }

//overloaded constructor
  public Faculty(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers) {
    super(name, age, address, phoneNum, year);
    m_faculty_id = super.m_common_ID;
    m_department = department;
    m_yearly_salary = yearlySalary;
    m_num_papers = numPapers;
  }

  //accessor
  public int getFacultyID() {
    return m_faculty_id;
  }

  public String getDepartment() {
    return m_department;
  }

  public int getYealrySalary() {
    return m_yearly_salary;
  }

  public int getNumPapers() {
    return m_num_papers;
  }

  //mutator
  // public void setFacultyID(int facultyID) {
  //   m_faculty_id = facultyID;
  // }

  public void setDepartment(String department) {
    m_department = department;
  }

  public void setYealrySalary(int yearlySalary) {
    m_yearly_salary = yearlySalary;
  }

  public void setNumPapers(int numPapers) {
    m_num_papers = numPapers;
  }

  //copy constructor
  // public Faculty(Faculty f) {
  //   super(f.getName(), f.getAge(), f.getAddress(), f.getPhoneNum(), f.getYear());
  //   this.m_faculty_id = f.getFacultyID();
  //   this.m_department = f.getDepartment();
  //   this.m_yearly_salary = f.getYealrySalary();
  //   this.m_num_papers = f.getNumPapers();
  // }

  public void print(){
    // super.print();
    // System.out.print(String.format("%s, %d, %d, %d, ", m_department, m_faculty_id, m_num_papers, m_yearly_salary));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format("%s, %d, %d, %d, ", m_department, m_faculty_id, m_num_papers, m_yearly_salary);
    // ret += "\nFaculty ID: " + m_faculty_id;
    // ret += "\nDepartment: " + m_department;
    // ret += "\nYearly Salary: " + m_yearly_salary;
    // ret += "\nNumber of Papers: " + m_num_papers;
    return ret;
  }
}
