import java.util.Random;

public class LoopDemo{
  public static void main(String[] args){
    // int i = 0;
    // while(i < 10){
    //   System.out.prinln(i);
    //   ++i;

    // boolean keepGoing = true;
    // int j = 0;
    // while(keepGoing){
    //   System.out.println("Hello!");
    //   ++j;
    //   if(j == 100){
    //     break;
    //   }
    // }

    // boolean keepGoing = true;
    // int j = 0;
    // while(keepGoing){
    //   int k = 0;
    //   System.out.println("Hello!");
    //   ++j;
    //   if(j == 100){
    //     break;
    //   }
    //   ++k
    //   System.out.println(k);
    // }
    // System.out.println(j);

    // for(int i = 0; i < 10; ++i){
    //   System.out.println(i);
    // }

    // for(int i = 0; i < n; ++i){
    //   for(int j = 0; j < n; ++j){
    //     System.out.println("Hello!");
    // }

    // for(int i = 0; i < 100; ++i){
    //   if(i % 2 == 0){
    //     continue;
    //   }
    //   System.out.println(i);
    // }

    // for(int i = 0; i <= 100; i *= 3){
    //   System.out.println(i);
    // }

    // int i = 20;
    // do{
    //   System.out.println("Hello!");
    //   ++i;
    // } while (i < 50);

    for(int i = 0; i < 9; i++){
      int randomInt = (int)(10.0 * Math.random());
      System.out.println("pseudo random int between 1 and 10 : " + randomInt );
    }

  }
}
