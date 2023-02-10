
class Motorbike{
    private Person_ owner;
    private double price;
    

    public Motorbike(Person_ theOwner, double cost){
       this.owner = theOwner;
       this.price = cost;
    }

    public void setPrice( double newPrice){
        this.price = newPrice;

        
    }
    public Person_ getOwner(){
        return owner;


    }

    public String getOwnersName(){
        return owner.getName();
    }

    public double getPrice(){
        return price;
    }
}