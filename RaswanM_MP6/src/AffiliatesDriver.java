/**
 *  The driver class that includes the main class
 * @author Meghna Raswan
 */

import java.util.*;
import java.io.*;

public class AffiliatesDriver{

  //member variable
  /**A HashMap which stores the affiliate ID and the Affiliate object/info*/
  private HashMap<Integer, Affiliate> m_hm = new HashMap<Integer, Affiliate>();

  // /** Overloaded pizza constructor
  // * @param hm HashMap<int, Affiliate> representing the HashMap to store
  // * the affiliate ID and the corresponding Affiliate object
  // */
  // public AffiliatesDriver(HashMap<int, Affiliate> hm){
  //   m_hm = hm;
  // }

  /** This is the default constructor initializing all of the objects created
  * in the HashMap
  */
  public AffiliatesDriver() {
    Affiliate ap = new AssociateProfessor("Michael", 38, "123 Sesame Street", "9491234567", 2011, "Fowler School of Engineering", 100000, 25, 3);
    Affiliate us = new UndergraduateStudent("George Michael", 18, " 456 Abbey Road", "9492345678", 2019, "Computer Science", "Game Development", "Freshman", 12, 20000);
    Affiliate pts = new PartTimeStaff("GOB", 40, "789 Mahogany Street", "9493456789", 2018, "Guest Services Attendant", "Musco Center", 13);
    m_hm.put(new Integer(ap.getCommonID()), ap);
    m_hm.put(new Integer(us.getCommonID()), us);
    m_hm.put(new Integer(pts.getCommonID()), pts);
  }

  public HashMap<Integer, Affiliate> getHM() {
    return m_hm;
  }

  /** inputAffiliateVars method (asking overall user input of affiliate info)
  * @param name String representing the name of person
  * @param iage int representing age of person
  * @param address String representing the address of person
  * @param phoneNumber String representing the phone number of person
  * @param iYearAtChap int representing the number of years person has been at
  * Chapman
  */
  public void inputAffiliateVars(String name, Integer iage, String address, String phoneNumber, Integer iYearAtChap){
    Scanner sc = new Scanner(System.in);
    System.out.println("Please Enter:");
    System.out.println("Name: ");
    name = sc.next();
    System.out.println("Age: ");
    int age = sc.nextInt();
    iage = new Integer(age);
    System.out.println("Address: ");
    address = sc.next();
    System.out.println("Phone Number: ");
    phoneNumber = sc.next();
    System.out.println("Year you came to Champman: ");
    int yearAtChap = sc.nextInt();
    iYearAtChap = new Integer(yearAtChap);
  }

  /** inputFacultyVars method (asking overall user input of Faculty info)
  * @param department String representing the department of faculty member
  * @param iYearlySalary int representing the yearly salary of faculty member
  * @param iNumPapers int representing the number of papers of faculty member
  */
  public void inputFacultyVars(String department, Integer iYearlySalary, Integer iNumPapers){
    Scanner sc = new Scanner(System.in);
    System.out.println("Department: ");
    department = sc.next();
    System.out.println("Yearly Salary: ");
    int yearlySalary = sc.nextInt();
    iYearlySalary = new Integer(yearlySalary);
    System.out.println("Number of Papers: ");
    int numPapers = sc.nextInt();
    iNumPapers = new Integer(numPapers);
  }

  /** inputStudentsVars method (asking overall user input of Student info)
  * @param major String representing the major of student
  * @param minor String representing the minor of student
  * @param classStanding String representing the class standing of student
  */
  public void inputStudentsVars(String major, String minor, String classStanding){
    Scanner sc = new Scanner(System.in);
    System.out.println("Major: ");
    major = sc.next();
    System.out.println("Minor: ");
    minor = sc.next();
    System.out.println("Class Standing: ");
    classStanding = sc.next();
  }

  /** inputStaffVars method (asking overall user input of Staff info)
  * @param title String representing the title of staff member
  * @param building String representing the building of staff member
  */
  public void inputStaffVars(String title, String building){
    Scanner sc = new Scanner(System.in);
    System.out.println("Title: ");
    title = sc.next();
    System.out.println("Building: ");
    building = sc.next();
  }

  /** myAffiliate method (asking overall user input of Affiliate)
  * @param usrAffiliate String representing the affiliate user input
  */
  public void myAffiliate(String usrAffiliate){
    // HashMap<Integer, Affiliate> hm = new HashMap<Integer, Affiliate>();
    Scanner sc = new Scanner(System.in);
    String name = "";
    Integer iage = new Integer(0);
    String address = "";
    String phoneNumber = "";
    Integer iYearAtChap = new Integer(0);
    inputAffiliateVars(name, iage, address, phoneNumber, iYearAtChap);
    int age = iage.intValue();
    int yearAtChap = iYearAtChap.intValue();

    String department = "";
    Integer iYearlySalary = new Integer(0);
    Integer iNumPapers = new Integer(0);
    String major = "";
    String minor = "";
    String classStanding = "";
    String title = "";
    String building = "";
    int yearlySalary = 0;
    int numPapers = 0;

    switch (usrAffiliate){
      case "Assistant Professor":
        inputFacultyVars(department, iYearlySalary, iNumPapers);
        yearlySalary = iYearlySalary.intValue();
        numPapers = iNumPapers.intValue();
        System.out.println("Years Until Tenure: ");
        int yrsTilTenure = sc.nextInt();
        Affiliate a = new AssistantProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsTilTenure);
        m_hm.put(new Integer(a.getCommonID()), a);
        break;
      case "Associate Professor":
        inputFacultyVars(department, iYearlySalary, iNumPapers);
        yearlySalary = iYearlySalary.intValue();
        numPapers = iNumPapers.intValue();
        System.out.println("Years Since Tenure: ");
        int yrsSinceTenure = sc.nextInt();
        Affiliate b = new AssociateProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsSinceTenure);
        m_hm.put(new Integer(b.getCommonID()), b);
        break;
      case "Full Professor":
        inputFacultyVars(department, iYearlySalary, iNumPapers);
        yearlySalary = iYearlySalary.intValue();
        numPapers = iNumPapers.intValue();
        System.out.println("Years Until Retirement: ");
        int yrsTilRetirement = sc.nextInt();
        Affiliate c = new FullProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsTilRetirement);
        m_hm.put(new Integer(c.getCommonID()), c);
        break;
      case "Graduate Student":
        inputStudentsVars(major, minor, classStanding);
        System.out.println("Numbers of Papers Published: ");
        int numPapersPublished = sc.nextInt();
        System.out.println("Thesis Advisor: ");
        String thesisAdvisor = sc.next();
        Affiliate d = new GraduateStudent(name, age, address, phoneNumber, yearAtChap, major, minor, classStanding, numPapersPublished, thesisAdvisor);
        m_hm.put(new Integer(d.getCommonID()), d);
        break;
      case "Undergraduate Student":
        inputStudentsVars(major, minor, classStanding);
        System.out.println("Number of Courses Taken: ");
        int numCoursesTaken = sc.nextInt();
        System.out.println("Scholarship Amount: ");
        int scholarshipAmt = sc.nextInt();
        Affiliate e = new UndergraduateStudent(name, age, address, phoneNumber, yearAtChap, major, minor, classStanding, numCoursesTaken, scholarshipAmt);
        m_hm.put(new Integer(e.getCommonID()), e);
        break;
      case "Full Time Staff":
        inputStaffVars(title, building);
        System.out.println("Yearly Salary: ");
        yearlySalary = sc.nextInt();
        Affiliate f = new FullTimeStaff(name, age, address, phoneNumber, yearAtChap, title, building, yearlySalary);
        m_hm.put(new Integer(f.getCommonID()), f);
        break;
      case "Part Time Staff":
        inputStaffVars(title, building);
        System.out.println("Hourly Salary: ");
        int hourlySalary = sc.nextInt();
        Affiliate g = new PartTimeStaff(name, age, address, phoneNumber, yearAtChap, title, building, hourlySalary);
        m_hm.put(new Integer(g.getCommonID()), g);
        break;
      default:
        System.out.println("This is not a valid option."); //if user inputs something other than 'V', 'v', 'A', 'a', 'D', 'd', 'W', 'w', 'Q', or 'q', tell the user that the input was invalid
        break;
    }
  }

  /**
  * AffiliatesDriver class serves as a driver class to the Affiliate and all of
  * its inherited classes
  * @author Meghna Raswan
  * @param args command-line arguments
  * @see AffiliatesDriver#myAffiliate()
  */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Affiliate> hashMap = null;
    AffiliatesDriver ad = new AffiliatesDriver(); //HashMap<int, Affiliate> hashMap);

    hashMap = ad.getHM();

    while (true){ //infinite loop
      String fileName  = "";
      System.out.println("Choose one of the following options:");
      System.out.println("1) Create an affiliate record");
      System.out.println("2) Print information for an Affiliate given the ID");
      System.out.println("3) List all affiliates in order of seniority");
      System.out.println("4) Delete a record given the id");
      System.out.println("5) Save your database to a file");
      System.out.println("6) Restore your database from a file");
      System.out.println("7) Exit");
      int option = sc.nextInt();
      switch (option){
        case 1:
          System.out.println("Which of the following affiliates would you like to create:");
          System.out.println("Assistant Professor, Associate Professor, Full Professor, Graduate Student, Undergraduate Student, Full Time Staff, or Part Time Staff");
          String affiliateChoice = sc.next();
          ad.myAffiliate(affiliateChoice);
          break;
        case 2:
          for(Affiliate a: hashMap.values()) {
            a.print();
          }
          break;
        case 3:
          LinkedList<Affiliate> ll = new LinkedList<Affiliate>();
          for(Affiliate a: hashMap.values()) {
            ll.add(a);
          }
          Collections.sort(ll);
          for(int i = 0; i < ll.size(); ++i){
            Affiliate a = ll.get(i);
            a.print();
          }
          break;
        case 4:
          System.out.println("Please enter the ID of the record you want to delete:");
          int deleteID = sc.nextInt();
          hashMap.remove(deleteID);
          System.out.println("Your update record is " + hashMap);
          break;
        case 5:
          System.out.println("Please enter the name of the file you wish to put all of the data in:");
          fileName = sc.next();
          try{
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            for(Affiliate a: hashMap.values()) {
              pw.println(a.getClass().getSimpleName() + "," + a.toString());
            }
            pw.close();
          }
          catch(IOException e){
            e.printStackTrace();
          }
          break;
        case 6:
          System.out.println("Please enter the name of the file you wish to read all of the data from:");
          fileName = sc.next();
          try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            //do stuff
            String currentThreadLine;
            while((currentThreadLine = br.readLine()) != null){
              String[] toks = currentThreadLine.split(","); //returns the words in the line split by whitespace
            }
            br.close();
          }
          catch(FileNotFoundException f){
            f.printStackTrace();
          }
          catch(IOException io){
            io.printStackTrace();
          }
          break;
        case 7:
          break;
        default:
          System.out.println("This is not a valid option."); //if user inputs something other than 'V', 'v', 'A', 'a', 'D', 'd', 'W', 'w', 'Q', or 'q', tell the user that the input was invalid
          break;
      }
      if (option == 7){ //program will end if user inputs 'Q' or 'q'
        break;
      }
    }
  }
}
