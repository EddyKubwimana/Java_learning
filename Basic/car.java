public class car{
    private Person driver;
    private Person frontSeatPassenger;
    private Person backSeatPassenger1; 
    private Person backSeatPassenger2;
    private Person backSeatPassenger3;
    private int status;
    public car(Person driver){
        if (driver.getAge()> 18){
            this.driver = driver;
            this.status += 1;
            this.backSeatPassenger1 = null;
            this.backSeatPassenger2 = null;
            this.backSeatPassenger3 = null;
            this.frontSeatPassenger = null;
        } else{
            System.out.println("the driver is underage");
            System.exit(0);
        }
    }
    public car(){

        this.driver = null;
        this.backSeatPassenger1 = null;
        this.backSeatPassenger2 = null;
        this.backSeatPassenger3 = null;
        this.frontSeatPassenger = null;

    }

    public boolean hasDriver(){
        return this.driver != null;
    }

    public boolean hasPassenger(){
        return (this.backSeatPassenger1 == null
        ||this.backSeatPassenger2 == null ||
        this.backSeatPassenger3 == null ||
        this.frontSeatPassenger == null);
    }
    
    public boolean isEmpty(){
        
        return (this.driver == null&&
            this.backSeatPassenger1 == null
        && this.backSeatPassenger2 == null && 
        this.backSeatPassenger3 == null &&
        this.frontSeatPassenger == null);
    }

    public boolean isFull(){
        return (this.backSeatPassenger1 != null
        && this.backSeatPassenger2 != null && 
        this.backSeatPassenger3 != null &&
        this.frontSeatPassenger != null);
    }
    public boolean setDriver(Person driver){
        if (driver.getAge()> 18){
            this.driver = driver;
            this.status += 1;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean addPassenger(Person passenger){
        if (this.frontSeatPassenger == null){
            this.frontSeatPassenger = passenger;
            this.status += 1;
            return true;
        }else if (this.backSeatPassenger1 == null){
            this.backSeatPassenger1 = passenger;
            this.status += 1;
            return true;
        }
        else if (this.backSeatPassenger2 == null){
            this.backSeatPassenger2 = passenger;
            this.status += 1;
            return true;
        }

        else if (this.backSeatPassenger3 == null){
            this.backSeatPassenger3 = passenger;
            this.status += 1;
            return true;
        } else{
            return false;
        }
    }


    public int getNumberOccupants(){
            return this.status;

        }
    
    public void listRiders(){

        if (this.driver != null){
                System.out.println("The driver is :" + this.driver.getName()+ 
                " age : "+ this.driver.getAge());
        }

        if (this.frontSeatPassenger != null){
            System.out.println("frontseat passenger :" + this.frontSeatPassenger.getName()+ 
            " age : "+ this.frontSeatPassenger.getAge());
    
        }
        if (this.backSeatPassenger1 != null){
            System.out.println("backseat Passenger  1 is :" + this.backSeatPassenger1.getName()+ 
            " age : "+ this.backSeatPassenger1.getAge());
        }
        if (this.backSeatPassenger2 != null){
            System.out.println("backseat Passenger  2 is :" + this.backSeatPassenger2.getName()+ 
            " age : "+ this.backSeatPassenger2.getAge());
        }
        if (this.backSeatPassenger3 != null){
            System.out.println("backseat Passenger  3 is :" + this.backSeatPassenger3.getName()+ 
            " age : "+ this.backSeatPassenger3.getAge());
        }


        }

  
    public static void main(String[]args){
        Person person1 = new Person("Eddy", 10, "Male");
        car car2 = new car(person1);

        //System.out.println(car1.driver.getAge());
        System.out.println(car2.hasDriver());



    }

    
}

