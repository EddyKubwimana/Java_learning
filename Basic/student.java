/*
 * Class learning of class creation and constructor
 * version : 1.0.2
 * @author : Eddy Kubwimana
 * Email: eddy.kubwimana@ashesi.edu.gh
 */

public class student{
    private String name;
    private int age;
    // constructor of proof method
    public void setAge(int age){
        if (age< 0){
            this.age = 0;
            
        } else{
            this.age = age;
        }

    }
    public String proof(){
        return "see you in class!";// string returned when this method  is called on an object
    
    }
    // constructor of proof method with two parameter
    public void proof( String name, int age){
        this.name = name;// string of student name
        this.age = age;// int of student name
    }
    //constructor for printing student object
    public String print(){

        return " you are a dumbass " + this.name + " with your "+ this.age;// returned when this method is called;
    }

    public static void main(String[] args){
        // create of student of object
        student Eddy = new student();

        // test by saying how the method works


        // testing the second method
        System.out.println();

        //using a setter to change the age of a student

        Eddy.setAge(7);
        Eddy.name = "Eddy Kubwimana";

        //retest the Eddy object
        System.out.println(Eddy.name + " "+ Eddy.age);
        System.out.println(Eddy.print());



    }
}