public abstract class Shape {
    protected String name;
    protected String colour;
    protected boolean is3D; // false if 2D and true if 3D

    public Shape(String name, String colour, boolean is3D){
        this.name = name;
        this.colour = colour;
        this.is3D = is3D;
    }

    public String getName(){
        return name;
    }
    
    public String getColour(){
        return colour;
    }

    public boolean isThreeDimensional(){
        return is3D;
    }

    public abstract String getDescription();
}