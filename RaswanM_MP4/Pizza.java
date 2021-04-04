/**
 *  A class that stores information about a single pizza, such as its size,
 *  number of cheese, pepperoni, and veggie toppings
 * @author Meghna Raswan
 */

public class Pizza {
  /**A String representing the size of the pizza*/
  private String m_size;
  /**An int representing the number of cheese toppings*/
  private int m_cheese;
  /**An int representing the number of pepperoni toppings*/
  private int m_pepperoni;
  /**An int representing the number of veggie toppings*/
  private int m_veggie;

  /** This is the default constructor initializing all fields/size/number
  * of toppings to an empty string and 0
  */
  public Pizza() {
    m_size = "";
    m_cheese = 0;
    m_pepperoni = 0;
    m_veggie = 0;
  }

  /** Overloaded pizza constructor
  * @param size String representing the size of the pizza. it's a string "small", "medium". "larger"
  * @param cheese int representing the number of cheese toppings
  * @param pepperoni int representing the number of pepperoni toppings
  * @param veggie int representing the number of veggie toppings
  */
  public Pizza(String size, int cheese, int pepperoni, int veggie) {
    m_size = size;
    m_cheese = cheese;
    m_pepperoni = pepperoni;
    m_veggie = veggie;
  }

  /** Copy constructor
  * @param p the pizza to copy
  */
  public Pizza(Pizza p){
    this.m_size = p.m_size;
    this.m_cheese = p.m_cheese;
    this.m_pepperoni = p.m_pepperoni;
    this.m_veggie = p.m_veggie;
  }

  /**
  * Accessor for the size of the pizza
  * @return a double value of m_size
  */
  public String getSize(){
    return m_size;
  }

  /**
  * Mutator for the size of the pizza
  * @param size String representing the size
  */
  public void setSize(String size){
    m_size = size;
  }

  /**
  * Accessor for the number of cheese toppings for the pizza
  * @return an int value of m_cheese
  */
  public int getCheese(){
    return m_cheese;
  }

  /**
  * Mutator for the number of cheese toppings for the pizza
  * @param cheese String representing the number of cheese toppings
  */
  public void setCheese(int cheese){
    m_cheese = cheese;
  }

  /**
  * Accessor for the number of pepperoni toppings for the pizza
  * @return an int value of m_pepperoni
  */
  public int getPepperoni(){
    return m_pepperoni;
  }

  /**
  * Mutator for the number of pepperoni toppings for the pizza
  * @param pepperoni String representing the number of pepperoni toppings
  */
  public void setPepperoni(int pepperoni){
    m_pepperoni = pepperoni;
  }

  /**
  * Accessor for the number of veggie toppings for the pizza
  * @return an int value of m_veggie
  */
  public int getVeggie(){
    return m_veggie;
  }

  /**
  * Mutator for the number of veggie toppings for the pizza
  * @param veggie String representing the number of veggie toppings
  */
  public void setVeggie(int veggie){
    m_veggie = veggie;
  }

  /**
  * A public method that returns a double that is the cost of the pizza.
  * @return a double value representing the total cost of the pizza.
  */
  public double calcCost() {
    double totalCost = 0.0;
    if (m_size == "small"){
      totalCost += (2 * (double)m_cheese) + (2 * (double)m_pepperoni) + (2 * (double)m_veggie) + 10;
    }
    else if (m_size == "medium"){
      totalCost += (2 * (double)m_cheese) + (2 * (double)m_pepperoni) + (2 * (double)m_veggie) + 12;
    }
    else if (m_size == "large"){
      totalCost += (2 * (double)m_cheese) + (2 * (double)m_pepperoni) + (2 * (double)m_veggie) + 14;
    }
    return totalCost;
  }

  /** Creates a string representation of the pizza's information
  * @return A formatted string containing the pizza size, quantity of each
  * topping, and the pizza cost
  */
  public String toString() {
    double cost = calcCost(); //call the calcCost() method and assign it as a varible named cost
    return String.format("a %s pizza with %d cheese toppings, %d pepperoni toppings, and %d veggie toppings with a cost of %.2f dollars.", m_size, m_cheese, m_pepperoni, m_veggie, cost);
  }
}
