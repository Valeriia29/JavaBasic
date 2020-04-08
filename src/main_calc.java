import java.util.Scanner;

public class main_calc {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        double  a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        double c=Calc.SUM(a,b);
        System.out.println(c);
        System.out.println(Calc.Minus(a,b));
        System.out.println(Calc.multiplier(a,b));
        System.out.println(Calc.Division(a,b));


    }
}
