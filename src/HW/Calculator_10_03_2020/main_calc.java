package HW.Calculator_10_03_2020;

import java.util.Scanner;

public class main_calc {
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a");
        double  a = scanner.nextDouble();
        System.out.println("Введите b");
        double b = scanner.nextDouble();
        double c= Calc.SUM(a,b);
        System.out.println("The result of the addition is:  " + c);
        System.out.println("The result of the subtraction is:  " + Calc.Minus(a,b));
        System.out.println("The result of the multiplication is:  " + Calc.multiplier(a,b));
        System.out.println("The result of the division is:  " + Calc.Division(a,b));


    }
}
