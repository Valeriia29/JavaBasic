package HW.Arrays_13_03_2020;

public class main {
    public static void main(String args[])
    {
        System.out.println("Task 1: The sum of the elements is " + ArrayUtility.returnArrayElementsSum());
        //System.out.println(ArrayUtility.appendNewValue());
        int[] a=ArrayUtility.appendNewValue();
        for(int i =0;i<a.length;i++)
        {
            System.out.println("Task 2: The element of the new array is: " + a[i]);
        }
    }
}
