import java.util.Scanner;
public class GraduationHonor{

    public static void main( String[] args){
        System.out.println("Enter your GPA : ");
        Double studentGpa = 0.0;
        double checker = 1;
        while (checker == 1.0 ){
           try{ 
            Scanner input = new Scanner(System.in);
            studentGpa = input.nextDouble();
            checker = studentGpa/5;
           }
           catch (Exception e) {
            
            System.out.println(" The GPA is not valid, try again");
            checker = 1.0;
           }
            

        }
        

        if ( studentGpa >= 3.85 && studentGpa<= 4.0){
            System.out.println("Summa Cum Laude ");
        }else if (studentGpa>= 3.7){
            System.out.println("Magma Cum Laude ");
        
        } else {
            System.out.println("Hello");
        }

    }
}