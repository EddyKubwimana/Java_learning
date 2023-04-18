public abstract class threeDShape extends Shape {
    protected String type;
    public  threeDShape(String name, String colour , String type){

        super(name, colour, true);
        this.type = type;
    }

    public abstract double computeVolume();
    public abstract double computeSurfaceArea();
    public abstract void draw();
}