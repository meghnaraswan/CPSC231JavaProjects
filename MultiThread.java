import java.util.*;
import java.io.*;
​
public class MultiThread implements Runnable{
​
  //public Scanner scan = new Scanner(System.in);
  private int m_tid;
  private HashSet<String> dictionary;
  //private static Object m_lock = new Object();
  private BufferedReader text = new BufferedReader();

  public MultiThread(){
    m_tid = -1;
  }
  public MultiThread(int id){
    m_tid = id;
  }
  public void setID(int id){
    m_tid = id;
  }
  public int getID(){
    return m_tid;
  }
​
  public MultiThread(){
    try{
      BufferedReader text = new BufferedReader(new FileReader("words.txt"));
      String word = "";
      while((word = text.readLine()) != null){
        dictionary.add(word);
      } catch(exception e){
        System.out.println("uh oh");
      }
    }
  }

  public static void createSet() {
    br = new BufferedReader(new FileReader("words.txt"));
    while (br.readLine() != null)
      words.add(br.readLine());
  }
​
  public void run(String txt){
    try{
      BufferedReader br = new BufferedReader(new FileReader(txt));
      String line = "";
      int count = 0;
      while((line = br.readLine()) != null){
        line.replaceAll("\\p{Punct}", "");
        String[] toks = line.split("\\s+");
        for(int i = 0; i < wordline.size(); i++){
          if(!dictionary.contains(wordline[i])){
            System.out.println(txt + ", " + count + ", " + wordline[i]);
          }
        }
        count++;
      }
    }
  }
  public static void main(String[] args) {
    BufferedReader br = null;
    HashSet<String> words = new HashSet();
    createSet();
    try{
      for (int i = 0; i < 3; i++) {
        SpellChecker s = new SpellChecker(args[i]);
      }
    }
    catch(FileNotFoundException e) {
      System.err.println("File not found");
    }
    catch(IOException e) {
      System.err.println("Read Error!");
    }

    MultiThread d1 = new MultiThread("File1.txt");
    MultiThread d2 = new MultiThread("File2.txt");
    MultiThread d3 = new MultiThread("File3.txt");
    Thread t1 = new Thread(d1);
    Thread t2 = new Thread(d2);
    Thread t3 = new Thread(d3);
    t1.start();
    t2.start();
    t3.start();
    try{
      t1.join();
      t2.join();
      t3.join();
    } catch(Exception e){
      e.printStackTrace();
    }
    System.out.println(MultiThread.getCount());
  }
}

//inputString.replaceAll("\\p{Punct}", ""); //This removes all punctuation from a string

//String[] toks = inputString.split("\\s+"); //returns the words in the line split by whitespace
