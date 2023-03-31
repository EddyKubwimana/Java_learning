public abstract class TwoDShape extends Shape {

    public TwoDShape(String name, String colour){
        super(name, colour, false);
    }

    public abstract double computeArea();
    public abstract double computePerimeter();
    public abstract void draw();
}