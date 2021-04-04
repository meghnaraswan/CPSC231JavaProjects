/**
 *  A class that stores information about a grad student
 */

public class GraduateStudent extends Student{
  //member variables
  private int m_num_papers_published; //represents number of papers grad student published
  private String m_thesis_advisor; //represents grad student thesis advisor

  /** Default constructor initializing all of the info of a grad student
  */
  public GraduateStudent() {
    super();
    m_num_papers_published = -1;
    m_thesis_advisor = "";
  }

  /** Overloaded faculty constructor
  * @param name String representing the name of person
  * @param age int representing age of person
  * @param address String representing the address of person
  * @param phoneNum String representing the phone number of person
  * @param year int representing the number of years person has been at Chapman
  * @param major String representing student major
  * @param minor String representing student minor
  * @param classStanding String representing student class standing
  * @param numPapersPublished int representing grad student number of papers published
  * @param thesisAdvisor String representing grad student thesis advisor
  */
  public GraduateStudent(String name, int age, String address, String phoneNum, int year, String major, String minor, String classStanding, int numPapersPublished, String thesisAdvisor) {
    super(name, age, address, phoneNum, year, major, minor, classStanding);
    m_num_papers_published = numPapersPublished;
    m_thesis_advisor = thesisAdvisor;
  }

  /**
  * Accessor for number of papers grad student published
  * @return an int value of m_num_papers_published
  */
  public int getNumPapersPublished() {
    return m_num_papers_published;
  }

  /**
  * Accessor for grad student thesis advisor
  * @return an String value of m_thesis_advisor
  */
  public String getThesisAdvisor() {
    return m_thesis_advisor;
  }

  /**
  * Mutator for number of papers grad student published
  * @param numPapersPublished int representing number of papers grad student published
  */
  public void setNumPapersPublished(int numPapersPublished) {
    m_num_papers_published = numPapersPublished;
  }

  /**
  * Mutator for grad student thesis advisor
  * @param thesisAdvisor int representing grad student thesis advisor
  */
  public void setThesisAdvisor(String thesisAdvisor) {
    m_thesis_advisor = thesisAdvisor;
  }

  /**
  * print method derived from Printable interface
  */
  public void print(){
    System.out.println(this.toString());
  }

  /**
  * toString method to format the grad studnet's information correctly,
  * deriving from Student and Affiliate classes
  */
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    // ret += "\nNumber of Papers Published: " + m_num_papers_published;
    // ret += "\nThesis Advisor: " + m_thesis_advisor;
    ret += String.format(",%d,%s", m_num_papers_published, m_thesis_advisor);
    return ret;
  }
}
