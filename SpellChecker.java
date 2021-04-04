/*
 * Meghna Raswan
*/

import java.io.*;
import java.util.*;

public class SpellChecker implements Runnable{

  private String m_fileName;

  public SpellChecker() {
    m_fileName = "file.txt";
  }

  public SpellChecker(String file) {
    m_fileName = file;
  }

  public void setID(int file){
    m_fileName = file;
  }
  public int getID(){
    return m_fileName;
  }

  public static void createSet() {
    br = new BufferedReader(new FileReader(words.txt));
    while (br.readLine() != null)
      words.add(br.readLine());
  }

  public void run() {
    HashSet<String> fileText = new HashSet();
    br = new BufferedReader(new FileReader(m_fileName));
    String[] newArray = br.split(" ", 5);
  }

  public static void main(String[] args) {
    BufferedReader br = null;
    HashSet<String> words = new HashSet();
    createSet();

    try {
      for (int i = 0; i < args.length; i++) {
        SpellChecker s = new SpellChecker(args[i]);
        Thread t = new Thread(s);
        t.start();
      }
    }
    catch(FileNotFoundException e) {
      System.err.println("File not found");
    }
    catch(IOException e) {
      System.err.println("Read Error!");
    }
  }
}
