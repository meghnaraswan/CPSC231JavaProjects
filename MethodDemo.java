public class MethodDemo{
  public static int[] findPunctuationPos(String s){
    int[] arr = new int[s.length()];
    int currIndex = 0;
    for(int i = 0; i < s.length(); ++i){
      switch(s.charAt(i)){
        case ' ':
        case '.':
        case '?':
        case '!':
        case ';':
        case ',':
          arr[currIndex++] = i;
          break;
        default:
      }

    }
    arr[currIndex] = -1;
    return arr;

  }

  public static void main(String[] args){
    String s = "This is, my friend, an example!";
    int[] result = MethodDemo.findPunctuationPos(s);
    int i = 0;
    while(result[i]!=-1){
      System.out.println(result[i++]);
    }

  }

}
