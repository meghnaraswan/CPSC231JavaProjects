public class RecursionDemo{
  public static int fib(int n){
    int ret = 0;
    if(n==0){
      ret = 0;
    } else if(n==1){
      ret = 1;
    } else {
      ret =  (fib(n-1) + fib(n-2));
    }
    return ret;
  }
  public static void main(String[] args){
    int n = Integer.parseInt(args[0]);
    System.out.println(RecursionDemo.fib(n));
  }
}
