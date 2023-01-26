import java.util.Scanner;

public class find_average{
    public static void main(String[] args){
        
        // Greetings and taking users names

        System.out.println("\n Hello there, Hope you are doing well");
        System.out. println(" I am going to ask the name of player number 1 and player number to make it easier to play for you guys!!!");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Who want to be player 1? Please enter the name you want that I refer to throughout the game");
        String playerOneName = keyboard.nextLine();
        System.out.println("Who want to be player 2? Please enter the name you want that I refer to throughout the game");
        String playerTwoName = keyboard.nextLine();

        // Taking the number of  stones to play

        System.out.println("How many cards you want to play guys???");
        int numberStones = 0;
        int check = 0;

        /* while loop combined with error handling try and catch to ensure that the program 
        does not break when the user enter a string or char */

        while (check!= 1){
            try{
                Scanner stoneTake = new Scanner(System.in);
                int input = stoneTake.nextInt();
                if(input> 0 &&  input %2==1){
                    check =1 ;
                    numberStones= input;
    
                }
                else{
                    System.out.println("you did not enter a positive odd number, Please try again!");
                }
    
            
            }
            catch (Exception e){
                System.out.println("you did not enter a positive odd number, Please try again!");

            }
            
            
        }
            
        /* second loop to keep player playing depending on the number of stones 
        The loop gives player chance to play using using the variable checker which is incremented by one 
        whenever the player draw stones. If checker is odd, it is player one turn, otherwise, it is player two turn*/  

        int counter = 1;
        int playerOneStones = 0;
        int  playerTwoStones= 0;
        while( numberStones>0){
             
            // conditional statement to identify whose player is going to play

            if (counter%2 == 0){

                // Resume for game status

                System.out.println(playerOneName+ " has already drawn " + playerOneStones);
                System.out.println(playerTwoName+ " has already drawn " + playerTwoStones);

                System.out.println("Stones status :" + numberStones );  
                System.out.println("It is your turn  " + playerTwoName + " : "+ " How many stones are you drawing ?");
                 
                // taking user 
                int drawData = keyboard.nextInt();
                if (drawData<= numberStones){
                    numberStones -= drawData;
                    playerTwoStones+= drawData;
                    counter+= 1;
                }
                else{
                    System.out.println("Sorry " + playerTwoName + " : "+ " The stones you draw are greater than the half of stones");
                    counter+= 0;

                }
            }
            else{
                
                // Resume of the game status

                System.out.println(playerOneName+ " has already drawn " + playerOneStones);
                System.out.println(playerTwoName+ " has already drawn " + playerTwoStones);

                System.out.println("Stones status :" + numberStones );  
                System.out.println("It is your turn  " + playerOneName + " : "+ " How many stones are you drawing?");
                 
                // taking player stones numbers

                int drawData = keyboard.nextInt();
                if (drawData<= numberStones){
                    numberStones-= drawData;
                    playerOneStones+= drawData;
                    counter+= 1;


                }
                else{
                    System.out.println("Sorry " + playerOneName + " : "+ " The stones you draw are greater than the half of the stones");
                    counter+= 0;

                }

            }
                

            }
        /* That is where the program declare result for players , here i the conditional statement check the player
         * whose stones number is odd and declare him a winner
         */

        if ( playerOneStones %2 == 1){
            System.out.println("Congratulations " + playerOneName + "  You are the winner");

        }
        else{
            System.out.println("Congratulations " + playerTwoName + "  You are the winner");
        }
    }
}
        
