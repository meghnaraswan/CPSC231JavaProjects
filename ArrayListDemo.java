import java.util.ArrayList;

public class ArrayListDemo{

  public static void main(String[] args){
    //old way - pre java 5
    //holds Objects
    ArrayList al= new ArrayList();
    Integer i = new Integer(5);
    Float f = new Float(25.0);
    String s = "Erik";
    al.add(i);
    al.add(f);
    al.add(s);
    for(int j = 0; j < 10; ++j){
      al.add(new Integer(j));
    }

    Object o = al.get(2);
    String sss = (String) o;
    //System.out.println(sss);

    //new way - new way with Generics
    System.out.println("No autoboxing");
    ArrayList<Integer> ali = new ArrayList<Integer>();
    for(int k = 0; k < 10;++k){
      ali.add(new Integer(2*k));
    }
    for(int k = 0; k < 10; ++k){
      Integer ii = ali.get(k);
      System.out.println(ii.intValue());
    }

    // even better = Generics + autoboxing/unboxing
    // PREFERRED
    System.out.println("With autoboxing");
    ArrayList<Integer> ali2 = new ArrayList<Integer>(1000);
    for(int k = 0; k < 1000;++k){
      ali2.add(3*k);
    }
    for(int k = 0; k < 1000; ++k){
      System.out.println(ali2.get(k));
    }


  }



}
