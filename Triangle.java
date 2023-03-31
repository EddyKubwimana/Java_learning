public class Triangle extends Polygon{
    private double base;
    private double height ;

    public Triangle(String color, boolean isPolygon, int side, double height, double base ){

        super("Triangle", color, true, 3);
        this.base = base;
        this.height = height;
        

    }

    public String getDescription(){
        return (getColour() + " " + getName()
                + " with base = " + this.base + "cm. and " + " with height = "+ this.height );
    }

    public double computeArea(){
        return (this.height*this.base)/2;
    }

    public double computePerimeter(){
        return this.base+this.height+ (this.base+this.height)/2;
    }

    public void draw() {

        if (super.isPolygon && super.sides==3  && this.base > 0){

        String[][]grid = new String[(int) this.height][(int) this.base];

             
             int counter = 0;
             for ( int row = 0; row < grid.length; row++){
                
                for( int col =0; col < grid[row].length; col++){

                     grid[row][col]="  ";

                     if (row == counter || row == grid.length-1|| col == 0 ){

                        
                            System.out.print(" 0");

            
            
                     }else{System.out.print(grid[row][col]);
                    
                    }
                    counter+= 1;
                   
                
                }
                System.out.println();
                counter=0;
                
            }

            
        }else{
            System.out.println("The data given does not represent a triang;e");

        }
    }


    

    /* A method to test the Circle class */
    public static void main(String[] args){

        Polygon triangle = new Triangle("red",true,3, 20,20);
        triangle.draw();

        System.out.println(triangle.getDescription());
        
        System.out.println(triangle.isPolygon());  
        
        System.out.println(triangle.getNumberSides());
       
        };




    }

