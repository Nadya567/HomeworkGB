package org.Chuprova.Homework8;

public class Robot {

    int dist = 500;
    int height = 2;

    public static void Run(int n, int dist)
    {
        System.out.println("Робот бежит ");

        if(n >= dist)
        {
            System.out.println("Робот пробежал ");
        }
        else
        {
            System.out.println("Робот не пробежал ");
        }
    }

    public static void Jump(int n, int heigth)
    {
        System.out.println("Робот прыгает ");

        if(n >= heigth)
        {
            System.out.println("Робот перепрыгнул ");
        }
        else
        {
            System.out.println("Робот не прыгнул ");
        }
    }
}
