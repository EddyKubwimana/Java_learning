import java.util.Scanner;

public class firstProgram {

    public static void main(String[] args ){
        String StudA;
        String StudB;
        String StudC;

        int gradeA;
        int gradeB;
        int gradeC;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the student 1 name");
        StudA = keyboard.nextLine();
        System.out.println("Please enter the student 2 name");
        StudB = keyboard.nextLine();
        System.out.println("Please enter the student 3 name");
        StudC = keyboard.nextLine();

        System.out.println("Please enter the student 1 grade:");
        gradeA = keyboard.nextInt();
        System.out.println("Please enter the student 2 grade:");
        gradeB = keyboard.nextInt();
        System.out.println("Please enter the student 3 grade:");
        gradeC = keyboard.nextInt();

        System.out.println("Name1:" +" "+ StudA + " " +"Name2:"+ " " +StudB + " "+ "Name 3:" + " " +StudC);

        System.out.println("The average grade is:");
        float averageGrade = (gradeA+gradeB+gradeC)/3;
        System.out.println("The average grade score");
        System.out.println(averageGrade);

    }
}
