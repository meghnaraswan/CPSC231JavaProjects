java.util.*

public abstract class Publication implements Publishable, Comparable<Publication> {
  protected String m_author;
  protected String m_title;
  protected int m_publication_year;
  protected int m_price;
  protected int m_pages;
  protected LinkedList<Section> m_section = null;

  public Publication(){
    m_author = "";
    m_title = "";
    m_publication_year = -1;
    m_price = -1;
    m_section.add(new Section());
  }

  public Publication(String author, String title, int publication_year, int price, int pages, LinkedList<Section> section){
    m_author = author;
    m_title = title;
    m_publication_year = publication_year;
    m_price = price;
    m_pages = pages;
    m_section = section;
  }

  public String getAuthor() {
    return m_author;
  }

  public String getTitle() {
    return m_title;
  }

  public int getPubYear() {
    return m_publication_year;
  }

  public int getPrice() {
    return m_price;
  }

  public int getPages() {
    return m_pages;
  }

  public LinkedList<Section> getSection() {
    return m_section;
  }

  public void setAuthor(String author) {
    m_author = author;
  }

  public void setTitle(String title) {
    m_title = title;
  }

  public void setPubYear(int publication_year) {
    m_publication_year = publication_year;
  }

  public void setPrice(int price) {
    m_price = price;
  }

  public void setPages(int pages) {
    m_pages = pages;
  }

  public void setSection(LinkedList<Section> section) {
    m_section = section;
  }

  public void publish(){
    System.out.println(this.toString());
  }

  public String toString(){
    String ret = "";
    ret += String.format("%s,%s,%d,%d,%d", m_author, m_title, m_publication_year, m_price, m_pages);
    return ret;
  }

  public int compareTo(Publication p){
    int ret = 0;
    if (this.m_publication_year < p.m_publication_year){
      ret = -1;
    }
    else if (this.m_publication_year > p.m_publication_year){
      ret = 1;
    }
    else{
      ret = 0;
    }
    return ret;
  }
}
