
/**
 * A class to represent a Worker, which is a more specialized version
 * of a Person
 */
public class Worker extends Person {
 
  private String profession;
  private double salary;
  
  /** A constructor */
  public Worker(String name, int age, 
                String inputProfession, double inputSalary){
    // Call the constructor of the parent (super) class
    super(name, age);
    
    // set the additional member variables
    profession = inputProfession;
    salary = inputSalary;
  }
  
  /** An accessor (get) method for the profession variable */
  public String getProfession() {
    return profession;
  }
  
  /** An accessor (get) method for the salary variable */
  public double getSalary() {
    return salary;
  }
  
  /** A mutator (set) method for the profession variable */
  public void setProfession(String newProfession){
    profession = newProfession;
  }
  
  /** A mutator (set) method for the salary variable */
  public void setSalary(double newSalary){
    salary = newSalary;
  }
  
  /** 
   * A method that overrides the printInfo() method of the 
   * parent class (Person) 
   */
  public void printInfo(){
    super.printInfo();
    System.out.println("My profession is " + profession + 
                       " and I earn " + salary);
  }
  
  public boolean equals(Object object) {
    if (object instanceof Worker) {
      Worker w = (Worker) object;
      
      if (super.equals(w) &&
          profession.equals(w.profession) &&
          salary == w.salary)
        return true;
    }
    
    return false;  
  }

}