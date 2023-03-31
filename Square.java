
public class Square extends Polygon{
    private double lenside;
    public Square(String color, boolean isPolygon, int side, int lengthside ){

        super("Square", color, true, 4);
        this.lenside = lengthside;

    }

    public String getDescription(){
        return (getColour() + " " + getName()
                + " with side = " + lenside + "cm.");
    }

    public double computeArea(){
        return lenside*lenside;
    }

    public double computePerimeter(){
        return lenside*4;
    }

    public void draw() {

        if (super.isPolygon && super.sides==4  && this.lenside > 0){

        String[][]grid = new String[(int) this.lenside][(int) lenside];
    
        
             for ( int row = 0; row < grid.length; row++){

                for( int col =0; col < grid[row].length; col++){

                     grid[row][col]="   ";

                     if (row == 0 || row ==grid.length-1 || col == 0 ||col == grid[row].length-1){

                        System.out.print("0  ");
            
                     }else{System.out.print(grid[row][col]);
                    
                    }

                   
                
                }
                System.out.println();
            }

            
        }else{
            System.out.println("The data given does not represent a square");

        }
    }


    

    /* A method to test the Circle class */
    public static void main(String[] args){

        Polygon square = new Square("Red", true, 4, 10 );
        square.draw();

        System.out.println(square.getDescription());
        
        System.out.println(square.isPolygon());  
        
        System.out.println(square.getNumberSides());
       
        };




    }

