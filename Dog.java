public class Dog{

  private String m_color;
  private int m_age;
  private double m_weight;
  private String m_breed;
  private String m_name;

  public final static int CONVERSION_FACTOR = 7;

  //default constructor
  public Dog(){
    m_color = "";
    m_age = 0;
    m_weight = 0.0;
    m_breed = "";
    m_name = "";
  }

  //overloaded constructors
  public Dog(String c, int a, double w, String b, String n){
    m_color = c;
    m_age = a;
    m_weight = w;
    m_breed = b;
    m_name = n;
  }

  public Dog(String c, String n){
    m_color = c;
    m_age = 0;
    m_weight = 0.0;
    m_breed = "";
    m_name = n;
  }

  //accessor
  public String getColor(){
    return m_color;
  }

  public String getName(){
    return m_name;
  }

  public int getAge(){
    return m_age;
  }

  //mutators
  public void setName(String n){
    m_name = n;
  }
  public void setAge(int a){
    m_age = a;
  }
  public void setWeight(double w){
    m_weight = w;
  }

  //methods
  public void sayHello(){
    System.out.println("Bark, my name is " + m_name);
  }

  public int getAgeInDogYears(){
    return m_age * CONVERSION_FACTOR;
  }

  public void printKeyInfo(){
    System.out.println("My name is " + m_name);
    System.out.println("I am " + m_age + " years old");
    System.out.println("I weigh " + m_weight + " pounds");
  }

  public static void main(String[] args){
    Dog d1 = new Dog(); //instance of dog
    Dog d2 = new Dog("black",4,25.0,"Lab","Bucky"); //instance of dog
    d1.setName("Fred");
    d1.setAge(20);

    System.out.println(d1.getName());
    System.out.println(d1.getAge());
    System.out.println(d2.getAge());

    d1.sayHello();
    d2.sayHello();

    int d1DYAge = d1.getAgeInDogYears();
    System.out.println(d1.getName() + " age in dog years: " + d1DYAge);
    d2.printKeyInfo();



  }


}
