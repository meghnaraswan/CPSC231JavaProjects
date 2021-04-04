import java.util.LinkedList;
import java.util.Collections;

public class Card implements Comparable<Card>{
  private int m_rank;
  private int m_suit;
  public static final int HEARTS = 0;
  public static final int DIAMONDS = 1;
  public static final int SPADES = 2;
  public static final int CLUBS = 3;

  public Card(){
    m_rank = -1;
    m_suit = -1;
  }

  public Card(int r, int s){
    m_rank = r;
    m_suit = s;
  }

  //return 0 if equal
  //return 1 if this is greater than c
  //return -1 if this is less than c
  public int compareTo(Card c){
    int ret = 0;
    if (this.m_rank < c.m_rank){
      ret = -1;
    }
    else if (this.m_rank > c.m_rank){
      ret = 1;
    }
    else{
      ret = 0;
    }
    return ret;
  }

  public static void main (String[] args){
    Card c1 = new Card(2, Card.CLUBS);
    Card c2 = new Card(5, Card.SPADES);
    Card c3 = new Card(10, Card.HEARTS);
    Card c4 = new Card(3, Card.CLUBS);
    Card c5 = new Card(7, Card.DIAMONDS);
    // System.out.println(c1.compareTo(c3));
    // System.out.println(c3.compareTo(c2));
    // System.out.println(c3.compareTo(c3));

    LinkedList<Card> ll = new LinkedList<Card>();
    ll.add(c1);
    ll.add(c2);
    ll.add(c3);
    ll.add(c4);
    ll.add(c5);

    Collections.sort(ll);
    for(int i = 0; i < ll.size(); ++i){
      Card c = ll.get(i);
      System.out.println(c.m_rank);
    }

  }
}
