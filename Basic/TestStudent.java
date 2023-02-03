/*testing the property of private and public variable using student class
 * @author : Eddy Kubwimana
 * @email : eddy.kubwimana@ashesi.edu.gh
 * date_created: 2/03/2023
 * version: 1:0: 0
 */

// importing the student object
import student; 

public class  TestStudent{
    public static void main (String[] args){
        //instance of student object
        student Eddy = new student();
        Eddy.proof("Eddy", 20);
        Eddy.setAge(4);
        System.out.println(Eddy.print());

    }

}