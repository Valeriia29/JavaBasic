package HW.Arrays_13_03_2020;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class ArrayUtility {

           public  static int[] oldArray={1,2,8,77};
           public static int newValue=1;

        /**
         * Вернуть сумму элементов массива
         *
         *  Пример 1.: При вызове метода с аргументами old array = {1}, результат 1
         *  Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, результат 22
         */
        public static  int returnArrayElementsSum()
        {
            int  sum=0;
            for (int i=0;i<oldArray.length;i++)
                {
                    sum =sum+oldArray[i];
                }
            return sum;
        }

        /**
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
         *
         *  Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2, результат {1, 2}
         *  Пример 2.: При вызове метода с аргументами old array = {1, 2, 9, 10}, newValue=3, результат {1, 2, 9, 10, 3}
         */
        public static int[] appendNewValue()
        {
           int[] newArray=new int[oldArray.length+1];
            for (int i=0;i<oldArray.length;i++)
            {
                newArray[i]=oldArray[i];

            }
           newArray[newArray.length-1]=newValue;
            return newArray;
        }

        /**
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, включающий все старые значения массива + новое значение
         *         *  Пример 1.: При вызове метода с аргументами old array = {1}, newValue=2,
         *         secondNewValue=3, результат {1, 2, 3}
         *  Пример 2.: При вызове метода с аргументами
         *      old array = {1, 2, 9, 10}, newValue=3, secondNewValue = 10000, результат {1, 2, 9, 10, 3, 10000}
         */
        public static int[] appendNew2Values(int[] oldArray, int newValue, int secondNewValue)
        {
            return oldArray;
        }

        /**
         * Задача метода получить на вход 2 массива,
         * на выхоже вернуть новый массив, включающий все значения обоих массивов
         *
         *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 1, 3}
         *  Пример 2.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {}, результат {1, 2}
         */
        public static int[] appendNewValues(int[] oldArray1, int[] oldArray2)
        {
            return oldArray1;
        }

        /**
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, в котором не будет значений равных value
         *
         *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1}
         *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12, 2}, value=2, результат {100, 12}
         */
        public static int[] deleteAllSameValuesFromArray(int[] oldArray, int value)
        {
            return oldArray;
        }

        /**
         * Задача метода получить на вход 2 массива,
         * на выхоже вернуть новый массив, включающий все значения обоих массивов, без повторов
         *
         *  Пример 1.: При вызове метода с аргументами oldArray1 = {1, 2}, oldArray1 = {1, 3}, результат {1, 2, 3}
         *  Пример 2.: При вызове метода с аргументами oldArray1 = {11, 2}, oldArray1 = {10000}, результат {11, 2, 10000}
         */
        public static int[] appendAllUniqueValues(int[] oldArray1, int[] oldArray2)
        {
            return oldArray1;
        }

        /**
         * Задача метода получить на вход массив и еще одно число,
         * на выхоже вернуть новый массив, в котором будет присутствовать новое значение и
         * массив будет отсортирован по возрастанию
         *
         *  Пример 1.: При вызове метода с аргументами old array = {1, 1, 1, 1}, value=2, результат {1, 1, 1, 1, 2}
         *  Пример 1.: При вызове метода с аргументами old array = {2, 100, 12}, value=22, результат {2, 12, 22, 100}
         */
        public static int[] appendNewValueAndSort(int[] oldArray, int value)
        {
            return oldArray;
        }
    }
