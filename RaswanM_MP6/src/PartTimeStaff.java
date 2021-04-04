public class PartTimeStaff extends Staff{
  private int m_hourly_salary;

  public PartTimeStaff() {
    super();
    m_hourly_salary = -1;
  }

//overloaded constructor
  public PartTimeStaff(String name, int age, String address, String phoneNum, int year, String title, String building, int hourlySalary) {
    super(name, age, address, phoneNum, year, title, building);
    m_hourly_salary = hourlySalary;
  }

  //accessor
  public int getHourlySalary() {
    return m_hourly_salary;
  }

  //mutator
  public void setHourlySalary(int hourlySalary) {
    m_hourly_salary = hourlySalary;
  }

  //copy constructor
  // public PartTimeStaff(PartTimeStaff p) {
  //   super(p.getName(), p.getAge(), p.getAddress(), p.getPhoneNum(), p.getYear());
  //   this.m_hourly_salary = p.getHourlySalary();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, ", m_hourly_salary));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format("%d, ", m_hourly_salary);
    // ret += "\nHourly Salary: " + m_hourly_salary;

    return ret;
  }
}
