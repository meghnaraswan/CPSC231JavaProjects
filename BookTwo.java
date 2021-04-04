/** This class represents a book that can be used to
 *  model a book store.
 * @author Erik J Linstead
*/
public class BookTwo {
  /**A String representing the title of the book*/
  private String m_title;
  /**A String representing the author's name*/
  private String m_author;
  /**An int representing the number of pages  of the book*/
  private int m_numPages;

  /** This is the default constructor
  */
  public BookTwo(){
    m_title = "";
    m_author = "";
    m_numPages = 0;
  }

  /** Overloaded book constructor
  * @param title String representing the title of the book
  * @param author String representing the author's name
  */
  public BookTwo(String title, String author){
    m_title = title;
    m_author = author;
  }

  /** Overloaded book constructor
  * @param title String representing the title of the book
  * @param author String representing the author's name
  * @param pages int representing the number of pages
  */
  public BookTwo(String title, String author, int pages){
    this.m_title = title;
    this.m_author = author;
    this.m_numPages = pages;
  }

  /** Copy constructor
  * @param b the book to copy
  */
  public BookTwo(BookTwo b){
    this.m_author = b.m_author;
    this.m_numPages = b.m_numPages;
    this.m_title = b.m_title;
  }

  /** Creates a string representation of the Book
  * @return A formatted string with the book's attributes
  */
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

  /** Tests two books for equality
  * @param o the object to test against
  * @return true if the objects are equal and false otherwise
  */
  public boolean equals(Object o){
      if(!(o instanceof BookTwo)){
        return false;
      }
      BookTwo b = (BookTwo)o;
      boolean ret = true;
      //check other attributes too
      if(this./*m_author.*/m_numPages != b.m_numPages){
        ret = false;
      }
      return ret;
    }

    public static void main(String[] args){
      BookTwo b1 = new BookTwo("Steinbeck", "Of Mice and Men", 99);
      BookTwo b2 = new BookTwo(b1);
      System.out.println(b2.toString());
    }

}
