public class IntegerInputTest{

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
