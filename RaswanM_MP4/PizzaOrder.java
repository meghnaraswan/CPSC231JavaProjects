/**
 *  A class that stores information about an order of multiple pizzas
 * @author Meghna Raswan
 */

import java.util.ArrayList;

public class PizzaOrder {
  /**An array representing the individual orders of the pizzas, or objects*/
  private ArrayList<Pizza> m_order = null;
  /**An int representing the number of pizzas*/
  private int m_numPizzas;
  /**An int representing the additional number of pizzas*/
  private int m_numPizzaAdded;

  /** This is the default constructor initializing all the array to 1 pizza order,
  * the same array as a small cheese pizza, 1 number of pizza, and 1 added pizza
  */
  public PizzaOrder() {
    m_order = new ArrayList<Pizza>(1);
    m_order.add(new Pizza("small", 1, 0, 0));
    m_numPizzas = 1;
    m_numPizzaAdded = 1;
  }

  /** Overloaded pizza order constructor
  * @param numPizzas int representing the number of pizzas the customer can order
  */
  public PizzaOrder(int numPizzas) {
    m_numPizzas = numPizzas;
    m_numPizzaAdded = 0; // the number of pizzas added is 0 because the customer hasn't added any pizza orders yet
    m_order = new ArrayList<Pizza>(numPizzas); // the array will consist of numPizzas, as the number of pizzas they can order
  }

  /**
  * A public method that adds new pizza orders, or objects, in the m_order array
  * @param pizza Pizza representing the Pizza class, which will be added to
  * the PizzaOrder’s order member variable
  * @return an int value of retVal, which returns either 1 for a successful order or -1 for an unsuccessful order
  */
  public int addPizza(Pizza pizza){
    int retVal = -1; //initializing the return value
    if(m_numPizzaAdded == m_numPizzas) { //if the number of added pizzas is equal to the number of pizzas ordered, then the return value is -1
      retVal = -1;
    }
    else { //otherwise, the number of pizzas added will create another object of the pizza order into the m_order array
      m_order.add(m_numPizzaAdded, pizza); // this adds m_numPizzaAdded to a specific index
      m_numPizzaAdded++; //after adding the pizza order into the array, the m_numPizzaAdded will increase by 1 value
      retVal = 1; //return 1 for a successful order
    }
    return retVal;
  }

  /**
  * A public method that returns a double that is the total cost of all of the pizza orders
  * @return a double value representing the total cost of the pizzas
  */
  public double calcTotal() {
    double totalCost = 0.0; //initializing the total cost to 0.0
    for (int i = 0; i < m_order.size(); ++i) { //for every position in the array, m_order, from 0 to the size of m_order, add the current object's pizza order to the previous pizza orders
         Pizza currPizza = m_order.get(i); //returns the object at index i in the array
         totalCost += currPizza.calcCost(); //this calls the calcCost() method in the Pizza class to add the total cost with each pizza order's cost
    }
    return totalCost;
  }

  /** Creates a string representation of all of the pizza's information
  * @return A formatted string containing the information of all of the pizza
  * orders, the cost of each order, and the total cost of all of the pizza's together
  */
  public String toString() {
    String retVal = ""; //initializing retVal as an empty string
    retVal += String.format("The total cost of your order is: %.2f dollars\n", calcTotal()); //adding the information of the total cost of all of the pizzas to the empty string, retVal
    for (int i = 0; i < m_order.size(); ++i) { //for every position in the array, m_order, from 0 to the size of m_order, provide information about each pizza order, or object
         Pizza currPizza = m_order.get(i); //returns the object at index i in the array; it will not return unsuccessful orders because the unsuccessful orders were not added to the array
         retVal += String.format("Pizza #%d: %s\n", (i+1), currPizza.toString()); //adding the information of each pizza order, assigning them from 1 to the number of pizza orders, by calling the toString method from the Pozza class
    }
    return retVal;
  }
}
