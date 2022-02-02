package org.Chuprova.Homework6;

public class Dog extends Animals{

    @Override
    void Run(float distance) {

        if(distance < 500)
        {
            System.out.println("Собака пробежала " + distance + " метров");
        }
        else
        {
            System.out.println("Собака не сможет пробежать так много ");
        }
    }

    @Override
    void Swim(float distance) {
        if(distance < 10)
        {
            System.out.println("Собака проплыла " + distance + " метров");
        }
        else
        {
            System.out.println("Собака не сможет проплыть так много ");
        }

    }
}
