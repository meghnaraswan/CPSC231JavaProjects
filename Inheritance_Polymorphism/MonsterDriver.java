/* To convince yourself that polymorphisms works on your demonic creations,
in your main method (MosterDrive Class) you should create an ArrayList (called
monsterList) of Monsters, and populate the list with 10 instances of Zombies,
Vampires, and Werewolves. After you create the list, call
Collections.shuffle(monsterList) so that you no longer have any idea where each
type of monster is in the list. Your main method will then loop through the
ArrayList and for each instance: 1) Print the monster’s name 2) Print the
specific type of Monster using the instanceof operator 3) Call the speak() and
diet() method on the instance. 4) Display the favorite weapon of zombies, the
number of humans a vampire has feasted on, and the number of days until a
Werewolf transforms.*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MonsterDriver{
  public static void main(String[] args) {

    ArrayList<Monster> monsterList = new ArrayList<Monster>();

    Zombie z1 = new Zombie("Billy", "Texas", 1955, "Ax");
    Zombie z2 = new Zombie("Jose", "Chile", 2017, "Chainsaw");
    Vampire v1 = new Vampire("Dracula", "Transylvania", 1897, 120825);
    Werewolf w1 = new Werewolf("Lupin", "England", "Canine", 0);

    monsterList.add(z1);
    monsterList.add(z2);
    monsterList.add(v1);
    monsterList.add(w1);

    Collections.shuffle(monsterList);

    // 1) Print the monster’s name 2) Print the
    // specific type of Monster using the instanceof operator 3) Call the speak() and
    // diet() method on the instance. 4) Display the favorite weapon of zombies, the
    // number of humans a vampire has feasted on, and the number of days until a
    // Werewolf transforms

    for(int count = 0; count < monsterList.size(); ++count){
      Monster monster = monsterList.get(count);
      System.out.println("Hi, I'm " + monster.getName());
      System.out.println(monster.speak());
      System.out.println(monster.diet());
      if(monster instanceof Zombie){
        System.out.println("Zombie");
        System.out.println("My favorite weapon is: " + ((Zombie)monster).getWeapon());
      }else if(monster instanceof Vampire){
        System.out.println("Vampire");
        System.out.println("Human count: " + ((Vampire)monster).getNumHumans());
      }else{
        System.out.println("Werewolf");
        System.out.println("Days to next transformation: " + ((Werewolf)monster).getNextTrans());
      }
      System.out.println();
    }
  }
}
