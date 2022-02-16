package org.Chuprova.Homework11;

import java.util.ArrayList;

public class Sample01 {

    public static void main(String[] args)
    {
        //Number 1:
        Integer[] array = {1, 2, 3, 4, 5};
        ChangePlace(array, 2, 3);


        //Number 2:
        String[] arrayStr = {"a", "b", "c"};
        MakeList(arrayStr);

    }

    public static <T> void ChangePlace(T[] array, int a, int b)
    {
        T temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;

        System.out.println("Массив после перестановки: ");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }


    public static <T> void MakeList(T[] array)
    {
        ArrayList<T> newList = new ArrayList<T>();

        for(int i = 0; i < array.length; i++)
        {
            newList.add(array[i]);
        }

        System.out.println("\nПолучившийся ArrayList: ");
        for(int i = 0; i < newList.size(); i++)
        {
            System.out.print(newList.get(i) + " ");
        }
    }
}
