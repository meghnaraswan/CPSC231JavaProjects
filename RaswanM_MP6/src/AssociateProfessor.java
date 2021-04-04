public class AssociateProfessor extends Faculty{
  private int m_yrs_since_tenure;

  public AssociateProfessor() {
    super();
    m_yrs_since_tenure = -1;
  }

//overloaded constructor
  public AssociateProfessor(String name, int age, String address, String phoneNum, int year, String department, int yearlySalary, int numPapers, int yrsSinceTenure) {
    super(name, age, address, phoneNum, year, department, yearlySalary, numPapers);
    m_yrs_since_tenure = yrsSinceTenure;
  }

  //accessor
  public int getYrsSinceTenure() {
    return m_yrs_since_tenure;
  }

  //mutator
  public void setYrsSinceTenure(int yrsSinceTenure) {
    m_yrs_since_tenure = yrsSinceTenure;
  }

  //copy constructor
  // public AssociateProfessor(AssociateProfessor a) {
  //   super(a.getName(), a.getAge(), a.getAddress(), a.getPhoneNum(), a.getYear());
  //   this.m_yrs_since_tenure = a.getYrsSinceTenure();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, ", m_yrs_since_tenure));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nYears Since Tenure: " + m_yrs_since_tenure;
    ret += String.format("%d, ", m_yrs_since_tenure);
    return ret;
  }
}
