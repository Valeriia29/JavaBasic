public class CorrectVariant {
    public static int LeftPart(int a, int b)
    {
    int result;
    result=(a+b)*(a+b);
    return result;
    }
public static int RightPart(int a1, int b1)
{
    int result=a1*a1+2*a1*b1+b1*b1;
    return result;

}

    public static void main(String[] args)
    {
        int a = 3;
        int b = 2;
       // int c=Calc.SUM(a,b);
     //   System.out.println(c);
      //  System.out.println(Calc.Minus(a,b));
        //int leftSideResult =LeftPart(a,b);
        //leftSideResult = здесь вызываем написанный метод, который считает левую часть и возвращает результат
        //int rightSideResult=RightPart(a,b);
        //rightSideResult = здесь вызываем написанный метод, который считает правую часть и возвращает результат
       // System.out.println("left side = ");
        //System.out.println(leftSideResult);rzhiл2912
        //System.out.println("right side = ");
        //System.out.println(rightSideResult);
        //вот здесь выводим на экран, true ЕСЛИ левая часть равна правой, иначе false
        //if (leftSideResult==rightSideResult){
        //    System.out.println("true");
       // }
        //else{
         //   System.out.println("false");
        //}//
    }

}