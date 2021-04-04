/** Meghna Raswan, Tarek El-Hajjaoui, Nathaniel Cuadros, Eli Annoni, Loren Lee */

public class Vampire extends Undead {
    private int m_numHumans; // amount of humans feasted on

    // default constructor
    public Vampire() {
        super();
        m_numHumans = 0;
    }

    // overloaded constructor
    public Vampire(String name, String origin, int deathDate, int numHumans) {
        super(name, origin, deathDate);
        m_numHumans = numHumans;
    }

    // copy constructor
    public Vampire(Vampire v) {
        super(v.getName(), v.getOrigin(), v.getDeathDate());
        m_numHumans = v.getNumHumans();
    }

    // accessor
    public int getNumHumans() {
        return m_numHumans;
    }

    // mutator
    public void setNumHumans(int numHumans) {
        m_numHumans = numHumans;
    }

    // prints vampire's favorite saying
    @Override
    public String speak() {
        String ret = "I vant to suck your blood...ah ah ah";
        return ret;
    }

    // prints vampire's favorite snack
    @Override
    public String diet() {
        String ret = "Human blood";
        return ret;
    }

    //toString method, returns a string
    @Override
    public String toString() {
      String ret = "";
        ret += super.toString();
        ret += "\n" + m_numHumans;
        return ret;
    }
}
