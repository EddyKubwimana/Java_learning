public class Freshman extends Student{
    
    private final int LEVEL = 100;
    private int numberCourse;


    public Freshman(String name, int age, int gradYear, int studentId, int numberCourse){
        super(name, age, gradYear, studentId);
        this.numberCourse = numberCourse;

    }

    public  String getNameFreshman(){

        return super.getName();
}


 public int getLevel(){

    return this.LEVEL;


 }

 public int getCourse(){
    return this.numberCourse;
 }



 public static void main (String[] args){

    Freshman Eddy = new Freshman("Eddy", 20, 2025, 83092025, 4);

    System.out.println(Eddy.getName()+ " "+ Eddy.getAge()+ " " + Eddy.getGraduationYear());



 }
    }
       