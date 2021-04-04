/*
* Core - execution engine
* Process - executing program
* Process collection of resources used by a program:
* process id
* memory space
* open files
* current state (running? waiting? killed?)
* Thread - lightweight process - executing piece of code
* Multiple threads can exist in single Process
* share same resources
*/

public class ThreadDemo implements Runnable{
  private int m_tid;
  private static int m_count = 0;
  private static Object m_lock = new Object();

  // constructor default
  public ThreadDemo(){
    this.m_tid = -1;
  }
  // constructor
  public ThreadDemo(int id){
    this.m_tid = id;
  }

  public void setID(int id){
    this.m_tid = id;
  }
  public int getID(){
    return this.m_tid;
  }

  // part of the template
  public static int getCount(){
    return m_count;
  }

  //normal stuff

  public void run(){ //concurrent code
    for(int i = 0; i < 10; ++i){
      //critical section
      synchronized(m_lock){ //lock - mutex; protects race condition; before you do count, make sure you acquire the lock on object first; only one thig will be able to execute the ++m_count block of code, and that thing is currently the object m_lock  
        ++m_count; //race conditions: when multiple threads try to manipulate the same resource at the same time; non determanism in results
        System.out.println(String.format("m_tid:%d, m_count:%d",m_tid, m_count));
      }
      try {
        Thread.sleep(10);
      } catch(Exception e) {
        e.printStackTrace();
      }
    }
  }

  public static void main(String[] args){
    ThreadDemo d1 = new ThreadDemo(1);
    ThreadDemo d2 = new ThreadDemo(2);
    ThreadDemo d3 = new ThreadDemo(3);
    Thread t1 = new Thread(d1);
    Thread t2 = new Thread(d2);
    Thread t3 = new Thread(d3);
    t1.start();
    t2.start();
    t3.start();
    try{
      t1.join(); //allows t1 to go first
      t2.join(); //then t2
      t3.join(); //then t3
    } catch(Exception e){
      e.printStackTrace();
    }
    System.out.println(ThreadDemo.getCount());
  }
}
