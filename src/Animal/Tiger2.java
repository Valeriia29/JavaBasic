package Animal;

public class Tiger2 {
    private static int kittenCount=0;
    public static void addOneMore()
    {
        kittenCount=kittenCount+1;
    }
    public static int getCurrentCounter()
    {
        int currentKittenCount=kittenCount;
        return kittenCount;
    }
}
