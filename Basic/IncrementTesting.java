/*Testing on the difference betweeen ++ before and after a variable 
 * @ author :Eddy Kubwimana
 */

public class IncrementTesting{

    
    public static void main(String[] args){
         
        //Declaration and initialization of variables

        int numberOftry = 5;
        int firstNumber = 5;
        int thirdNumber = 5;

        //Testing of the operators of how they work using the variables above
         double result1 = numberOftry*(++firstNumber);
         double result2 = numberOftry*(firstNumber++);

         // getting the output to check their difference

         System.out.println( "umberOftry*(++firstNumber) result is :" + result1 + "  numberOftry*(firstNumber++) result is : "+ result2);
        
    

    }
}