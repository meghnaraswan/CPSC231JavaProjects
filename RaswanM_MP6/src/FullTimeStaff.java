public class FullTimeStaff extends Staff{
  private int m_yearly_salary;

  public FullTimeStaff() {
    super();
    m_yearly_salary = -1;
  }

//overloaded constructor
  public FullTimeStaff(String name, int age, String address, String phoneNum, int year, String title, String building, int yearlySalary) {
    super(name, age, address, phoneNum, year, title, building);
    m_yearly_salary = yearlySalary;
  }

  //accessor
  public int getYearlySalary() {
    return m_yearly_salary;
  }

  //mutator
  public void setYearlySalary(int yearlySalary) {
    m_yearly_salary = yearlySalary;
  }

  //copy constructor
  // public FullTimeStaff(FullTimeStaff f) {
  //   super(f.getName(), f.getAge(), f.getAddress(), f.getPhoneNum(), f.getYear());
  //   this.m_yearly_salary = f.getYearlySalary();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, ", m_yearly_salary));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nYearly Salary: " + m_yearly_salary;
    ret += String.format("%d, ", m_yearly_salary);
    return ret;
  }
}
