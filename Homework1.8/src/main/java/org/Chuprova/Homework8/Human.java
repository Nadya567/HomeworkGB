package org.Chuprova.Homework8;

public class Human {
    int dist = 100;
    int height = 1;

    public static void Run(int n, int dist)
    {
        System.out.println("Человек бежит ");

        if(n >= dist)
        {
            System.out.println("Человек пробежал ");
        }

        else
        {
            System.out.println("Человек не пробежал ");
        }
    }

    public static void Jump(int n, int heigth)
    {
        System.out.println("Человек прыгает ");

        if(n >= heigth)
        {
            System.out.println("Человек перепрыгнул ");
        }
        else
        {
            System.out.println("Человек не прыгнул ");
        }
    }
}
