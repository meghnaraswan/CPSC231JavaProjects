public class Zombie extends Undead{
  //by David Zhang, Jack Pauly, Jordan Bruce, Christopher Carlton
  private String m_favWeapon; //member for fav Weapon
  //Default Constructor
  public Zombie(){ //defaults fav weapon to bat, super is used becuase it is subclass
    super();
    m_favWeapon="Bat";
  }
  //Overloaded Constructor
  public Zombie(String name, String origin, int yearDead, String m_favWeapon){
    super(name, origin, yearDead);
    this.m_favWeapon=m_favWeapon;
  }
  /**Copy Constructor */
  public Zombie(Zombie z){
    super(z.getName(), z.getOrigin(), z.getDeathDate());
    this.m_favWeapon=z.m_favWeapon;
  }
  public String speak(){ //method for zombie speak
    String ret = "Ugggggghhhhhhh";
    return ret;
  }
  public String diet(){ //method for diet
    String favoriteFood = "Hello, good sir. I feast on brains";
    return favoriteFood;
  }
  public String getWeapon(){return m_favWeapon;} //accessor
  public boolean equals(Zombie z){//see if inheritance matches the super
    if( super.equals(z) && ( m_favWeapon==z.m_favWeapon ) ){
      return true;
    }else{
      return false;
    }
  }
  public String toString(){ //to string method
    String str="";
    str+=super.toString();
    str+="\nFavorite Weapon: "+m_favWeapon;
    return str;
  }
}
