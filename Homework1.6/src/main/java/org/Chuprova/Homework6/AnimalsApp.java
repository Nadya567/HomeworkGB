package org.Chuprova.Homework6;

public class AnimalsApp {

    public static void main(String[] args){
        Animals animal = new Animals();
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.Run(25);
        cat.Swim(55);
        dog.Run(150);
        dog.Swim(68);
    }
}
