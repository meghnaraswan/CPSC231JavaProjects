java.util.*

public abstract class Journal extends Section {
  protected String m_journal_name;
  protected String m_editor_name;
  protected Boolean m_peer_reviewed;

  public Journal(){
    super();
    m_journal_name = "";
    m_editor_name = "";
    m_peer_reviewed = false;
  }

  public Journal(String author, String title, int publication_year, int price, int pages, LinkedList<Section> section, String journal_name, String m_editor_name, Boolean peer_reviewed){
    super(author, title, publication_year, price, pages, section);
    m_journal_name = journal_name;
    m_editor_name = editor_name;
    m_peer_reviewed = peer_reviewed;
  }

  public String getJournalName() {
    return m_journal_name;
  }

  public String getEditorName() {
    return m_editor_name;
  }

  public Boolean getPeerReview() {
    return m_peer_reviewed;
  }

  public void setJournalName(String journal_name) {
    m_journal_name = journal_name;
  }

  public void setEditorName(String editor_name) {
    m_editor_name = editor_name;
  }

  public void setPeerReview(Boolean peer_reviewed) {
    m_peer_reviewed = peer_reviewed;
  }

  public void publish(){
    System.out.println(this.toString());
  }

  @Override
  public String toString(){
    String ret = "";
    ret += String.format("%s,%s,%b,", m_journal_name, m_editor_name, m_peer_reviewed);
    return ret;
  }
}
