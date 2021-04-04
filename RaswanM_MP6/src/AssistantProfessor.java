public class AssistantProfessor extends Faculty{
  private int m_yrs_until_tenure;

  public AssistantProfessor() {
    super();
    m_yrs_until_tenure = -1;
  }

//overloaded constructor
  public AssistantProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsUntilTenure) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_until_tenure = yrsUntilTenure;
  }

  //accessor
  public int getYrsUntilTenure() {
    return m_yrs_until_tenure;
  }

  //mutator
  public void setYrsUntilTenure(int yrsUntilTenure) {
    m_yrs_until_tenure = yrsUntilTenure;
  }

  //copy constructor
  // public AssistantProfessor(AssistantProfessor a) {
  //   super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getYear());
  //   this.m_yrs_until_tenure = a.getYrsUntilTenure();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, ", m_yrs_until_tenure));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += String.format("%d, ", m_yrs_until_tenure);
    // ret += "\nYears Until Tenure: " + m_yrs_until_tenure;
    return ret;
  }
}
