
//Eddy KUBWIMANA
//ID:83092025

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class programOne{
    public static void main(String[] args){
        System.out.println("Enter a list of positive numbers one per line.");
        System.out.println("use a negative number to indicate the end of input.");
        Scanner keyboard = new Scanner (System.in);
        int num= keyboard.nextInt();
        int even, odd,zeros;
        even=0;
        odd=0;
        zeros=0;
        while(num>=0){
            if (num==0){
                zeros+=1;

            }
            
           else if (num%2==0){
            even+=1;

           }
           else{
            odd+=1;
           }

     num= keyboard.nextInt();
    }
System.out.println("Thank you");
System.out.println("you entered  "+ even + " even numbers and  " + odd + " odd numbers and  " + zeros +"zeros");
  
}
}