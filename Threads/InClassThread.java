// import java.util.HashSet;
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;
import java.util.*;
import java.io.*;

public class InClassThread implements Runnable{
  //Member Variables
  private String m_fileName;
  private HashSet<String> m_word_hash;
  private static Object m_lock = new Object();
  // private static HashSet<String> s_hs_output;
  //private String readFileName = "words.txt";

  //Constructors
  public InClassThread(String file, HashSet<String> hs){
    m_fileName = file;
    m_word_hash = hs;
  }

  public void setID(String file){
    m_fileName = file;
  }
  public String getID(){
    return m_fileName;
  }

  //Run Method
  public void run(){
    try{
      BufferedReader br = null;
      br = new BufferedReader(new FileReader(m_fileName));
      String currentThreadLine;
      int lineNum = 1;
      while((currentThreadLine = br.readLine()) != null){
        //String[] stringListOfCurrentLine = currentThreadLine.split();
        String[] toks = currentThreadLine.split("\\s+"); //returns the words in the line split by whitespace
        String currentWord = "";
        for(int j = 0; j < toks.length; ++j){
          currentWord = toks[j];
          currentWord.replaceAll("\\p{Punct}", ""); //This removes all punctuation from a string
          if(!(m_word_hash.contains(currentWord))){
            // synchronized(m_lock){
              // s_hs_output.add(currentWord);
              // file name, line number, and word.
              System.out.println(String.format("%s:%d %s",m_fileName,lineNum,currentWord));
            // }
            //System.out.println(currentWord);
          }
        }
        lineNum ++;
      } // End While
    } catch(FileNotFoundException e) {
      System.err.println("File not found");
    } catch(IOException e) {
      System.err.println("Read Error!");
    }
  }

  //java InClassThread File1.txt File2.txt File3.txt
  public static void main(String[] args){
    HashSet<String> hs_word_dictionary = new HashSet<String>();
    try {
      BufferedReader br = null;
      br = new BufferedReader(new FileReader("words.txt"));
      String currentLine;
      while((currentLine = br.readLine()) != null){
        hs_word_dictionary.add(currentLine);
      }
    } catch(FileNotFoundException e) {
      System.err.println("File not found");
    } catch(IOException e) {
      System.err.println("Read Error!");
    }

    //command line input
    for(int i = 0; i < args.length; ++i){
      System.out.println(args[i]);
      InClassThread d = new InClassThread(args[i], hs_word_dictionary);
      Thread t = new Thread(d);
      t.start();
      try{
        t.join();
      } catch(Exception e){
        e.printStackTrace();
      }
    }
  }
}
