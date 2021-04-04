public interface Playable{
  public void play();
  public boolean isFun();
  public void stop();
}

//class WarGame extends CardGame implements Crashable

class CardGame implements Playable{
  private boolean m_fun;
  private int num_players;

  public CardGame(){
    m_fun = true;
    num_players = 4;
  }
  //all the regular stuff for a class
  public void play(){
    System.out.println("I'm playing a card game!")
  }
  public boolean isFun(){
    return m_fun;
  }
  public void stop(){
    System.out.println("I'm out of money!")
  }
}

class SportsGame implements Playable{
  private String m_name;
  public SportsGame(){
    m_name = "";
  }
  public SportsGame(String n){
    m_name = n;
  }
  public void play(){
    System.out.println("I'm playing a sports game!")
  }
  public boolean isFun(){
    return false;
  }
  public void stop(){
    System.out.println("I broke a bone!")
  }
}
