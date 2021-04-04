public class Person{
  protected String m_name;
  protected int m_ssn;
  protected String m_bday;
  protected boolean m_hsGrad;

  public Person(){
    m_name = "";
    m_ssn = -1;
    m_bday = "";
    m_hsGrad = true;
  }

  public Person(String n, int ssn, String bd, boolean hs){
    m_name = n;
    m_ssn = ssn;
    m_bday = bd;
    m_hsGrad = hs;

  }

  public Person(Person p){
    this.m_name = p.m_name;
    this.m_ssn = p.m_ssn;
    this.m_bday = p.m_bday;
    this.m_hsGrad = p.m_hsGrad;
  }

  public String getName(){
    return m_name;
  }
  public boolean hasDiploma(){
    return m_hsGrad;
  }
  public int getSSN(){
    return m_ssn;
  }

  public String toString(){
    String ret = "";
    ret += "Name: " + m_name;
    ret += "\nSSN: " + m_ssn;
    ret += "\nBday: " + m_bday;
    ret += "\nGraduated: " + m_hsGrad;
    return ret;
  }

  public boolean equals(Object o){
    if(!(o instanceof Person)){
      return false;
    }
    Person p = (Person) o;
    return (this.m_ssn ==  p.m_ssn);
  }

  public static void main(String[] args){
    Person p1 = new Person("Erik",123,"June 22", true);
    Person p2 = new Person("Elmer",1234,"August 13",true);
    Person p3 = new Person(p1);
    System.out.println(p1);
    System.out.println(p2);
    System.out.println(p3);
    System.out.println(p1.equals(p3));
  }

}
