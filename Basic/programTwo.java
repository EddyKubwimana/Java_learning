//Eddy Kubwimana
//ID:83092025

import java.util.Scanner;
public class programTwo{

    public static void main (String[] args){
        System.out.println("How many classes did you take this semester?");
        Scanner keyboard = new Scanner( System.in);
        int n= keyboard.nextInt();
        double totalPoints, totalCredits;
        totalPoints=0.00;
        totalCredits=0.00;
        Double credits;
        String letter;
        double points;
        for (int i=1; i<n+1; i= i+1 ){
            System.out.println("How many credits was course  " + i +  "  ?");

            credits = keyboard.nextDouble();
            keyboard.nextLine();
    
            System.out.println("what was your letter grade? ");

            letter = keyboard.nextLine();

            if (letter.equalsIgnoreCase("A")){
                points = 4.0;

            }
            else if (letter.equalsIgnoreCase("B+")){
                points = 3.5;

            }
            else if (letter.equalsIgnoreCase("B")){
                points = 3;

            }
            else if (letter.equalsIgnoreCase("C+")){
                points= 2.5;
            }
            else if (letter.equalsIgnoreCase("C")){
                points= 2.0;
            }
            else if (letter.equalsIgnoreCase("D+")){
                points= 1.5;
            }
            else if (letter.equalsIgnoreCase("D")){
                points= 1.0;
            }
            else {
                points = 0;
            }



            totalCredits+=credits;
            totalPoints+= (points*credits);



        }
        double gpa=(totalPoints/totalCredits);
        System.out.println("you took  "+ totalCredits + "credits. ");
        System.out.println("your semester GPA was " + gpa);
    

    }
}