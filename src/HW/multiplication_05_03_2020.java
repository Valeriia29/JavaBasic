package HW;

import java.util.Scanner;
import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.pow;

public class multiplication_05_03_2020 {

    public static   double Left(double a,double b){
            return pow(a,2)+2*a*b+pow(b,2);
        }

        public static double Right(double c, double d)
        {
            return  pow((c + d), 2);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите a");
            double  a = scanner.nextDouble();
            System.out.println("Введите b");
            double b = scanner.nextDouble();
            //  double ResLeft=Left(a,b);
            //double ResRight=Right(a,b);
            if (Left(a,b) == Right(a,b)) {
                System.out.print("The result is " + Left(a,b));
            } else {
                System.out.print("The results are not matched");
            }
        }}


