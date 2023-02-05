/*testing of the class Person
 * @author : Eddy Kubwimana
 * date : 5/2/2023
 */
public class TestPerson{
    
    public static void main(String[]args){

        Person person1 = new Person();
        Person person2 = new Person();
        person1.SetidPerson("Joseph", "male", 33);
        person2.SetidPerson("Eddy", "Male", 10);
        
        // checking the person1 and 2 identities:

        // person 1 identification
        System.out.println(person1.getIdPerson());

        // person 2 identification
        System.out.println(person2.getIdPerson());

        // Setting different names, ages, and gender to both them
        // for  person 1, I used a negative negative number and it won't accept it, it will keep the old age
        person1.setAgePerson(-20);

        // here person 2 age is going to change
        person2.setAgePerson(10);

        // checking identities again

        // person 1 identification
        System.out.println(person1.getIdPerson());

        // person 2 identification
        System.out.println(person2.getIdPerson());
 

        

        


    }
}