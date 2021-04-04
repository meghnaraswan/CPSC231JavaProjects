public class FullProfessor extends Faculty{
  private int m_yrs_until_retirement;

  public FullProfessor() {
    super();
    m_yrs_until_retirement = -1;
  }

//overloaded constructor
  public FullProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsUntilRetirement) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_until_retirement = yrsUntilRetirement;
  }

  //accessor
  public int getYrsUntilTenure() {
    return m_yrs_until_retirement;
  }

  //mutator
  public void setYrsUntilTenure(int yrsUntilRetirement) {
    m_yrs_until_retirement = yrsUntilRetirement;
  }

  //copy constructor
  // public FullProfessor(FullProfessor a) {
  //   super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getYear());
  //   this.m_yrs_until_tenure = a.getYrsUntilTenure();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, ", m_yrs_until_retirement));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nYears Until Retriement: " + m_yrs_until_retirement;
    ret += String.format("%d, ", m_yrs_until_retirement);
    return ret;
  }
}
