import java.util.*;
import java.io.*;

public class Wordcheck implements Runnable{

  public Scanner scan = new Scanner(System.in);
  private HashSet<String> dictionary;

  public Wordcheck(){
    try{
      BufferedReader inp = new BufferedReader(new FileReader("words.txt"));
      String word = "";
      while((word=inp.readLine())!=null){
        dictionary.add(word);
      }
      catch(exception e){
        System.out.println("uh oh");
      }
    }
  }

  public void load(String txt){
    try{
      BufferedReader br = new BufferedReader(new FileReader(txt));
      String line = "";
      int count = 0;
      while((line=br.readLine())!=null){
        line.replaceAll("\\p{Punct}", "");
        String[] toks = line.split("\\s+");
        for(int i = 0; i<wordline.size(); i++){
          if(!dictionary.contains(wordline[i])){
            System.out.println(txt+", "+count+", "+wordline[i]);
          }
        }
        count++;
      }
    }
  }
}
