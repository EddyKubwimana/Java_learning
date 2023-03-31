
/**
 * A simple class that will serve as a base class for more
 * specialized classes (Student and Worker)
 */
public class Person
{
  private String name;
  private int age;
  
  /** A constructor */
  public Person (String personsName, int personsAge){
    name = personsName;
    age = personsAge;
  }
  
  /** A mutator (set) method for the name variable */
  public void setName(String newName){
    name = newName;
  }
  
  /** An accessor (get) method for the name variable */
  public String getName(){
    return name;
  }
  
  /** An accessor (get) method for the age variable */
  public int getAge(){
    return age;
  }
  
  /** A method to print information abou the Person */
  public void printInfo() {
    System.out.println("My name is " + name + ", and I am " +
                       age + " years old.");
  }
  
  
  public boolean equals(Object object) {
    
    if (object instanceof Person) {
      Person p = (Person) object;
      
      if (name.equals(p.name) &&
          age == p.age) {
        return true;
      }
    }
    
    return false;
  }
}