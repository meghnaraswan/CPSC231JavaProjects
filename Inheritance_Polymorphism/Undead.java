public class Undead extends Monster {
  protected int m_deathDate;

  //Deafault
  public Undead() {
    super();
    m_deathDate = 0;
  }

  //Overloaded
  public Undead(String name, String origin, int deathDate) {
    super(name, origin);
    m_deathDate = deathDate;
  }

  //Getters
  public int getDeathDate() {
    return m_deathDate;
  }

  //Setters
  public void setHeartTime(int deathDate) {
    m_deathDate = deathDate;
  }

  //Copy Constructor
  public Undead (Undead u) {
    super(u.getName(), u.getOrigin());
    m_deathDate = u.getDeathDate();
  }

  //toString
  @Override
  public String toString() {
    String ret = "";
    ret += super.toString();
    ret += "\n This undead had their heart stop during the year" + m_deathDate + ".";
    return ret;
  }

  //diet method
  @Override
  public String diet(){
    String favoriteFood = "Flesh";
    return favoriteFood;
  }

  //Speak
  @Override
  public String speak() {
    String ret = "I sleep enternally";
    return ret;
  }
}
