public class GraduateStudent extends Student{
  private int m_num_papers_published;
  private String m_thesis_advisor;

  public GraduateStudent() {
    super();
    m_num_papers_published = -1;
    m_thesis_advisor = "";
  }

//overloaded constructor
  public GraduateStudent(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding, int numPapersPublished, String thesisAdvisor) {
    super(name, age, address, phoneNum, year, major, minor, classStanding);
    m_num_papers_published = numPapersPublished;
    m_thesis_advisor = thesisAdvisor;
  }

  //accessor
  public int getNumPapersPublished() {
    return m_num_papers_published;
  }

  public String getThesisAdvisor() {
    return m_thesis_advisor;
  }

  //mutator
  public void setNumPapersPublished(int numPapersPublished) {
    m_num_papers_published = numPapersPublished;
  }

  public void setThesisAdvisor(String thesisAdvisor) {
    m_thesis_advisor = thesisAdvisor;
  }

  //copy constructor
  // public GraduateStudent(GraduateStudent g) {
  //   super(g.getName(), g.getAge(), g.getAddress(), g.getPhoneNum(), g.getYear());
  //   this.m_num_papers_published = g.getNumPapersPublished();
  //   this.m_thesis_advisor = g.getThesisAdvisor();
  // }

  public void print(){
    // super.print();
    // System.out.println(String.format("%d, %s, ", m_num_papers_published, m_thesis_advisor));
    System.out.println(this.toString());
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nNumber of Papers Published: " + m_num_papers_published;
    // ret += "\nThesis Advisor: " + m_thesis_advisor;
    ret += String.format("%d, %s, ", m_num_papers_published, m_thesis_advisor);
    return ret;
  }
}
