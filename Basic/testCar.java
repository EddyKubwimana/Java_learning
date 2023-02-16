public class testCar{

public static void main( String[] args){
    // individual to test the car class
    Person p1 = new Person("Eddy",19, "Male");
    Person p2 = new Person( "Nicole", 16, "Female" );
    Person p3 = new Person( "Euphrasie", 21, "Female" );
    Person p4 = new Person( "Philbert", 30, "Male" );
    Person p5 = new Person( "Egide", 21, "Female" );
    Person p6 = new Person("Nao", 16, "Male");

    car toyota = new car();

    // test hasdriver method
    System.out.println("Does toyota have a driver "+toyota.hasDriver());


    // car isempty

    System.out.println("is toyota a empty "+toyota.isEmpty());

    // adding a driver

     toyota.setDriver(p1);
    // test hasdriver method again
     System.out.println("Does toyota have a driver "+toyota.hasDriver());

     // add passenger

      toyota.addPassenger(p2);
      toyota.addPassenger(p3);
      toyota.addPassenger(p4);

    //test if the car is full or empty
      System.out.println("is toyota a empty "+toyota.isEmpty());  
      System.out.println("is toyota a full "+toyota.isFull());
      System.out.println("occupants "+ toyota.getNumberOccupants());

    // test listriders
       toyota.listRiders();

    // adding one passenger and test if the car is full and number of occupants
     toyota.addPassenger(p5);
     System.out.println("is toyota a full "+toyota.isFull());
     System.out.println("occupants "+ toyota.getNumberOccupants());
     // adding a driver who is underage
     System.out.println(toyota.setDriver(p6));// return false because the driver is under age

     // add a passenger after the car is full

     System.out.println(toyota.addPassenger(p6));// return false because the driver is under age


     




       







}

}