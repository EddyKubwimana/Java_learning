import Person_;
public class assignment{
public static void main(String[] args){
    double suzukiPrice = 12000;
    double harleyPrice = 2000;
    Person_ girl = new Person_("Anisa", 21, "female");
    
    Person_ woman = new Person_("Mansah", 39, "female");
    Person_ guy = new Person_("kofi",25, "male");


    Person_ eddy = girl;

    Motorbike bike = new Motorbike(eddy, suzukiPrice);
    Person_ theBoss = bike.getOwner();
    
    theBoss.setName("zoey");
    System.out.println("Bike Owner  :"+ bike.getOwnersName() );
    System.out.println("Girl: "+ girl.getName());


   



}
}