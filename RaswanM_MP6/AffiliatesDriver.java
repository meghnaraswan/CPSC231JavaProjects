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

  /** This is the default constructor initializing all of the objects created
  * in the HashMap
  */
  public AffiliatesDriver() {
    Affiliate ap = new AssociateProfessor("Michael", 38, "123 Sesame Street", "9491234567", 2011, "Fowler School of Engineering", 100000, 25, 3);
    Affiliate us = new UndergraduateStudent("George Michael", 18, "456 Abbey Road", "9492345678", 2019, "Computer Science", "Game Development", "Freshman", 12, 20000);
    Affiliate pts = new PartTimeStaff("GOB", 40, "789 Mahogany Street", "9493456789", 2018, "Guest Services Attendant", "Musco Center", 13);
    m_hm.put(new Integer(ap.getCommonID()), ap);
    m_hm.put(new Integer(us.getCommonID()), us);
    m_hm.put(new Integer(pts.getCommonID()), pts);
  }

  /**
  * Accessor for ID and Affiliate
  * @return an HashMap value of m_hm
  */
  public HashMap<Integer, Affiliate> getHM() {
    return m_hm;
  }

  /**
  * Mutator for ID and Affiliate
  * @param hm int representing ID and Affiliate
  */
  public void setHM(HashMap<Integer, Affiliate> hm) {
    m_hm = hm;
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
    System.out.println("Please Enter the following Information");
    System.out.print("Name: ");
    name = sc.nextLine();
    System.out.print("Age: ");
    int age = Integer.parseInt(sc.nextLine()); //sc.nextInt();
    iage = new Integer(age);
    System.out.print("Address: ");
    address = sc.nextLine();
    System.out.print("Phone Number: ");
    phoneNumber = sc.nextLine();
    System.out.print("Year you came to Champman: ");
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
    try {
      Scanner sc = new Scanner(System.in);
      String name = "";
      Integer iage = new Integer(0);
      String address = "";
      String phoneNumber = "";
      Integer iYearAtChap = new Integer(0);
      inputAffiliateVars(name, iage, address, phoneNumber, iYearAtChap); //calling inputAffiliateVars method because all of the users are affiliates
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

      //using swithc statement for what affiliate user inputs
      switch (usrAffiliate) {
        case "Assistant Professor":
          inputFacultyVars(department, iYearlySalary, iNumPapers); //calling inputFacultyVars for Assistant Professor
          yearlySalary = iYearlySalary.intValue();
          numPapers = iNumPapers.intValue();
          System.out.print("Years Until Tenure: ");
          int yrsTilTenure = sc.nextInt();
          Affiliate a = new AssistantProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsTilTenure); //creating affiliate object for Assistant Professor
          m_hm.put(new Integer(a.getCommonID()), a); //putting ID and object is in HashMap
          break;
        case "Associate Professor":
          inputFacultyVars(department, iYearlySalary, iNumPapers); //calling inputFacultyVars for Associate Professor
          yearlySalary = iYearlySalary.intValue();
          numPapers = iNumPapers.intValue();
          System.out.print("Years Since Tenure: ");
          int yrsSinceTenure = sc.nextInt();
          Affiliate b = new AssociateProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsSinceTenure); //creating affiliate object for Full Professor
          m_hm.put(new Integer(b.getCommonID()), b); //putting ID and object is in HashMap
          break;
        case "Full Professor":
          inputFacultyVars(department, iYearlySalary, iNumPapers);
          yearlySalary = iYearlySalary.intValue();
          numPapers = iNumPapers.intValue();
          System.out.print("Years Until Retirement: ");
          int yrsTilRetirement = sc.nextInt();
          Affiliate c = new FullProfessor(name, age, address, phoneNumber, yearAtChap, department, yearlySalary, numPapers, yrsTilRetirement); //creating affiliate object for Associate Professor
          m_hm.put(new Integer(c.getCommonID()), c); //putting ID and object is in HashMap
          break;
        case "Graduate Student":
          inputStudentsVars(major, minor, classStanding);
          System.out.print("Numbers of Papers Published: ");
          int numPapersPublished = sc.nextInt();
          System.out.print("Thesis Advisor: ");
          String thesisAdvisor = sc.next();
          Affiliate d = new GraduateStudent(name, age, address, phoneNumber, yearAtChap, major, minor, classStanding, numPapersPublished, thesisAdvisor); //creating affiliate object for Graduate Student
          m_hm.put(new Integer(d.getCommonID()), d); //putting ID and object is in HashMap
          break;
        case "Undergraduate Student":
          inputStudentsVars(major, minor, classStanding);
          System.out.println("Number of Courses Taken: ");
          int numCoursesTaken = sc.nextInt();
          System.out.println("Scholarship Amount: ");
          int scholarshipAmt = sc.nextInt();
          Affiliate e = new UndergraduateStudent(name, age, address, phoneNumber, yearAtChap, major, minor, classStanding, numCoursesTaken, scholarshipAmt); //creating affiliate object for Undergraduate Student
          m_hm.put(new Integer(e.getCommonID()), e); //putting ID and object is in HashMap
          break;
        case "Full Time Staff":
          inputStaffVars(title, building);
          System.out.println("Yearly Salary: ");
          yearlySalary = sc.nextInt();
          Affiliate f = new FullTimeStaff(name, age, address, phoneNumber, yearAtChap, title, building, yearlySalary); //creating affiliate object for Full Time Staff
          m_hm.put(new Integer(f.getCommonID()), f); //putting ID and object is in HashMap
          break;
        case "Part Time Staff":
          inputStaffVars(title, building);
          System.out.println("Hourly Salary: ");
          int hourlySalary = sc.nextInt();
          Affiliate g = new PartTimeStaff(name, age, address, phoneNumber, yearAtChap, title, building, hourlySalary); //creating affiliate object for Part Time Staff
          m_hm.put(new Integer(g.getCommonID()), g); //putting ID and object is in HashMap
          break;
        default:
          System.out.println("This is not a valid option.");
          break;
      }
    } catch (Exception e) {
      e.printStackTrace();
      System.out.println("Error in input, let's try again ..."); //catches invalid input
    }
  }

  /**
  * AffiliatesDriver class serves as a driver class to the Affiliate and all of
  * its inherited classes
  * @author Meghna Raswan
  * @param args command-line arguments
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, Affiliate> hashMap = null;
    AffiliatesDriver ad = new AffiliatesDriver(); //HashMap<int, Affiliate> hashMap);

    while (true){ //infinite loop
      // get the hashmap storing each Affiliate here again.
      hashMap = ad.getHM();

      String fileName  = "";
      System.out.println();
      System.out.println("+-----------------------------+");
      System.out.println("Choose one of the following options:");
      System.out.println("1) Create an affiliate record");
      System.out.println("2) Print information for an Affiliate given the ID");
      System.out.println("3) List all affiliates in order of seniority");
      System.out.println("4) Delete a record given the id");
      System.out.println("5) Save your database to a file");
      System.out.println("6) Restore your database from a file");
      System.out.println("7) Exit");
      System.out.println("+-----------------------------+");
      System.out.print("Enter Your Selection:> ");
      int option = sc.nextInt(); //asking for user input
      //swithc statement for which option they choose
      switch (option){
        case 1:
          System.out.println("Which of the following affiliates would you like to create:");
          System.out.println("Assistant Professor, Associate Professor, Full Professor, Graduate Student, Undergraduate Student, Full Time Staff, or Part Time Staff");
          String affiliateChoice = sc.next();
          ad.myAffiliate(affiliateChoice); //calls myAffiliate method on the user's input
          break;
        case 2:
          System.out.print("Please enter the ID of the record you want to view:");
          int viewID = sc.nextInt();
          try {
            Affiliate a = hashMap.get(new Integer(viewID)); //gets value from HashMap from ID user input
            a.print(); //calls print method from printable interface
          } catch (Exception e) {
            System.out.println("The ID provided is not valid");
          }
          break;
        case 3:
          LinkedList<Affiliate> ll = new LinkedList<Affiliate>();
          for(Affiliate a: hashMap.values()) { //putting objects in linked list for every indext in HashMAp
            ll.add(a);
          }
          Collections.sort(ll); //sorts linked list using Comparable interface
          for(int i = 0; i < ll.size(); ++i){ //for all of the affiliate in the linked list, the linked list eill get each of those values
            Affiliate a = ll.get(i);
            a.print(); //prints the list by seniority calling printable interface
          }
          break;
        case 4:
          System.out.print("Please enter the ID of the record you want to delete:");
          int deleteID = sc.nextInt();
          hashMap.remove(deleteID);
          ad.setHM(hashMap);
          System.out.println("Your update record is " + hashMap);
          break;
        case 5:
          System.out.print("Please enter the name of the file you wish to put all of the data in:");
          fileName = sc.next();
          try{
            PrintWriter pw = new PrintWriter(new FileWriter(fileName));
            for(Affiliate a: hashMap.values()) {
              pw.println(a.getClass().getSimpleName() + "," + a.toString());
            }
            pw.close();
            System.out.println(String.format("Successfully saved data in: %s",fileName));
          } catch(IOException e) {
            e.printStackTrace();
            System.out.println(String.format("*** Error in saving data in: %s ***",fileName));
          }
          break;
        case 6:
          System.out.print("Please enter the name of the file you wish to read all of the data from:");
          fileName = sc.next();
          try{
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            HashMap<Integer, Affiliate> hm = new HashMap<Integer, Affiliate>();
            //do stuff
            String currentThreadLine;
            while((currentThreadLine = br.readLine()) != null){
              String[] allAttributes = currentThreadLine.split(","); //returns the words in the line split by comma
              String className = allAttributes[0]; //class name would be in first index of the array
              //all of the other attributes are in subsequent indexes to the class name, as the attributes had to be listed in alphabetic order
              String address = allAttributes[1];
              int age = Integer.parseInt(allAttributes[2]);
              String name = allAttributes[3];
              String phoneNum = allAttributes[4];
              int year = Integer.parseInt(allAttributes[5]);
              String department = "";
              int numPapers = new Integer(0);
              int yearlySalary = new Integer(0);
              String major = "";
              String minor = "";
              String classStanding = "";
              String title = "";
              String building = "";

              Affiliate aff = null;
              switch (className) {
              case "AssociateProfessor":
                department = allAttributes[6];
                numPapers = Integer.parseInt(allAttributes[8]);
                yearlySalary = Integer.parseInt(allAttributes[9]);
                int yrsSinceTenure = Integer.parseInt(allAttributes[10]);
                aff = new AssociateProfessor(name, age, address, phoneNum, year, department, yearlySalary, numPapers, yrsSinceTenure);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "AssistantProfessor":
                department = allAttributes[6];
                numPapers = Integer.parseInt(allAttributes[8]);
                yearlySalary = Integer.parseInt(allAttributes[9]);
                int yrsTilTenure = Integer.parseInt(allAttributes[10]);
                aff = new AssistantProfessor(name, age, address, phoneNum, year, department, yearlySalary, numPapers, yrsTilTenure);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "FullProfessor":
                department = allAttributes[6];
                numPapers = Integer.parseInt(allAttributes[8]);
                yearlySalary = Integer.parseInt(allAttributes[9]);
                int yrsTilRetirement = Integer.parseInt(allAttributes[10]);
                aff = new AssistantProfessor(name, age, address, phoneNum, year, department, yearlySalary, numPapers, yrsTilRetirement);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "GraduateStudent":
                major = allAttributes[6];
                minor = allAttributes[7];
                classStanding = allAttributes[8];
                int numPapersPublished = Integer.parseInt(allAttributes[10]);
                String thesisAdvisor = allAttributes[11];
                aff = new GraduateStudent(name, age, address, phoneNum, year, major, minor, classStanding, numPapersPublished, thesisAdvisor);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "UndergraduateStudent":
                major = allAttributes[6];
                minor = allAttributes[7];
                classStanding = allAttributes[8];
                int numCoursesTaken = Integer.parseInt(allAttributes[10]);
                int scholarshipAmt = Integer.parseInt(allAttributes[11]);
                aff = new UndergraduateStudent(name, age, address, phoneNum, year, major, minor, classStanding, numCoursesTaken, scholarshipAmt);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "FullTimeStaff":
                title = allAttributes[6];
                building = allAttributes[8];
                yearlySalary = Integer.parseInt(allAttributes[9]);
                aff = new PartTimeStaff(name, age, address, phoneNum, year, title, building, yearlySalary);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              case "PartTimeStaff":
                title = allAttributes[6];
                building = allAttributes[8];
                int hourlySalary = Integer.parseInt(allAttributes[9]);
                aff = new PartTimeStaff(name, age, address, phoneNum, year, title, building, hourlySalary);
                hm.put(new Integer(aff.getCommonID()), aff);
                System.out.println(String.format("Read successfully record for class: %s",className));
                break;
              default:
                System.out.println(String.format("Please implement reading the class: %s",className));
                break;
              }
            }
            br.close();
            ad.setHM(hm);
          }
          catch(FileNotFoundException f){
            f.printStackTrace();
            System.out.println(String.format("*** Error finding the file: %s ***",fileName));
          }
          catch(IOException io){
            io.printStackTrace();
            System.out.println(String.format("*** Error in reading data from: %s ***",fileName));
          }
          break;
        case 7:
          break;
        default:
          System.out.println("This is not a valid option."); //if user inputs something other than 1, 2, 3, 4, 5, or 6 tell the user that the input was invalid
          break;
      }
      if (option == 7){ //program will end if user inputs 7
        break;
      }
    }
  }
}
