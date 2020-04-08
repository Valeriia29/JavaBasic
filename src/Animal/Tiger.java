package Animal;

public class Tiger {
    public  static int tigerCounter=0 ;
    private  int kittenCount=0;
     public String name="(empty)";

     public Tiger()
     {
         tigerCounter=tigerCounter+1;

     }

     public  void addOneMore()
     {
         kittenCount=kittenCount+1;
     }
     public int getCurrentCounter()
     {
         int currentKittenCount=kittenCount;
         return kittenCount;
     }
}
