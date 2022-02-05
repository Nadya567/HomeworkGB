package org.Chuprova.Homework8;

public class Cat {

    int dist = 200;
    int height = 3;

    public static void Run(int n, int dist)
    {
        System.out.println("Кот бежит ");

        if(n >= dist)
        {
            System.out.println("Кот пробежал ");
        }
        else
        {
            System.out.println("Кот не пробежал ");
        }
    }

    public static void Jump(int n, int heigth)
    {
        System.out.println("Кот прыгает ");

        if(n >= heigth)
        {
            System.out.println("Кот перепрыгнул ");
        }

        else
        {
            System.out.println("Кот не прыгнул ");
        }
    }
}
