import java.io.*;

public class FileNumbers{
  public static void main(String[] args){

    //Writing out to a file

    try{
      PrintWriter pw = new PrintWriter(new FileWriter("Numbers.txt"));//when putting it to true, it will write the data on the file twice
      for(int i = 0; i < 20; ++i){
        double rand = Math.random() * 100;
        pw.println(rand);
      }
      pw.close();
    }
    catch(IOException e){
      System.err.println("Crap!");
      e.printStackTrace();
    }

    //Read in from File
    try{
      BufferedReader br = new BufferedReader(new FileReader("Numbers.txt"));
      String line = "";
      System.out.println("This is the contents of the file: ");
      double sum = 0;
      int count = 0;
      while((line = br.readLine()) != null){
        sum += Double.parseDouble(line);
        ++count;
      }
      System.out.println("The mean is: " + sum/count);
      br.close();
    }
    catch(FileNotFoundException f){
      f.printStackTrace();
    }
    catch(IOException io){
      io.printStackTrace();
    }
  }
}
