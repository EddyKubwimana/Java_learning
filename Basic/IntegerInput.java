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
        int value = 0;
        // do  while loop to check if the user entered accepted input
      do { 

         int checker = 0;
       do{
         // prompt the user to know what to input
         System.out.println(this.prompt);
         
         try{
          Scanner key= new Scanner(System.in); // scanner object
          value = key.nextInt();
          int verifier  = value/2;
          checker = 1;

         }catch( Exception e){
          System.out.println(" invalid input, please enter an integer");
         }

       }
       while (checker == 0);
        
        if (value > this.maximum || value < this.minimum){
          System.out.println("the numbers does not respect this instruction  "+ this.prompt +"  please try again!");

        }
        
        // condition to check if the value input is accepted
      } while (value > this.maximum || value < this.minimum );
      
      // int return from the user if accepted
      return value;


    
    } 

    

}