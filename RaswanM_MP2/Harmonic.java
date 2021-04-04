//Harmonic.java

public class Harmonic {

  //this is a public method that returns the value of the nth harmonic using iteration (a loop)
  public static double calcIterativeHarmonic(int n) { //pass the the nth term as a parameter
    double harmonic = 0.0; //initializing the harmonic value
    for(int i = 1; i <= n; ++i){ //for loop for values from 1, incrementing by 1 each time the agument was passed, all the way to n
      harmonic += (1 / (double)i); //the harmonic value adds itself to 1/i, reassigning itself with the added number each time until the nth number; we have to convert the 1/i to a double so that the harmonic variable can add the 1/i
    }
    return harmonic; //this returns the harmonic value for the nth number
  }

  //this is a public method that returns the value of the nth harmonic using recursion, which is a method that calls itself
  public static double calcRecursiveHarmonic(int n) { //pass the the nth term as a parameter
    if(n == 1) { //if n == 1, return 1 because 1/1 = 1
      return 1;
    }
    else { //otherwise, find the harmonic value of the nth term by starting with 1/n, and adding itself with 1/(n-1) until it reaches 1;; we have to convert the 1/i to a double so that the harmonic variable can add the 1/i
      return ((1 / (double)n) + (calcRecursiveHarmonic(n - 1)));
    }
  }

  public static void main(String[] args) {

    //execute harmonic the first 20 harmonic values using both iteration and recursion
    int x = 20;
    System.out.println("Harmonic numbers using iteration:");
    for(int i = 1; i <= x; i++) { //for loop to execute the harmonic values from 1 to the nth value, wich is 20
      System.out.println(Harmonic.calcIterativeHarmonic(i)); //calls the calcIterativeHarmonic method on Harmonic, passing i as a parameter up from values between 1 and 20
    }

    System.out.println();

    System.out.println("Harmonic numbers using recursion:");
      for(int i = 1; i <= x; i++) { //for loop to execute the harmonic values from 1 to the nth value, wich is 20
    System.out.println(Harmonic.calcRecursiveHarmonic(i)); //calls the calcIterativeHarmonic method on Harmonic, passing i as a parameter up from values between 1 and 20
    }

  }
}
