public abstract class Polygon extends TwoDShape {
    protected int sides;
    protected boolean isPolygon;
    public Polygon (String name, String colour, boolean isPolygon, int sides){
        super(name, colour);
        this.sides = sides;
        this.isPolygon = isPolygon;
    
    }   

    public boolean isPolygon(){
        return isPolygon;
    }

    public int getNumberSides(){
        return this.sides;
    }



    

}
