import java.util.ArrayList;
public class Child extends Person{


  private boolean m_walking;
  private String m_schoolName;

  public Child(){
    super();
    m_hsGrad = false;
    m_walking = false;
    m_schoolName = "";
  }
  public Child(String n, int ssn, String bd, boolean hs, boolean w, String sn){
    super(n,ssn,bd,hs);
    m_walking = w;
    m_schoolName = sn;

  }

  @Override
  public String toString(){
    String ret = super.toString();
    ret += "\nWalking: " + m_walking;
    ret += "\nSchool: " + m_schoolName;
    return ret;
  }

  private void foo(){
    String n = getName();
    System.out.println(n);
  }

  public static void main(String[] args){
    Child c1 = new Child("Ruttiger",567,"June 1",false,true,"Orange ES");
    Child c2 = new Child("Homer",562,"Feb 1",false,true,"LA ES");
    Person p1 = new Person("Erik",123,"June 22", true);
    Person p2 = new Person("Elmer",1234,"August 13",true);
    Person p3 = new Person(p1);
    ArrayList<Person> al = new ArrayList<Person>();
    al.add(c1);
    al.add(c2);
    al.add(p1);
    al.add(p2);
    al.add(p3);
    for(int i = 0; i < al.size(); ++i){
      Person p = al.get(i);
      System.out.println(p);
    }
    Person x = new Child("Suzy",51,"June 11",false,true,"Riverside ES");
    System.out.println(x);
    System.out.println(x.getName());
    c2.foo();
  }



}
