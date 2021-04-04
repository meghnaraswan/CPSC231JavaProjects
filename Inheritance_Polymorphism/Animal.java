
public class Animal extends Monster {

  protected String m_species;

//default constructor
  public Animal() {
    super();
    m_species = "";
  }

//overloaded constructor
  public Animal(String n, String o, String s) {
    super(n,o);
    m_species = s;
  }

//copy constructor
  public Animal(Animal a) {
    super(a.getName(), a.getOrigin());
    this.m_species = a.getSpecies();
  }

//accessor
  public String getSpecies() {
    return m_species;
  }

//mutator
  public void setSpecies(String s) {
    m_species = s;
  }

//Methods to be overriden
  public String speak() {
    String ret = "Rawr";
    return ret;
  }
  public String diet() {
    String ret = "Animal";
    return ret;
  }

  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += "\nSpecies: " + m_species;
    return ret;
  }
}
