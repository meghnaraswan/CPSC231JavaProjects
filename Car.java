public class Car {
  private int m_hp;
  private String m_make;
  private String m_model;
  private double m_weight;

  public static final String SOUND = "Honk!";

  private static int instanceCount = 0;

  //default constructor
  public Car(){
    m_hp = 0;
    m_make = "";
    m_model = "";
    m_weight = 0.0;
    instanceCount++;
  }

  //overloaded constructors
  public Car(String mk, String md, int hp, double wt){
    m_make = mk;
    m_model = md;
    m_hp = hp;
    m_weight = wt;
    instanceCount++;
  }

  public Car(String mk, String md){
    m_make = mk;
    m_model = md;
    m_hp = 0;
    m_weight = 0.0;
    instanceCount++;
  }

  public String getMake(){
    return m_make;
  }
  public String getModel(){
    return m_model;
  }
  public int getHP(){
    return m_hp;
  }
  public double getWeight(){
    return m_weight;
  }

  public void setMake(String mk){
    m_make = mk;
  }
  public void setModel(String md){
    m_model = md;
  }
  public void setHP(int hp){
    m_hp = hp;
  }
  public void setWeight(double wt){
    m_weight = wt;
  }

  public boolean isFast(){
    boolean fast = false;
    if(m_hp >= 500){
      fast = true;
    }
    return fast;
  }

  //override
  public String toString(){
    String ret = "Make: " + m_make;
    ret += "\nModel: " + m_model;
    ret += "\nHP: " + m_hp;
    ret += "\nWeight: " + m_weight;
    return ret;
  }

  public boolean equals(Object o){
    if(! (o instanceof Car)){
      return false;
    }
    Car c = (Car) o;
    boolean ret = true;
    if(!m_make.equals(c.getMake())){
      ret = false;
    }
    if(!m_model.equals(c.getModel())){
      ret = false;
    }
    return ret;

  }

  public static void main(String[] args){
    Car c1 = new Car("Ferrari","488",650,3000.0);
    Car c2 = new Car("Fiat","500e",2,100.5);
    Car c3 = new Car("Ferrari","488",650,3000.0);
    Dog d1 = new Dog();

    if(c1.equals(c3)){
      System.out.println("The Ferraris are equal");
    }


  }



}
