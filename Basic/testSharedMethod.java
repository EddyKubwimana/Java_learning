public class testSharedMethod{

    public static void main(String[] args){
        
        sharedMethod ora1 = new sharedMethod("embe", 20);
        
        sharedMethod ora2 = new sharedMethod("save", 20);
        System.out.println(ora2.getKind());
        sharedMethod.setKind("Mangoes");
        System.out.println(ora2.getKind());
        System.out.println(sharedMethod.getKind());


    }
}