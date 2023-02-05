/*
 * @author : Eddy Kubwimana
 * date ; 5/2/2023
 * Version : 1:0:0
 */
public class Person{
     
    /* instance values wiht default value, they are private to prevent
    use for entering invalid data 
    */

    private String namePerson ;// a name of the person 
    private int agePerson ;// an int representing age of person
    private  String genderPerson ;// gender of person,

    // constructor for the object person: takes namePerson, genderPerson and agePerson
    public void SetidPerson(String namePerson, String genderPerson , int agePerson  ){
        this.namePerson = namePerson;
        this.genderPerson = genderPerson;
        this.agePerson = agePerson;
    }
    //setter for agePerson
    public void setAgePerson(int agePerson){
        if (agePerson>0){
            this.agePerson = agePerson;
        }
        

    }
    // setter for namePerson
    public void setNamePerson(String namePerson){
        this.namePerson = namePerson;
    }
    // setter for genderPerson
    public void setGenderPerson(String genderPerson){
        if ( genderPerson.equalsIgnoreCase("female") || genderPerson.equalsIgnoreCase("male")){
            this.genderPerson = genderPerson;
        }

    }
    
    // getter for namePerson
    public String getNamePerson(){
        return this.namePerson;
    }

    // getter for genderPerson

    public String getGenderPerson(){
        return this.genderPerson;
    
    }
    // getter for agePerson

    public int getAgePerson(){
        return this.agePerson;
    }

    // getter for the whole object
    public String getIdPerson(){

        return " The name is : "+ this.namePerson+ ", Gender : "+ this.genderPerson + " ,Age : "+ this.agePerson;
    }

    public static void main(String[] args){

        Person person1 = new Person();

        // Setting the person identification

        person1.SetidPerson("Eddy", "female", 22 );

        // testing if the getIdperson method
        
        System.out.println(person1.getIdPerson());
        

        // testing the setters

        person1.setGenderPerson("male");
        person1.setAgePerson(50);
        person1.setNamePerson("KUBWIMANA");

        // verify if they both works 

        System.out.println(person1.getIdPerson());

    }
    }
