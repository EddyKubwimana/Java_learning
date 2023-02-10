public class Person_{
    private String name;
    private int age;
    private String gender;

    public Person_(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getGender(){
        return this.gender;
    }

    public void setName( String name){
        this.name = name;
    }
    
}