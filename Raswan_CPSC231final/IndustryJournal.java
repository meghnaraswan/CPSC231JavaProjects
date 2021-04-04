java.util.*

public class IndustryJournal extends Journal {
  protected String m_industry;

  public IndustryJournal(){
    super();
    m_industry = "";
  }

  public IndustryJournal(String author, String title, int publication_year, int price, int pages, LinkedList<Section> section, String journal_name, String m_editor_name, Boolean peer_reviewed, String industry){
    super(author, title, publication_year, price, pages, section, journal_name, m_editor_name, peer_reviewed);
    m_industry = industry;
  }

  public String getIndustry() {
    return m_industry;
  }

  public void setUniversity(String industry) {
    m_industry = industry;
  }

  public void publish(){
    System.out.println(this.toString());
  }

  @Override
  public String toString(){
    String ret = "";
    ret += String.format("%s,%s,%s,", m_industry);
    return ret;
  }
}
