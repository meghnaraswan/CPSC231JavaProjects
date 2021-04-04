java.util.*

public class Book extends Section {
  protected String m_ISBN;
  protected String m_category;

  public Book(){
    super();
    m_ISBN = "";
    m_category = "";
  }

  public Book(String author, String title, int publication_year, int price, int pages, LinkedList<Section> section, String ISBN, String category){
    super(author, title, publication_year, price, pages, section);
    m_ISBN = ISBN;
    m_category = category;
  }

  public String getISBN() {
    return m_ISBN;
  }

  public String getCategory() {
    return m_category;
  }

  public void setISBN(String ISBN) {
    m_ISBN = ISBN;
  }

  public void setCategory(String category) {
    m_category = category;
  }

  public void publish(){
    System.out.println(this.toString());
  }

  @Override
  public String toString(){
    String ret = "";
    ret += String.format("%s,%s,", m_ISBN, m_category);
    return ret;
  }
}
