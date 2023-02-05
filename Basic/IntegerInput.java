/*creation of class for inputting an integer
 * @author : Eddy Kubwimana
 * date : 5/2/2023
 */
import java.util.Scanner;
public class IntegerInput{
    

    int maximum; // the highest possible input excluded
    int minimum; // the lowest possible input excluded
    String prompt; // String prompt to let the user know what to input
     
    // setInput method
    public void setInputParamaters(int maximum, int minimum, String prompt){

        this.maximum = maximum;
        this.minimum = minimum;
        this.prompt = prompt;
    }
    public int getValues(){
        // variable to store the input from the user
        int value;
        Scanner key= new Scanner(System.in); // scanner object 


        // do  while loop to check if the user entered accepted input
      do { 

        // prompt the user to know what to input
        System.out.println(this.prompt);

        value = key.nextInt();
        
        // condition to check if the value input is accepted
      } while (value > this.maximum || value < this.minimum );
      
      // int return from the user if accepted
      return value;


    
    } 

    public static void main(String[] args){

        // test
        IntegerInput interval = new IntegerInput();
        interval.setInputParamaters(20, -20, "Enter a number which is less than 20 and greater than - 20");
        int intValidinput = interval.getValues();
        System.out.println("The valid input is  :" + intValidinput);



        /*
         * In the game of stones, I would have created a class object to check valid input
         * It would have been helpful to shorten the code and ensure clarity when taking number of stones and when playeers
         * were choosing numbers of stones
         * 
         * 
         */


    }

}