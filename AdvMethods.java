public class AdvMethods{
  //return true if a>b, false otherwise
  public static boolean greater(int a, int b){
    return (a > b);
  }
  public static boolean greater(double a, double b){
    return (a > b);
  }
  public static boolean greater(char a, char b){
    return (a > b);
  }
  public static int max(int a, int b){
    int maxV = a;
    if (a > b){
      maxV = a;
    }
    return maxV;
  }
  public static int max(int a, int b, int c){
    return max(max(a, b), c);
  }
  public static void hello(String fname, String lname){
    System.out.println("Hello " + fname + " " + lname + "!");
  }
  public static void increment(int x){
    ++x
  }
  public static void increment(int[] arr){
    for(int i = 0; i < arr.length; ++i){
      arr[i] = arr[i] +1;
    }
  }
  public static void main(String[] args){
    // System.out.println(AdvMethods.greater(2, 4));
    // System.out.println(AdvMethods.greater(6.0, 4.0));
    // System.out.println(AdvMethods.greater('e', 'a'));
    //
    // System.out.println(AdvMethods.max(10, 16));
    // System.out.println(AdvMethods.max(21, 10, 16));
    // AdvMethods.hello("Meghna", "Raswan");
    // int b = 21;
    // AdvMethods.increment(b);
    // System.out.println(b);
    // int [] arr = {2,4,6};
    // for(int i = 0; i < arr.length; ++i){
    //   System.out.println(arr[i]);
    // }
    // AdvMethods.increment()

    // System.out.println("The length is: " + args.length);
    // int sum = 0;
    // for(int i = 0; i < args.length; ++i){
    //   sum += Integer.parseInt(args[i]);
    // }
    // System.out.println(sum);

    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]);
    System.out.println(max(a,b));


  }
}
