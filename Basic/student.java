/*
 * Class learning of class creation and constructor
 * version : 1.0.0
 * @author : Eddy Kubwimana
 * Email: eddy.kubwimana@ashesi.edu.gh
 */

public class student{
    String name;
    int age;
    // constructor of proof method
    public String proof(){
        return "see you in class!";// string returned when this method  is called on an object
    
    }
    // constructor of proof method with two parameter
    public String proof( String name, int age){
        this.name = name;// string of student name
        this.age = age;// int of student name
        return " you are a dumbass " + this.name + " with your "+ this.age;// returned when this method is called
    }
    public static void main(String[] args){
        // create of student of object
        student Eddy = new student();

        // test by saying how the method works

        System.out.println(Eddy.proof());

        // testing the second method
        System.out.println(Eddy.proof("Eddy", 23));

    }
}