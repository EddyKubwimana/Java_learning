
/**
 * A class to represent a Student, which is a more specialized
 * version of a Person
 */
public class Student extends Person {
  
  private int graduationYear;
  private int id;
  
  /** A constructor */
  public Student(String name, int age, 
                 int gradYear, int studentId){
    // Call the constructor of the parent 
    // class / super class, i.e. Person
    super(name,age);
    
    // set the other member variables
    graduationYear = gradYear;
    id = studentId;
  }
  
  /** An accessor (get) method for the graduationYear variable */
  public int getGraduationYear() {
    return graduationYear;
  }
  
  /** An accessor (get) method for the id variable */
  public int getId() {
    return id;
  }
  
  /** A mutator (set) method for the graduationYear variable */
  public void setGraduationYear(int newYear) {
    graduationYear = newYear;
  }
  
  /** A mutator (set) method for the id variable */
  public void setId(int newId) {
    id = newId;
  }
  
  /** 
   * A method that overrides the printInfo() method of the 
   * parent class (Person) 
   */
  public void printInfo() {
    // first, call the parent's printInfo() method
    // in order to print the name and the age
    super.printInfo();
    
    // then print the graduation year and id
    System.out.println("My graduation year is: " + graduationYear +
                       ", and my student id is " + id);
  }            

  public boolean equals(Object object) {
    if (object instanceof Student) {
      Student s = (Student) object;
      
      if (super.equals(s) &&
          graduationYear == s.graduationYear &&
          id == s.id)
        return true;
    }
    
    return false;  
  }
 
}