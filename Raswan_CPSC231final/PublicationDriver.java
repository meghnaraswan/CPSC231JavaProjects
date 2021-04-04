import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class PublicationDriver{
  public static void main(String[] args) {
    ArrayList<Publication> publication = new ArrayList<Publication>();

    //i didn't get to write the parameters
    Publication b = new Book();
    Publication a = new AcademicArticle();

    System.out.println(b.compareTo(a));

    publication.add(a);
    publication.add(b);

    Collections.sort(publication);
    for(int i = 0; i < publication.size(); ++i){
      Publication p = publication.get(i);
      p.publish();
    }
    try{
      PrintWriter pw = new PrintWriter(new FileWriter("File.txt"));
      pw.publish();
    }
    catch(IOException e){
      e.printStackTrace();
    }
  }
}
