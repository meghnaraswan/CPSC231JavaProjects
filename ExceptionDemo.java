//In Java, all exception and error implement Throwable
//2 main types of Throwable = Exception and Error
//Exception - pssibly recoerable
//Error - catastrophic (clean up and shut down)
//2 types of xceptions:
//Checked - have to be caught or declared to be thrown
//Unchecked - extend RuntimeExceptions - don't have to be caught
import java.util.*;

class CPSC231Exception extends Exception{
  public CPSC231Exception(){
    super();
  }
  public CPSC231Exception(String errorMsg){
    super(errorMsg);
  }
}

class CPSC231Exception2 extends Exception{
  public CPSC231Exception2(){
    super();
  }
  public CPSC231Exception2(String errorMsg){
    super(errorMsg);
  }
}

public class ExceptionDemo{
  public double calculate() throws CPSC231Exception, CPSC231Exception2{
    Scanner sin = new Scanner(System.in);
    double d = 0.0;
    //blah
    d = sin.nextDouble();
    if(d > 250){ //exception
      throw new CPSC231Exception("Value greater than 250");
    }
    if(d < 90){ //exception
      throw new CPSC231Exception("Value less than 250");
    }
    return d;
  }

  public void doStuff() throws CPSC231Exception, CPSC231Exception2{
    calculate();
  }

  public static void main(String[] args){
    ExceptionDemo e = new ExceptionDemo();
    try{
      double x = e.caclulate();
      System.out.println(x);
    }
    catch(CPSC231Exception i){
      System.err.println("There was a 231 exception!");
      i.printStackTrace();
    }
    catch(CPSC231Exception2 i){
      System.err.println("There was a 231-2 exception!");
      i.printStackTrace();
    }
    finally{ //guaranteed to execute
      System.out.println("Thanks for playing!");
    }
  }
}
