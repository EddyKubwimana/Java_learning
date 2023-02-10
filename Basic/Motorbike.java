class Motorbike{
    private Person owner;
    private double price;
    

    public Motorbike(Person owner, double cost){
       this.owner = owner;
       this.price = cost;
    }

    public void setPrice( double newPrice){
        this.price = newPrice;

        
    }
    public Person getOwner(){
        return this.owner;


    }

    public String getOwnersName(){
        return this.owner.getName();
    }

    public double getPrice(){
        return this.price;
    }
}