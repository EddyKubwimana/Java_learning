import java.util.Scanner;

public class find_average{
    public static void main(String[] args){
        
        // Greetings and taking users names

        System.out.println("\n Hello there, Hope you are doing well");
        System.out. println(" I am going to ask the name of player number 1 and player number to make it easier to play for you guys!!!");
        System.out.println();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Who want to be player 1? Please enter the name you want that I refer to throughout the game");
        String name1 = keyboard.nextLine();

        // Taking the number of cards to play
        
        System.out.println("Who want to be player 2? Please enter the name you want that I refer to throughout the game");
        String name2 = keyboard.nextLine();
        System.out.println("How many cards you want to play guys???");
        int numberCard = 0;
        int check = 0;
        while (check!= 1){
            int input = keyboard.nextInt();
            if(input> 0 &&  input %2==1){
                check =1 ;
                numberCard = input;

            }
            else{
                System.out.println("you did not enter a positive odd number, Please try again!");
            }

        }
            
            
        int counter = 1;
        int cards1 = 0;
        int  cards2 = 0;
        while( numberCard>0){
            if (counter%2 == 0){
                System.out.println("Deck status :" + numberCard );  
                System.out.println("It is your turn  " + name2 + " : "+ " How many cards are choosing?");
                int data = keyboard.nextInt();
                if (data<=numberCard){
                    numberCard -= data;
                    cards2+= data;
                    counter+= 1;


                }
                else{
                    System.out.println("Sorry" + name2 + " : "+ " The cards you draw are greater than the ones left in the deck, as punishment, " + " it is "+ name1+ " turn");
                    counter+= 1;

                }
            }
            else{
                System.out.println("Deck status :" + numberCard );  
                System.out.println("It is your turn  " + name1 + " : "+ " How many cards are choosing?");
                int data = keyboard.nextInt();
                if (data <= numberCard){
                    numberCard -= data;
                    cards1+= data;
                    counter+= 1;


                }
                else{
                    System.out.println("Sorry" + name1 + " : "+ " The cards you draw are greater than the ones left in the deck, as punishment, " + " it is "+ name2+ " turn");
                    counter+= 1;

                }

            }
                

            }

        if ( cards1%2 == 1){
            System.out.println("Congratulations " + name1 + "  You are the winner");

        }
        else{
            System.out.println("Congratulations " + name2 + "  You are the winner");
        }
    }
}
        
