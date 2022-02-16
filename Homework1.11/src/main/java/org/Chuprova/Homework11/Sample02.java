package org.Chuprova.Homework11;

import java.util.ArrayList;

public class Sample02 {

    public static void main(String[] args) {

        Box box = new Box();
        Apple apple = new Apple();
        Orange orange = new Orange();
    }
}

class Fruit
{
    public <T> void AddFruit(ArrayList<T> list)
    {
    }
}

class Apple extends Fruit
{
    Float weight = 1.0f;
    ArrayList<Apple> appleBox = new ArrayList<Apple>();

    @Override
    public <T> void AddFruit(ArrayList<T> list) {
        super.AddFruit(list);
    }
}

class Orange extends Fruit
{
    Float weight = 1.5f;
    ArrayList<Orange> orangeBox = new ArrayList<Orange>();

    @Override
    public <T> void AddFruit(ArrayList<T> list) {
        super.AddFruit(list);
    }
}

class Box
{
    Apple apple = new Apple();
    Orange orange = new Orange();

    public <T> float getWeight(Float weight, ArrayList<T> list)
    {
        int count = list.size();
        return weight * count;
    }

    public boolean Compare(ArrayList<Apple> appleBox, ArrayList<Orange> orangeBox)
    {
        if(getWeight(apple.weight, appleBox) == getWeight(orange.weight, orangeBox))
            return true;

        else
            return false;
    }
}
