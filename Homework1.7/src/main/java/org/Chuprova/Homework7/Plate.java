package org.Chuprova.Homework7;

public class Plate {

    private int food;
    private Cat[] cat;
    MainClass mainC = new MainClass();

    public Plate(int food, Cat[] cat) {
        this.cat = cat;
        this.food = food;
    }
    public void decreaseFood(int n, int i) {
        if(n <= food)
        {
            food -= n;
            System.out.println("В тарелке осталось " + food + " еды ");
            cat[i].satiety = true;
        }
        else
        {
            System.out.println("В тарелке недостаточно еды ");
        }
    }

    public void increaseFood(int k)
    {
        food += k;
        System.out.println("В тарелку добавили " + k + " еды ");
    }

    public void info() {
        System.out.println("plate: " + food);
    }
}
