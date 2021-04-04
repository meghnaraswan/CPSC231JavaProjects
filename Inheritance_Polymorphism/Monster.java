public class Monster {

  protected String m_name;
  protected String m_origin;

//constructor
  public Monster() {
    m_name = "";
    m_origin = "";
  }
//overloaded constructor
  public Monster(String n, String o) {
    m_name = n;
    m_origin = o;
  }
//copy constructor
  public Monster(Monster m) {
    this.m_name = m.m_name;
    this.m_origin = m.m_origin;
  }
//accessors
  public String getName() {
    return m_name;
  }
  public String getOrigin() {
    return m_origin;
  }

//mutators
  public void setName(String n) {
    m_name = n;
  }
  public void setOrigin(String o) {
    m_origin = o;
  }

//methods to be overridden
  public String speak() {
    String ret = "noise";
    return ret;
  }
  public String diet() {
    String ret = "food";
    return ret;
  }

//toString
  public String toString() {
    String ret = "";
    ret += "Name: " + m_name;
    ret += "\nOrigin: " + m_origin;
    return ret;
  }
//equal
  public boolean equals(Object o) {
    if(!(o instanceof Monster)) {
      return false;
    }
    Monster m = (Monster)o;
    if (this.m_name.equals(m.m_name) && (this.m_origin.equals(m.m_origin))) {
      return true;
    }
    else {
      return false;
    }
  }

}
