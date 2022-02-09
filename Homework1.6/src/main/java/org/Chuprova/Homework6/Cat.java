package org.Chuprova.Homework6;

public class Cat extends Animals{

    @Override
    void Run(float distance) {
        if(distance < 200)
        {
            System.out.println("Кот пробежал " + distance + " метров");
        }
        else
        {
            System.out.println("Кот не сможет пробежать так много ");
        }

    }

    @Override
    void Swim(float distance) {
        System.out.println("Кот не умеет плавать ");
    }
}
