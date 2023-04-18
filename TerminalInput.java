public class TerminalInput{


    public static void main(String[]args){
       

        if(args[0].equals("add")){

            Double sum = Double.parseDouble(args[1])+ Double.parseDouble(args[2]);

            System.out.println(sum);
        
        }


         else if (args[0].equals("sub")){


            Double product = Double.parseDouble(args[1])*Double.parseDouble(args[2]);

            System.out.println(product);



         }




        }
}