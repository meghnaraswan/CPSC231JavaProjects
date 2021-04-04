public class Werewolf extends Animal{
  private int daysToTransform;

  public Werewolf(){
    daysToTransform = 0;
  }


  public Werewolf(String name, String o, String spec, int dT){
    super(name, o, spec);
    daysToTransform = dT;
  }

  @Override
  public String speak(){
    String ret = "Woo Woo";
    return ret;
  }

  @Override
  public String diet(){
    String favoriteFood = "Humans";
    return favoriteFood;
  }

  @Override
  public String toString(){
    String s = super.toString()+"\nDays to Transform: "+daysToTransform;
    return s;
  }

  public int getNextTrans(){
    return daysToTransform;
  }

  public void setDays(int d){
    daysToTransform = d;
  }
}
