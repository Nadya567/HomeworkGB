package org.Chuprova.homework2;

public class Homework2 {
    public static void main(String[] args) {
        //Number 1
        System.out.println("Номер 1:");
        int arr[] = {1, 0, 0, 1, 1, 0, 1, 1, 0, 0};
        ChangeArray(arr);
        System.out.print("\n");

        //Number 2
        System.out.println("Номер 2:");
        int arr2[] = new int[8];
        FillArray(arr2);
        System.out.print("\n");

        //Number 3
        System.out.println("Номер 3:");
        int arr3[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        MultiplyArray(arr3);
        System.out.print("\n");

        //Number 4
        System.out.println("Номер 4:");
        int arr4[][] = new int[5][5];
        FillArrayByOne(arr4);
        System.out.print("\n");

        //Number 5
        System.out.println("Номер 5:");
        int arr5[] = {1, 4, 2, 7, 5, 9, 3, 0};
        MinMaxElements(arr5);
        System.out.print("\n");

        //Number 6
        System.out.println("Номер 6:");
        int arr6[] = {2, 2, 2, 1, 2, 2, 10, 1};
        //EqualArrayPartsCheck(arr6);
        System.out.print("\n");
    }

    public static void ChangeArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
                arr[i] = 1;
            else
                arr[i] = 0;
        }

        System.out.println("Массив после изменений:");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }

    }

    public static void FillArray(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = i * 3;
        }

        System.out.println("Новый массив после изменений:");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }

    public static void MultiplyArray(int[] arr)
    {
        int i = 0;
        System.out.println("Новый массив после преобразований:");
        while(i < arr.length)
        {
            if(arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
            i++;
        }
    }

    public static void FillArrayByOne(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr.length; j++)
            {
                if(i == j)
                {
                    arr[i][j] = 1;
                }
            }
        }
    }

    public static void MinMaxElements(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] < min)
                min = arr[i];
            if(arr[i] > max)
                max = arr[i];
        }

        System.out.println("Минимальный элемент массива: " + min);
        System.out.println("Максимальный элемент массива: " + max);
    }

    public static void EqualArrayPartsCheck(int[] arr)
    {
        int rightSum = 0;
        int leftSum = 0;
        boolean check = false;

        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < i; j++)
            {
                leftSum += arr[j];
            }

            for (int j = i; j < arr.length; j++)
            {
                rightSum += arr[j];
            }

            if(leftSum == rightSum)
            {
                check = true;
            }
        }

        System.out.println("" + check);
    }
}
