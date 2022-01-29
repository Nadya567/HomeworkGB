package org.Chuprova.Homework1;

public class Homework1 {

    public static void main(String[] args)
    {
        //Number 2
        int a = 5;
        double b = 25.54;
        float f = 45.34f;
        short s = 1;
        long l = 10000000;
        boolean tr = true;
        byte n = 1;
        char simv = ')';

        //Number 3
        float result3 = CountFormula(4.5f, 1.5f, 8.1f, 0.9f);
        System.out.println("Ответ на номер 3: \n" + result3);
        System.out.print("\n");

        //Number 4
        boolean check4 = CheckSum(5, 9);
        System.out.println("Ответ на номер 4: \n" + check4);
        System.out.print("\n");

        //Number 5
        System.out.println("Ответ на номер 5:");
        CheckPositiveOrNegative(5);
        System.out.print("\n");

        //Number 6
        System.out.println("Ответ на номер 6: \n" + CheckPositiveOrNegativeBool(7));
        System.out.print("\n");

        //Number 7
        System.out.println("Ответ на номер 7:");
        PrintHello("Валера");
        System.out.print("\n");

        //Number 8
        System.out.println("Ответ на номер 8:");
        LeapYear(2001);
        System.out.print("\n");
    }

    public static float CountFormula(float a, float b, float c, float d)
    {
        return a * (b + (c / d));
    }

    public static boolean CheckSum(int a, int b)
    {
        int sum = a + b;
        boolean check;

        if(sum > 10 && sum <= 20)
            check = true;
        else
            check = false;

        return check;
    }

    public static void CheckPositiveOrNegative(int number)
    {
        if(number >= 0)
            System.out.println("Передано положительное число");
        else
            System.out.println("Передано отрицательное число");
    }

    public static boolean CheckPositiveOrNegativeBool(int number)
    {
        return number < 0;
    }

    public static void PrintHello(String name)
    {
        System.out.println("Привет, " + name + "!");
    }

    public static void LeapYear(int year)
    {
        if(((year % 4 == 0) && (year % 100 != 0)) || ((year % 4 == 0) && (year % 400 == 0)))
            System.out.println("Год " + year + " високосный");
        else
            System.out.println("Год " + year + " невисокосный");
    }
}
