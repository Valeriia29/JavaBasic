public class MAIN {
//    public static boolean isCorrectSum()
//    {
////        boolean result3=sum(3,2)==4;
////        boolean result2=sum(20000000,3)==4;
////        boolean result1=sum2Values(2,2)==4;
////        return result1;
//    }
    public static int sum2Values(int firstArg,int secondArg)

    {
        return firstArg+secondArg;
    }
    public static void main(String[] args){
        int actualSum= sum2Values(2,10);
        int expectedSum=10;

        if (actualSum==expectedSum){
            System.out.println("true");
          }
        else
            {
                System.out.println("false");
            }

    }
}
