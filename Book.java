public class Book {
  private String m_title;
  private String m_author;
  private int m_numPages;

  public Book(){
    m_title = "";
    m_author = "";
    m_numPages = 0;
  }

  public Book(String title, String author){
    m_title = title;
    m_author = author;
  }

  public Book(String title, String author, int pages){
    this.m_title = title;
    this.m_author = author;
    this.m_numPages = pages;
  }

  public Book(Book b){
    this.m_author = b.m_author;
    this.m_numPages = b.m_numPages;
    this.m_title = b.m_title;
  }

  public String toString(){
    String ret = "";
    ret += m_title;
    ret += "\n";
    ret += m_author;
    ret += "\n";
    ret += m_numPages;
    ret += "\n";
    return ret;

  }

  public boolean equals(Object o){
      if(!(o instanceof Book)){
        return false;
      }
      Book b = (Book)o;
      boolean ret = true;
      //check other attributes too
      if(this/*.m_author*/.m_numPages != b.m_numPages){
        ret = false;
      }
      return ret;
    }

    public static void main(String[] args){
      Book b1 = new Book("Steinbeck", "Of Mice and Men", 99);
      Book b2 = new Book(b1);
      System.out.println(b2.toString());
    }

}
