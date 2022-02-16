package org.Chuprova.Homework9;

public class MainClass {

    public static void main(String[] args){

        int sum;
        String[][] array = {{"1", "2", "3", "4"}, {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};
        String[][] arrayWrong = {{"*", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}, {"1", "2", "3", "4", "5"}};

        sum = SumArray(array);
        System.out.println("Получившаяся сумма = " + sum);
    }


    public static int SumArray(String[][] arr)
    {
        int temp;
        int sum = 0;
        int size;
        size = arr.length;

        if(size != 4)
        {
            try {
                throw new MyArraySizeException("Неправильный размер массива");
            }
            catch (MyArraySizeException e) {
                e.printStackTrace();
            }
        }


        for(int i = 0; i < size; i++)
        {
            for(int j = 0; j < size; j++)
            {
                if(CheckDigit(arr[i][j]))
                {
                    temp = Integer.parseInt(arr[i][j]);
                    sum += temp;
                }

                else
                {
                    try {
                        throw new MyArrayDataException("Элемент массива не число под номером: ", i, j);
                    }
                    catch (MyArrayDataException e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
        return sum;
    }

    public static boolean CheckDigit(String a)
    {
        char[] b;
        b = a.toCharArray();
        for(char simv : b)
        {
            if(!Character.isDigit(simv))
            {
                return  false;
            }
        }
        return true;
    }
}

class MyException extends Exception
{
    public MyException(String message)
    {
        super(message);
    }
}

class MyArrayDataException extends MyException
{
    public MyArrayDataException(String message, int i, int j)
    {
        super(message);
    }
}

class MyArraySizeException extends MyException
{
    public MyArraySizeException(String message)
    {
        super(message);
    }
}