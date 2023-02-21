public class sharedMethod{
    private String thing;
    private int value;
    static String kind = "Orange";

    public sharedMethod(String thing, int value){
        this.thing = thing;
        this.value = value;

    }

    public String getThing(){
        return this.thing;
    }

    public int getValue(){
        return this.value;
    }

    public static String getKind(){
        return kind;
    }
    
    
}