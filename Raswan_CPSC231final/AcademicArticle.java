java.util.*

public abstract class AcademicArticle extends Journal {
  protected String m_university;
  protected String m_affiliated_author;
  protected String m_funding_agency;

  public AcademicArticle(){
    super();
    m_university = "";
    m_affiliated_author = "";
    m_funding_agency = "";
  }

  public AcademicArticle(String author, String title, int publication_year, int price, int pages, LinkedList<Section> section, String journal_name, String m_editor_name, Boolean peer_reviewed, String university, String affiliated_author, String funding_agency){
    super(author, title, publication_year, price, pages, section, journal_name, m_editor_name, peer_reviewed);
    m_university = university;
    m_affiliated_author = affiliated_author;
    m_funding_agency = funding_agency;
  }

  public String getUniversity() {
    return m_university;
  }

  public String getAffiliatedAuthor() {
    return m_affiliated_author;
  }

  public String getFundingAgency() {
    return m_funding_agency;
  }

  public void setUniversity(String university) {
    m_university = university;
  }

  public void setAffiliatedAuthor(String affiliated_author) {
    m_affiliated_author = affiliated_author;
  }

  public void setFundingAgency(String funding_agency) {
    m_funding_agency = funding_agency;
  }

  public void publish(){
    System.out.println(this.toString());
  }

  @Override
  public String toString(){
    String ret = "";
    ret += String.format("%s,%s,%s,", m_university, m_affiliated_author, m_funding_agency);
    return ret;
  }
}
