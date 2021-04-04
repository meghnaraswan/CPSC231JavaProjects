import java.util.Scanner

public class CountVowel {
    static boolean Vowel(char c){
      c = Character.toUpperCase(c);
      return (c =='A' || c =='E' || c =='I' || c =='O' || c =='U');
    }
    static int countVowels(String n){
      int count = 0;
      for (int i = 0; i < n.length(); i++){
        if (Vowel(n.charAt(i))){
          ++count;
        }
      }
      return count;
    }

    public static void main(String args[])
    {
        Scanner string = new Scanner(System.in);
        String word = string.nextLine();
        System.out.println(countVowels(str));
    }
}
