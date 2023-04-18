public class Cube extends threeDShape{
protected double lenside;

public Cube(String name, String color, double lenside){

    super(name, color, "Cube");
    this.lenside = lenside;
}

public double computeVolume(){
    return lenside*lenside;
}
public double computeSurfaceArea(){
    return (lenside*lenside)*4;

}
public String getDescription(){
    return (getColour() + " " + getName()
            + " side = " + this.lenside + "cm." );}

            





public static void main(String[]args){

    threeDShape carre = new Cube("CARREE","Blue",20);
    System.out.println(carre.computeSurfaceArea());
    System.out.println(carre.computeVolume());
    System.out.println(carre.getDescription());
}
}