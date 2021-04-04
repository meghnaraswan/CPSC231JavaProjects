import java.io.*;

public class FileDemo{
  public static void main(String[] args){
    System.out.println("Hello, World");

    //Writing out to a file

    // try{
    //   PrintWriter pw = new PrintWriter(new FileWriter("Demo.txt",true));//when putting it to true, it will write the data on the file twice
    //   pw.println("Meghna");
    //   pw.println(18);
    //   pw.println(3.141592654);
    //   pw.close();
    // }
    // catch(IOException e){
    //   System.err.println("Crap!");
    //   e.printStackTrace();
    // }

    //Read in from File
    try{
      BufferedReader br = new BufferedReader(new FileReader("Demo.txt"));
      String line = "";
      System.out.println("This is the contents of the file: ");
      int sum = 0;
      while((line = br.readLine()) != null){
        sum += Integer.parseInt(line);
      }
      System.out.println(sum);
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
