
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.io.IOException;


public class FunWithThreads implements Runnable{
  private static HashSet<String> m_wordSet = new HashSet<String>();
  private String m_textFile;
  private int m_lineNumber;

  public FunWithThreads(){
    m_textFile = "";
    m_lineNumber = 1;
  }

  public FunWithThreads(String textFile){
    m_textFile = textFile;
    m_lineNumber = 1;
  }

  public HashSet<String> getWordSet(){
    return m_wordSet;
  }

  private static void createSet(String fileName){
    BufferedReader br = null;
    try{
      br = new BufferedReader(new FileReader(fileName));
      String currentLine;
      while((currentLine = br.readLine()) != null){
        m_wordSet.add(currentLine);
      }
    }catch(Exception e){
      System.err.println("Read error!");
      System.err.println(e.getMessage());
    }finally{
      try{
        System.out.println("Word set complete. Total words: " + m_wordSet.size());
        br.close();
      }catch(IOException e){
        e.printStackTrace();
      }

    }
  }

  private void processLine(String s){
    String[] words = s.toLowerCase().trim().split("\\s+");
    for(String word:words){
       word = word.replaceAll("\\W+","");
      if (!word.equals("")&&!m_wordSet.contains(word)){
        System.out.println("File name: " + m_textFile + " | line number: " + m_lineNumber + " | misspelled word: " + word);
      }
    }
    m_lineNumber++;
  }

  public void run(){
    BufferedReader br = null;
    try{
      br = new BufferedReader(new FileReader(m_textFile));
      String currentLine;
      while((currentLine = br.readLine()) != null){
        processLine(currentLine.trim());
      }
    }catch(Exception e){
      System.err.println("Read error!");
      System.err.println(e.getMessage());
    }finally{
      try{
        System.out.println(m_textFile + " processing complete.");
        br.close();
      }catch(IOException e){
        e.printStackTrace();
      }
    }
  }


  public static void main(String[] args){
    FunWithThreads.createSet("words.txt");
    for(int i = 0; i < args.length; ++i){
      FunWithThreads demo = new FunWithThreads(args[i]); //better name??
      Thread t = new Thread(demo);
      t.start();
      try{
        t.join();
      } catch (InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
